package EjerciciosAprendizaje.E6;

public class Main {
    public static void main(String[] args) {
        //Ejercicio 6
        Cafetera cafetera = new Cafetera();
        System.out.println(cafetera.getCantidadActual());
        cafetera.llenarCafetera();
        System.out.println(cafetera.getCantidadActual());
        cafetera.servirTaza();
        System.out.println(cafetera.getCantidadActual());
        cafetera.servirTaza();
        System.out.println(cafetera.getCantidadActual());
        cafetera.agregarCafe();
        System.out.println(cafetera.getCantidadActual());
    }

}
