# Demo de Registro y Login con Argon2id

Esta demostración consta de tres clases principales que simulan un sistema de registro y login de usuario utilizando el algoritmo Argon2id, considerado el más seguro según OWASP.

## Clases

1. **Usuario**: Esta es una clase JavaBean que representa a un usuario en el sistema. Contiene información básica del usuario como nombre de usuario, contraseña, etc.

2. **Menú**: Esta clase simula un menú que permite al usuario registrarse o iniciar sesión en el sistema.

3. **Servicio**: Esta clase actúa como un servicio que verifica si el login es correcto o no. La mayor parte de la lógica del programa se encuentra en esta clase, incluyendo la generación de hashes con el algoritmo Argon2id.

## Algoritmo Argon2id

El algoritmo Argon2id es un algoritmo de hash seguro para contraseñas. Fue seleccionado como el ganador del concurso de selección de funciones de contraseña (PHC) y es recomendado por OWASP.

## Propósito de la Demo

Esta demostración fue creada para implementar y probar las lógicas de registro y login de usuario utilizando el algoritmo Argon2id. Es útil para entender cómo se puede implementar este algoritmo en un sistema real.

Por favor, dirija su atención principalmente a la clase Servicio para entender cómo se están generando los hashes con el algoritmo Argon2id.

Espero que esta demostración sea útil para cualquier implementación futura que pueda requerir.
