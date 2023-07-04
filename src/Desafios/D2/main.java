package Desafios.D2;
import java.util.ArrayList;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        PeliculaService peliculaService = new PeliculaService();
        AlquilerService alquilerService = new AlquilerService();
        ArrayList<Pelicula> listaP = new ArrayList<>();
        ArrayList<Alquiler> listaA = new ArrayList<>();
        int opcion;

        do {
            System.out.println("=== Menú de opciones ===");
            System.out.println("1. Crear Pelicula");
            System.out.println("2. Listar Peliculas");
            System.out.println("3. Crear Alquiler");
            System.out.println("4. Listar Alquiler");
            System.out.println("5. Buscar Pelicula por titulo");
            System.out.println("6. Buscar Pelicula por genero");
            System.out.println("7. Buscar Alquileres por fecha");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Has seleccionado la Opción 1");
                    peliculaService.crearPelicula(listaP);
                    break;
                case 2:
                    System.out.println("Has seleccionado la Opción 2");
                    peliculaService.listarPeliculas(listaP);
                    break;
                case 3:
                    System.out.println("Has seleccionado la Opción 3");
                    alquilerService.crearAlquiler(listaA);
                    break;
                case 4:
                    System.out.println("Has seleccionado la Opción 4");
                    alquilerService.listarPeliculasAlquiladas(listaA);
                    break;
                case 5:
                    System.out.println("Has seleccionado la Opción 5");
                    peliculaService.buscarPelicula(listaP);
                    break;
                case 6:
                    System.out.println("Has seleccionado la Opción 6");
                    peliculaService.buscarGenero(listaP);
                    break;
                case 7:
                    System.out.println("Has seleccionado la Opción 7");
                    alquilerService.buscarAlquiler(listaA);
                    break;
                case 8:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }

            System.out.println(); // Imprimir línea en blanco para separar el menú
        } while (opcion != 8);
        System.out.println("¡Fin del programa!");
    }
}

