/*
    1. Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
    Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
    constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
    luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
    numero de páginas.

 */
package EjerciciosAprendizaje.E1;

import java.util.Scanner;

public class Libro {
    public String titulo;
    public String autor;
    public Integer ISBN;
    public Integer numeroDePaginas;

    public Libro(){

    }

    public Libro(String titulo, String autor, Integer ISBN, Integer numeroDePaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.numeroDePaginas = numeroDePaginas;
    }

    public Libro cargarlibro(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el título del libro:");
        String titulo = leer.next();
        System.out.println("Ingrese el autor del libro:");
        String autor = leer.next();
        System.out.println("Ingrese el código ISBN");
        int ISBN = leer.nextInt();
        System.out.println("Ingrese el número de páginas:");
        int numeroPaginas = leer.nextInt();
        return new Libro(titulo, autor, ISBN, numeroPaginas);
    }

    @Override
    public String toString() {
        return "EjerciciosAprendizaje.Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", ISBN=" + ISBN +
                ", numeroDePaginas=" + numeroDePaginas +
                '}';
    }
}
