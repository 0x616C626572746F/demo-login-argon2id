# Demo de Registro y Login con Argon2id / Registration and Login Demo with Argon2id

## Español

Esta demostración consta de tres clases principales que simulan un sistema de registro y login de usuario utilizando el algoritmo Argon2id, considerado el más seguro según OWASP.

### Clases

1. **User**: Esta es una clase JavaBean que representa a un usuario en el sistema. Contiene información básica del usuario como nombre de usuario, contraseña, etc.
2. **UserMenu**: Esta clase simula un menú que permite al usuario registrarse o iniciar sesión en el sistema.
3. **UserService**: Esta clase actúa como un servicio que verifica si el login es correcto o no. La mayor parte de la lógica del programa se encuentra en esta clase, incluyendo la generación de hashes con el algoritmo Argon2id.

### Algoritmo Argon2id

El algoritmo Argon2id es un algoritmo de hash seguro para contraseñas. Fue seleccionado como el ganador del concurso de selección de funciones de contraseña (PHC) y es recomendado por OWASP.

### Propósito de la Demo

Esta demostración fue creada para implementar y probar las lógicas de registro y login de usuario utilizando el algoritmo Argon2id. Es útil para entender cómo se puede implementar este algoritmo en un sistema real.

Por favor, dirija su atención principalmente a la clase UserService para entender cómo se están generando los hashes con el algoritmo Argon2id.

Espero que esta demostración sea útil para cualquier implementación futura que pueda requerir.

## English

This demonstration consists of three main classes that simulate a user registration and login system using the Argon2id algorithm, considered the safest according to OWASP.

### Classes

1. **User**: This is a JavaBean class that represents a user in the system. It contains basic user information such as username, password, etc.
2. **UserMenu**: This class simulates a menu that allows the user to register or log in to the system.
3. **UserService**: This class acts as a service that verifies whether the login is correct or not. Most of the program's logic is found in this class, including the generation of hashes with the Argon2id algorithm.

### Argon2id Algorithm

The Argon2id algorithm is a secure hash algorithm for passwords. It was selected as the winner of the Password Hashing Competition (PHC) and is recommended by OWASP.

### Purpose of the Demo

This demonstration was created to implement and test user registration and login logics using the Argon2id algorithm. It is useful for understanding how this algorithm can be implemented in a real system.

Please direct your attention mainly to the UserService class to understand how hashes are being generated with the Argon2id algorithm.

I hope this demonstration will be useful for any future implementation that may require it.
