# Clinica_Veterinaria_CRUD
### API de Clínica Veterinaría con SpringBoot que conecta a una base de datos MySQL desplegado en AWS Elastic Beanstalk (EB)
#### La API permite llevar el control de las mascotas y sus respectivos dueños.
La API Rest permite realizar consultas CRUD(Cread, Read, Updated, Delete) de las clases "Mascota" y "Dueño", así como otras operaciónes personalizadas.


 ### 🖥️ Tecnologías Utilizadas:
* Java 17
* AWS EB, RDB, EC2, S3
* Spring Boot: 2.7.13
* Spring Boot Data JPA
* Spring Boot Starter Web
* H2 Database
* Lombok
* MySQL Driver
* Postman
* IDE NetBeans
 
 ### Este programa permite realizar las siguientes consultas 
 * CRUD de las mascotas (Alta, Baja, Modificación, Lectura)
 * CRUD de los dueños
 * Listado de todas las mascotas de especie "perro" y raza "caniche"
 * Listado de datos combinados de la mascota y dueño (Patron DTO)

 ### EndPoints Mascotas - Local Server
 * GET      localhost:3500/mascotas/traer
 * POST     localhost:3500/mascotas/crear
 * DELETE   localhost:3500/mascotas/borrar/{id_mascota}
 * PUT      localhost:3500/mascotas/editar
 * GET      localhost:3500/mascotas/mascoDTO
 * GET      localhost:3500/mascotas/caniches

 ### EndPoints Duenos  - Local Server
 * GET      localhost:3500/duenos/traer
 * POST      localhost:3500/duenos/crear    
 * DELETE   localhost:3500/duenos/borrar/{id_dueno}
 * PUT      localhost:3500/duenos/editar

 ### AWS Elastic Beanstalk (AWS EB) Remote Server
 Los endpoints para las solicitudes y respuestas son las mismas que en el servidor local, solo se tiene que cambiar la parte inicial del link:
 * GET      clinica-veterinaria-env.eba-yvmi4iey.us-east-2.elasticbeanstalk.com/mascotas/traer
 * GET      clinica-veterinaria-env.eba-yvmi4iey.us-east-2.elasticbeanstalk.com/duenos/traer
 * GET      clinica-veterinaria-env.eba-yvmi4iey.us-east-2.elasticbeanstalk.com/mascotas/caniches

 Considere que en el buscador/brower unicamente se pueden ejecutar requests del tipo GET, si desea realizar otro tipo de request es necesario
 utilizar Postman (POST, DELETE, PUT).

 ### Instalación

##### Clona o descarga el repositorio.
##### Importa el proyecto a tu IDE (NetBeans, Eclipse, Intellij)
##### Ejecuta el archivo ClinicavetApplication.java desde tu IDE.
##### Abre Postman e importa la colección para realizar las pruebas: [Postman Collection](https://github.com/luzhersor/Clinica_Veterinaria_CRUD/blob/main/ClinicaVeterinaria.postman_collection.json)

  
  
