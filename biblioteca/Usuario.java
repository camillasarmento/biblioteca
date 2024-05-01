/*
 @author Camilla Sarmento
 */

package biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private String nombre;
    private List<Libro> librosPrestados= new ArrayList<>();

    public Usuario(String nombre) {
        this.nombre = nombre;
            }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Libro> getListaPrestados() {
        return librosPrestados;
    }

//Si el libro está disponible, lo añade a `libros_prestados` y cambia su disponibilidad.
    public void tomarPrestado(Libro libro) {
        librosPrestados.add(libro);
        libro.marcarPrestado();
    }

    public void tomarPrestado(String titulo) {
        for (Libro libro : Libro.getListaLibros()) {
            if (libro.getTitulo().equals(titulo) && libro.getDisponibilidad()) { //Miro si el título del libro coincide con el nombre que le he pasado
                tomarPrestado(libro);
                System.out.println("El libro con título: " + libro.getTitulo() + " ha sido prestado al usuario " + this.nombre);
                System.out.println("");
                return;
            }
        }

        System.out.println("El libro '" + titulo + "' no está disponible para préstamo.");
    }

//Remueve un libro de `libros_prestados` y cambia su disponibilidad.
    public void devolverLibro(Libro libro) {
        librosPrestados.remove(libro);
        libro.marcarDevuelto();
    }

    public void devolverLibro(String titulo) {
        for (Libro libro : librosPrestados) {
            if (libro.getTitulo().equals(titulo)) {
                devolverLibro(libro);

                System.out.println("El libro '" + titulo + "' ha sido devuelto por " + this.nombre);
                return;
            }
        }
        System.out.println("El usuario no tiene prestado el libro '" + titulo + "'.");
    }
}





/*3. Clase Usuario
Atributos:
nombre (string)
libros_prestados (lista de Libro)

Métodos:
tomar_prestado(nombre_libro): Si el libro está disponible, lo añade a `libros_prestados` y cambia su disponibilidad.
devolver_libro(nombre_libro): Remueve un libro de `libros_prestados` y cambia su disponibilidad.*/