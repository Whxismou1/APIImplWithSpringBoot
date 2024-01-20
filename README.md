# Implementacion básica API SpringBoot

## Requisitos Previos

Asegúrate de tener instalado lo siguiente o versiones similares:

- [Java](https://www.java.com/es/) (versión 17 o superior)
- [Maven](https://maven.apache.org/) (versión 3.6.3 o superior)
- [MySQL](https://www.mysql.com/) (versión 8.0.35 o superior)

## Configuración del Proyecto

Para usar el proyecto, simplemente replica la estructura de la carpeta `src` y del proyecto, el cual se basa en los siguientes componentes:

- **UserModel (Modelo)**
  - Descripción: Este componente representa la estructura de datos para los usuarios en el sistema.

- **UserController (Controlador)**
  - Descripción: Este componente maneja las solicitudes HTTP relacionadas con los usuarios. Contiene los puntos finales (endpoints) y se comunica con `UserService`

- **UserRepository (Repositorio)**
  - Descripción: Este componente se encarga de la interacción con la base de datos para la entidad `UserModel`. Contiene métodos para realizar operaciones CRUD en la base de datos.

- **UserService (Servicios)**
  - Descripción: Este componente contiene la lógica de negocio relacionada con los usuarios. Actúa como un intermediario entre el controlador y el repositorio, realizando operaciones más complejas antes de interactuar con la base de datos.

- **BasicAPIImpl.java (Main)**
  - Descripción: Este es el punto de entrada principal de la aplicación. Contiene la configuración de Spring Boot y es responsable de iniciar la aplicación.

Recuerda personalizar los nombres de las clases y los paquetes según la convención que hayas utilizado en tu proyecto.

### Configuración de la Base de Datos

Asegúrate de modificar el archivo `application.properties` con la configuración correcta para tu base de datos. Puedes encontrar este archivo en la carpeta `src/main/resources`. Cambia las siguientes propiedades según tu entorno:

```properties
# Configuración de la base de datos
spring.datasource.url=jdbc:mysql://tu-url-de-base-de-datos
spring.datasource.username=tu-usuario
spring.datasource.password=tu-contraseña
```



## Ejecución

1. Una vez estructurado el proyecto ejecuta la aplicación:

    ```bash
    mvn spring-boot:run
    ```

2. La aplicación estará disponible en [http://localhost:8080](http://localhost:8080).

## Uso de la API (Endpoints)

### 1. Obtener todos los usuarios

- **Tipo de solicitud:** GET
- **URL:** `/usuario`
- **Descripción:** Obtiene todos los usuarios almacenados en el sistema.
- **Respuesta exitosa:** Devuelve un ArrayList de objetos `UserModel`.

### 2. Guardar un nuevo usuario

- **Tipo de solicitud:** POST
- **URL:** `/usuario`
- **Descripción:** Guarda un nuevo usuario en el sistema.
- **Cuerpo de la solicitud:** Objeto `UserModel` en el cuerpo de la solicitud.
- **Respuesta exitosa:** Devuelve el objeto `UserModel` recién creado + su id.

### 3. Obtener un usuario por ID

- **Tipo de solicitud:** GET
- **URL:** `/usuario/{id}`
- **Descripción:** Obtiene un usuario específico por su ID.
- **Parámetros de la URL:** `{id}` es el ID del usuario.
- **Respuesta exitosa:** Devuelve un objeto `UserModel` o un Optional que puede o no contener el objeto.

### 4. Eliminar un usuario por ID

- **Tipo de solicitud:** DELETE
- **URL:** `/usuario/{id}`
- **Descripción:** Elimina un usuario específico por su ID.
- **Parámetros de la URL:** `{id}` es el ID del usuario.
- **Respuesta exitosa:** Devuelve un mensaje indicando si se eliminó correctamente o no.

