package EjerciciosExtra.E4;

public class Main {
    public static void main(String[] args) {
        // Ejemplo 1 - DNI = 17040321 - RESTO(%23) = 12:
        NIF nif1 = new NIF();
        nif1.crearNIF();
        System.out.println(nif1.mostrar());

        // Ejemplo 2 - DNI = 17040366 - RESTO(%23) = 11
        NIF nif2 = new NIF();
        nif2.crearNIF();
        System.out.println(nif2.mostrar());

        // Ejemplo 3 - DNI = 17040399 - RESTO(%23) = 21
        NIF nif3 = new NIF();
        nif3.crearNIF();
        System.out.println(nif3.mostrar());
    }

}
