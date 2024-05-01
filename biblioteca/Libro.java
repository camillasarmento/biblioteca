/*
 @author Camilla Sarmento
 */

package biblioteca;

import java.util.ArrayList;
import java.util.List;


public class Libro {
    private String titulo;
    private Autor autor;
    private boolean disponibilidad;
    private static List<Libro> listaLibros= new ArrayList<>();

    public Libro(String titulo, Autor autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponibilidad = true;
        listaLibros.add(this);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean getDisponibilidad() {
        return disponibilidad;
    }

    public static List<Libro> getListaLibros() {
        return listaLibros;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

// Cambia el estado de `disponible` a `False`.
    public boolean marcarPrestado(){

        return this.disponibilidad = false;
    }

//Cambia el estado de `disponible` a `True`
    public boolean marcarDevuelto(){

        return this.disponibilidad = true;
    }
}

/*1. Clase Libro
Atributos:
título (string)
autor (referencia a Autor)
disponible (booleano)
lista_libros (lista de Libro)

Métodos:
marcar_prestado(): Cambia el estado de `disponible` a `False`.
marcar_devuelto(): Cambia el estado de `disponible` a `True`.*/