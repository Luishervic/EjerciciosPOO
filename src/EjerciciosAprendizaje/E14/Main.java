package EjerciciosAprendizaje.E14;

public class Main {
    public static void main(String[] args) {
        //Ejercicio 14
        ServiceMovil serviceMovil = new ServiceMovil();
        Movil samsung = serviceMovil.cargarMovil();
        System.out.println(samsung);
    }
}
