/*
 @author Camilla Sarmento
 */

package biblioteca;

import java.util.ArrayList;
import java.util.List;


public class MiembroPremium extends Usuario {
    private List<Libro> librosReservados = new ArrayList<>();

    public MiembroPremium(String nombre) {
        super(nombre);
    }

    public List<Libro> getListaReservados() {
        return librosReservados;
    }

    //Si el libro no está disponible, lo añade a una lista de reservas. Si está disponible, lo añade a
    // su lista de libros prestados y cambia su disponibilidad.*/

    public void reservarLibro(Libro libro) {
        if (!libro.getDisponibilidad()) {
            librosReservados.add(libro);
            System.out.println("El libro '" + libro.getTitulo() + "' ha sido reservado por " + getNombre());
        } else {
            tomarPrestado(libro);
            System.out.println("El libro '" + libro.getTitulo() + "' ha sido prestado a " + getNombre() + " (Miembro Premium)");
        }

    }
}



/*
4. Clase MiembroPremium (hereda de Usuario)
Atributos:
libros_reservados (lista de Libro)

Métodos adicionales:
reservar_libro(libro): Si el libro no está disponible, lo añade a una lista de reservas. Si está disponible, lo añade a
 su lista de libros prestados y cambia su disponibilidad.*/