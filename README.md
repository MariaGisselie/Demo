# Web Api de Libro
Interfaz de programación de aplicaciones web, es esencialmente un mensajero entre aplicaciones. Permite que diferentes programas de software se comuniquen entre sí proporcionando un conjunto de reglas y especificaciones.
# Inicialización del proyecto
Utiliza Spring Initializar para generar un nuevo proyecto Spring Boot con las siguientes dependencias: Web.
# Spring Initializar
![image](https://github.com/MariaGisselie/Demo/assets/169214799/23ef6f41-10fd-49a8-8506-14fcf7922972)
# Package com.tuuniversidad.controllers
LibroController
En esta clase consta de anotaciones Spring @RestController para indicar que devuelven JSON directamente en lugar de vistas.
Se utilizan anotaciones como @GetMapping, @PostMapping para mapear métodos a solicitudes HTTP específicas (GET y POST, respectivamente).
- GET /libros: Retorna una lista de todos los libros.
- GET /libros/{id_libro}: Retorna un libro por el id.
- POST /libros: crea un nuevo recurso libro
# Package com.tuuniversidad.service
                public interface LibroService {
	               Libro getLibro(Long id);
	               List<Libro> getLibros();
	               Libro nuevoLibro(Libro libro);
                }

# Package com.tuuniversidad.repository
Es una interface Donde se encuentran los siguientes métodos :

    Libro getLibro(Long id);
        List<Libro> getLibros();
    Libro nuevoLibro(Libro libro);

# LibroRepositoryImp
Es una clase donde se realiza implementaciones de repositorios personalizados: los desarrolladores pueden crear repositorios personalizados adaptados a necesidades específicas de acceso a datos.

           public LibroRepositoryImp() {
		              libros.add(new Libro(978-270-800L,"INTRODUCCION A LA PROGRAMACION","FRANCISCO","ANAYA MULTIMEDIA","2022"));
		              libros.add(new Libro(978-843-6954-302L,"INTRODUCCION A LOS ALGORITMOS","THOMAS H","MIT PRESS","1989"));
		              libros.add(new Libro(978-844-8173-937L,"METODOLODIA DE LA PROGRAMACION","CARELIA GUADALUPE","PLAZA Y VALDES","2008"));	
	         }
 # Prueba en LocalHost
 ![image](https://github.com/MariaGisselie/Demo/assets/169214799/f6e95eb4-4694-4df8-a5b5-477ce150f257)

 # Prueba en Postman
 ![image](https://github.com/MariaGisselie/Demo/assets/169214799/9b3d59aa-6c38-42d1-860b-04aa475ada80)



