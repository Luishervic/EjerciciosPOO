/*
    Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
    atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
    usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
    los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
    que existe entre los dos puntos que existen en la clase Puntos.
 */

package EjerciciosExtra.E2;

import java.util.Scanner;

public class Puntos {
    static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Puntos() {
    }

    public Puntos(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public void crearPuntos(){
        System.out.println("Ingrese el valor para x1:");
        x1 = leer.nextInt();

        System.out.println("Ingrese el valor para y1:");
        y1 = leer.nextInt();

        System.out.println("Ingrese el valor para x2:");
        x2 = leer.nextInt();

        System.out.println("Ingrese el valor para y2:");
        y2 = leer.nextInt();

    }

    public double calcularDistancia(){
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1,2));
    }
}
