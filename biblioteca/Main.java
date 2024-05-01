/*
 @author Camilla Sarmento
 */

package biblioteca;

public class Main {
    public static void main(String[] args) {

        // Crear autores
        Autor autor1 = new Autor("Julio Cortázar");
        Autor autor2 = new Autor("Jorge Luis Borges");

        // Crear libros publicados por los autores
        Libro libro1 = new Libro("Rayuela", autor1);
        Libro libro2 = new Libro("Bestiario", autor1);
        Libro libro3 = new Libro("Ficciones", autor2);

        // Crear usuario
        Usuario usuario1 = new Usuario("Marta");

        // Crear miembro premium
        MiembroPremium premium1 = new MiembroPremium("Julio");

        //Realizar acciones
        usuario1.tomarPrestado(libro1);
        usuario1.tomarPrestado(libro2);
        premium1.reservarLibro(libro3);

        // Mostrar disponibilidad inicial de los libros
        mostrarDisponibilidad(libro1);
        mostrarDisponibilidad(libro2);
        mostrarDisponibilidad(libro3);

        // Mostrar disponibilidad después de que los autores publican los libros
        System.out.println("\nDisponibilidad después de que los autores publican los libros:");
        mostrarDisponibilidad(libro1);
        mostrarDisponibilidad(libro2);
        mostrarDisponibilidad(libro3);

        // Usuario toma prestado y devuelve al menos un libro
        usuario1.tomarPrestado(libro1);
        usuario1.devolverLibro("Libro 1");

        // MiembroPremium reserva al menos un libro no disponible
        premium1.reservarLibro(libro2);

        // MiembroPremium va a reservar un libro que se encuentra disponible y por lo tanto lo toma prestado
        premium1.reservarLibro(libro3);

        // Mostrar disponibilidad final de los libros
        System.out.println("\nDisponibilidad final de los libros:");
        mostrarDisponibilidad(libro1);
        mostrarDisponibilidad(libro2);
        mostrarDisponibilidad(libro3);
    }

    public static void mostrarDisponibilidad(Libro libro) {
        System.out.println("El libro '" + libro.getTitulo() + "' está " + (libro.getDisponibilidad() ? "disponible" : "indisponible"));
    }
}


/*Se debe crear un sistema para gestionar una Biblioteca. El sistema debe gestionar libros, autores, usuarios y miembros
premium. Cada libro tiene un título, un autor y un indicador de disponibilidad, además hay una lista genérica de libros
al que se añade cada libro en cuanto se crea. Los autores tienen un nombre y una lista de libros que han escrito, y son
 los únicos que pueden publicar los libros (cuando el autor publica el libro lo está creando). Los usuarios tienen un
 nombre y una lista de libros en préstamo. Los miembros premium, que heredan de usuarios, tienen la capacidad adicional
  de reservar libros que están actualmente prestados.


*Recuerda añadir los métodos necesarios de get y set para cada clase.

Análisis de Clases y Relaciones

Relaciones Libro
Pertenece a un Autor: Cardinalidad 1 (cada Libro tiene exactamente un Autor).
Un Libro puede estar o no en préstamo a un Usuario o MiembroPremium.

Relacions Autor
Tiene múltiples Libros: Cardinalidad 1 a muchos (un Autor puede escribir y publicar varios libros).

Relaciones Usuario
Puede tener préstamos de múltiples Libros: Cardinalidad 0 a muchos (un Usuario puede tener varios libros en préstamo al mismo tiempo).

Relaciones MiembroPremium
Hereda las propiedades y métodos de Usuario.
Puede reservar libros que están en préstamo: Cardinalidad 0 a muchos (puede tener reservas de libros no disponibles).

Indicaciones para el Main / Salida por Terminal

1. Instancias a Crear:
Al menos 2 Autores.
Al menos 3 Libros publicados por los autores.
Al menos 1 Usuario y 1 MiembroPremium.


2. Relaciones/Acciones a Demostrar:
Autor publica libros.
Usuario toma prestado y devuelve al menos un libro.
MiembroPremium reserva al menos un libro no disponible.
MiembroPremium va a reservar un libro que se encuentra disponible y por lo tanto lo toma prestado.
Mostrar cada vez que un libro está disponible o deja de estarlo.*/

