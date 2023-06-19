# Clinica_Veterinaria_CRUD
### API de Clínica Veterinaría con SpringBoot que conecta a una base de datos H2. 
#### La API permite llevar el control de las mascotas y sus respectivos dueños.
La API permite realizar consultas CRUD(Cread, Read, Updated, Delete) de las clases "Mascota" y "Dueño", así como otras operaciónes personalizadas.


 ### 🖥️ Tecnologías Utilizadas:
* Java 17
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

 ### EndPoints Mascotas
 * GET      localhost:3500/mascotas/traer
 * POST     localhost:3500/mascotas/crear
 * DELETE   localhost:3500/borrar/{id_mascota}
 * PUT      localhost:3500/mascotas/editar
 * GET      localhost:3500/mascotas/mascoDTO
 * GET      localhost:3500/mascotas/caniches

 ### EndPoints Duenos
 * GET      localhost:3500/duenos/traer
 * GET      localhost:3500/duenos/crear    
 * DELETE   localhost:3500/duenos/borrar/{id_dueno}
 * PUT      localhost:3500/duenos/editar

 ### Instalación

##### Clona o descarga el repositorio.
##### Importa el proyecto a tu IDE (NetBeans, Eclipse, Intellij)
##### Ejecuta el archivo ClinicavetApplication.java desde tu IDE.
##### Abre Postman e importa la colección para realizar las pruebas: [Postman Collection](https://github.com/luzhersor/Clinica_Veterinaria_CRUD/blob/main/ClinicaVeterinaria.postman_collection.json)

  
  
