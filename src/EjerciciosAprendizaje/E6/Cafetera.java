/*
    Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
    (la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la
    cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes
    métodos:
        a) Constructor predeterminado o vacío
        b) Constructor con la capacidad máxima y la cantidad actual
        c) Métodos getters y setters.
        d) Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
        máxima.
        e) Método servirTaza(): se pide el tamaño de una taza vacía, el método recibe el
        tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
        cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
        método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
        cuanto quedó la taza.
        f) Método vaciarCafetera(): pone la cantidad de café actual en cero.
        g) Método agregarCafe(): se le pide al usuario una cantidad de café, el método lo
        recibe y se añade a la cafetera la cantidad de café indicada.
 */

package EjerciciosAprendizaje.E6;

import java.util.Scanner;

public class Cafetera {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private int capacidadMaxima;
    private int cantidadActual;

    //  a)
    public Cafetera(){
        capacidadMaxima = 500;
    }

    //  b)
    public Cafetera(int capacidadMaxima, int cantidadActual){
        this.capacidadMaxima = 500;
        this.cantidadActual = cantidadActual;
    }

    //  c)
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    //  d)
    public void llenarCafetera(){
        cantidadActual = 500;
    }

    //  e)
    public void servirTaza(){
        System.out.println("Ingrese el tamaño de la taza en ml:");
        int miliLitros = leer.nextInt();

        if (miliLitros < cantidadActual) {
            cantidadActual -= miliLitros;
            System.out.println("Tu taza esta completamente llena...");
        }else {
            int diferencia = miliLitros - cantidadActual;
            System.out.println("Tu taza no se lleno, le hizo falta " + diferencia + " ml");
            cantidadActual = 0;
        }
    }

    //  f)
    public void vaciarCafetera(){
        cantidadActual = 0;
    }

    //  g)
    public void agregarCafe(){
        System.out.println("Cuanta cantidad de cafe deseea ingresar...? (ml)");
        int miliLitros = leer.nextInt();
        cantidadActual += miliLitros;
    }
}
