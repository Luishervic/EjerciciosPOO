package Desafios.D2;

import java.util.ArrayList;
import java.util.Scanner;

public class PeliculaService {
    static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public void crearPelicula(ArrayList<Pelicula> vectorPeliculas){
        System.out.println("Ingresa Titulo de la pelicula");
        String titulo = leer.next();
        System.out.println("Ingrese el genero:");
        String genero = leer.next();
        System.out.println("Ingrese el año");
        int anio = leer.nextInt();
        System.out.println("Ingrese la duracion:");
        int duracion = leer.nextInt();
        vectorPeliculas.add(new Pelicula(titulo, genero, anio, duracion));
    }

    public void listarPeliculas(ArrayList<Pelicula> vectorPeliculas){
        for (Pelicula elemento : vectorPeliculas) {
            System.out.println(elemento.toString());
        }
    }

    public void buscarPelicula(ArrayList<Pelicula> vectorPeliculas){
        System.out.println("Ingrese el titulo de la pelicula:");
        String titulo = leer.next().toLowerCase();

        for (Pelicula elemento : vectorPeliculas) {
            if (elemento.getTitulo().toLowerCase().equals(titulo)) {
                System.out.println("Si existe...!!!");
            }else {
                System.out.println("No encontrado... :(");
            }
        }
    }

    public void buscarGenero(ArrayList<Pelicula> vectorPeliculas){
        System.out.println("Ingrese el genero de la pelicula:");
        String genero = leer.next().toLowerCase();

        for (Pelicula elemento : vectorPeliculas) {
            if (elemento.getGenero().toLowerCase().equals(genero)) {
                System.out.println("Si existe...!!!");
            }else {
                System.out.println("No encontrado... :(");
            }
        }
    }

}
