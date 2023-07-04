/*

    Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
    de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
    programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
    Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
    ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
    0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
    20.

 */

package EjerciciosAprendizaje.E10;
import java.util.Arrays;
import java.util.Random;

public class ArraysUtil {
    static Random random = new Random();
    public static void main(String[] args) {
        double[] arregloA = new double[50];
        double[] arregloB = new double[20];

        inicializarArreglo(arregloA);
        imprimirVector(arregloA);
        Arrays.sort(arregloA);
        copiarArreglo(arregloA, arregloB, 10);
        imprimirVector(arregloA);
        imprimirVector(arregloB);

    }

    public static void inicializarArreglo(double[] arregloA){
        for (int i = 0; i < 50; i++) {
            arregloA[i] = random.nextDouble();
        }
    }

    public static void copiarArreglo(double[] fromArregloA, double[] toArregloB, int elementosACopiar){
        for (int i = 0; i < 20; i++) {
            if (i < elementosACopiar) {
                toArregloB[i] = fromArregloA[i];
            }else {
                toArregloB[i] = 0.5;
            }
        }
    }

    public static void imprimirVector(double[] vector){
        for (int i = 0; i < vector.length; i++) {
            if (i == 0) {
                System.out.printf("[%f]", vector[i]);
            } else {
                System.out.printf(",[%f]", vector[i]);
            }

        }
        System.out.println();
    }
}
