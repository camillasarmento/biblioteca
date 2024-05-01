/*
 @author Camilla Sarmento
 */

package biblioteca;

import java.util.ArrayList;
import java.util.List;

    public class Autor {
    private String nombre;
    private List<Libro> librosPublicados= new ArrayList<>();

    public Autor(String nombre) {
        this.nombre = nombre;
            }

    public String getNombre() {
        return nombre;
    }

    public List<Libro> getLibrosPublicados() {
        return librosPublicados;
    }

    //Añade un libro a la lista de libros del autor.
    public void publicarLibro(String titulo) {
        Libro libro = new Libro(titulo, this);
        librosPublicados.add(libro);
    }

}


/*2. Clase Autor
Atributos:
nombre (string)
libros (lista de Libro)

Métodos:
publicar_libro(libro): Añade un libro a la lista de libros del autor.
*/