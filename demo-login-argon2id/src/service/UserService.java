package service;

import java.util.ArrayList;
import org.springframework.security.crypto.argon2.Argon2PasswordEncoder;
import model.User;

public class UserService {

    // List to store registered users
    private ArrayList<User> usersRegistered = new ArrayList<>();
    
    // Single instance of Argon2PasswordEncoder for password encoding
    private Argon2PasswordEncoder encoder = new Argon2PasswordEncoder(16, 16, 1, 47104, 1);

    // Method to register a new user
    public boolean registerUser(User user) {
        // Check if the user already exists
        if (userExists(user)) {
            return false;
        }

        // Encode the user's password
        String hashedPassword = encoder.encode(user.getPassword());
        
        // Set the encoded password
        user.setPassword(hashedPassword);
        
        // Add the user to the registered users list
        usersRegistered.add(user);

        return true;
    }

    // Method to check the login credentials of a user
    public boolean checkLogin(User user) {
        // Iterate over the registered users
        for (User registeredUser : usersRegistered) {
            // If the username matches
            if (registeredUser.getUsername().equals(user.getUsername())) {
                // Check if the password matches
                return encoder.matches(user.getPassword(), registeredUser.getPassword());
            }
        }
        // If no match is found, return false
        return false;
    }

    // Method to check if a user already exists
    private boolean userExists(User user) {
        // Iterate over the registered users
        for (User registeredUser : usersRegistered) {
            // If the username matches
            if (registeredUser.getUsername().equals(user.getUsername())) {
                // Return true indicating the user exists
                return true;
            }
        }
        // If no match is found, return false
        return false;
    }
}
