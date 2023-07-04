/*
    Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener
    como atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la
    cantidad jugadas máximas que puede realizar el usuario. Definir los siguientes métodos
    con los parámetros que sean necesarios:
    a) Constructores, tanto el vacío como el parametrizado.
    b) Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
        Con la palabra del usuario, pone la longitud de la palabra, como la longitud del
        vector. Después ingresa la palabra en el vector, letra por letra, quedando cada letra
        de la palabra en un índice del vector. Y también, guarda en cantidad de jugadas
        máximas, el valor que ingresó el usuario y encontradas en 0.
    c) Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
        buscar como se usa el vector.length.
    d) Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
       letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
    e) Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
        cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
        devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
        busque una letra que no esté, se le restará uno a sus oportunidades.
    f) Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
    g) Método juego(): el método juego se encargará de llamar todos los métodos
        previamente mencionados e informará cuando el usuario descubra toda la palabra o
        se quede sin intentos. Este método se llamará en el main.
 */
package EjerciciosExtra.E6;

import java.util.Arrays;
import java.util.Scanner;

public class Ahorcado {
    static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    static String palabra;
    private char[] palabraABuscar;
    private char[] palabraAUsuario;
    private int cantidadLetrasEncontradas;
    private int jugadasMaximas;

    public Ahorcado() {
    }

    public Ahorcado(char [] palabraABuscar, int cantidadLetrasEncontradas, int jugadasMaximas) {
        this.palabraABuscar = palabraABuscar;
        this.cantidadLetrasEncontradas = cantidadLetrasEncontradas;
        this.jugadasMaximas = jugadasMaximas;
    }

    public void crearJuego(){
        System.out.println("Bienvenido al juego del ahorcado.");
        System.out.println("Ingresa la palabra que desees que el jugador adivine:");
        palabra = leer.next();
        palabraABuscar = new char[palabra.length()];
        palabraAUsuario = new char[palabra.length()];
        convertirAEspacios(palabraAUsuario);

        for (int i = 0; i < palabra.length(); i++) {
            char caracter = palabra.charAt(i);
            palabraABuscar[i] = caracter;
        }

        System.out.println("Ingresa la cantidad de intentos maximos para adivinar la palabra.");
        jugadasMaximas = leer.nextInt();
    }

    public void convertirAEspacios(char [] vector){
        Arrays.fill(vector, '_');
    }
    public void longitud(){
        System.out.printf("Longitud de la palabra: %d\n",palabraABuscar.length);
    }

    public boolean buscarLetra(char letra){
        for (int i = 0; i < palabraABuscar.length; i++) {
            if (palabraABuscar[i] == letra) {
                palabraAUsuario[i] = palabraABuscar[i];
                palabraABuscar[i] = '_';
                cantidadLetrasEncontradas++;
                System.out.println("La letra pertenece a la palabra.");
                int letrasRestantes = palabraABuscar.length - cantidadLetrasEncontradas;
                System.out.printf("Numero de letras (encontradas, faltantes): (%d,%d)\n", cantidadLetrasEncontradas, letrasRestantes);
                return true;
            }
        }

        jugadasMaximas--;
        int letrasRestantes = palabraABuscar.length - cantidadLetrasEncontradas;
        System.out.printf("Numero de letras (encontradas, faltantes): (%d,%d)\n", cantidadLetrasEncontradas, letrasRestantes);
        return false;
    }

    public void intentos(){
        System.out.printf("Numero de oportunidades restantes: %d\n", jugadasMaximas);
    }

    public void palabra(){
        System.out.println(Arrays.toString(palabraAUsuario));
    }
    public void juego(){
        crearJuego();

        while(jugadasMaximas>0 && cantidadLetrasEncontradas != palabraABuscar.length) {
            longitud();
            palabra();
            System.out.println("Ingrese una letra:");
            String entrada = leer.next();
            char letra = entrada.charAt(0);
            buscarLetra(letra);
            intentos();
            System.out.println("---------------------------------------------------------");

        }

        if(cantidadLetrasEncontradas == palabraABuscar.length){
            System.out.println("Felicidades ganaste el juego...!!!");
            System.out.printf("La palabra era: %s", palabra);
        }else{
            System.out.println("Tus intentos han terminado...");
            System.out.printf("La palabra era: %s", palabra);
        }

    }
}
