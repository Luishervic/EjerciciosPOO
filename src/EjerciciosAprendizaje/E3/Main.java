package EjerciciosAprendizaje.E3;

public class Main {
    public static void main(String[] args) {
        //Ejercicio 3.
        Operacion operacion = new Operacion();
        Operacion primeraOperacion = operacion.crearOperacion();

        System.out.printf("Suma: %d\n",operacion.suma(primeraOperacion));
        System.out.printf("Resta: %d\n", operacion.resta(primeraOperacion));
        System.out.printf("Multiplicación: %d\n", operacion.multiplicacion(primeraOperacion));
        System.out.printf("Division: %.3f\n", operacion.division(primeraOperacion));
    }

}
