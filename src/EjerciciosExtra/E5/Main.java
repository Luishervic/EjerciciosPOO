package EjerciciosExtra.E5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        JuegoMes juego1 = new JuegoMes();

        System.out.println("Bienvenido al juego adivina el mes...!! :D");
        System.out.println("Ingrese el nombre del mes en minusculas:");

        while (!juego1.verificar(leer.next().toLowerCase())){
            System.out.println("No has adivinado, intenta nuevamente:");
        }

        System.out.println("Felicidades has ganado el juego :D");
    }
}
