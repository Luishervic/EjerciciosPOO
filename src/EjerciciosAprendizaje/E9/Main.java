package EjerciciosAprendizaje.E9;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Ejercicio 9
        Random random = new Random();
        Matematica matematica = new Matematica();
        matematica.setNumeroReal1(random.nextDouble() * 10);
        matematica.setNumeroReal2(random.nextDouble() * 10);
        System.out.println(matematica);
        System.out.println(matematica.calcularPotencia());
        System.out.println(matematica.calcularRaiz());
        System.out.println(matematica.devolverMayor());
    }
}
