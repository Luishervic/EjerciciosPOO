/*
    Crear una clase llamada Operacion que tenga como atributos privados numero1 y
    numero2. A continuación, se deben crear los siguientes métodos:
        a) Método constructor con todos los atributos pasados por parámetro.
        b) Metodo constructor sin los atributos pasados por parámetro.
        c) Métodos get y set.
        d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda
        en los atributos del objeto.
        e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
        f) Método restar(): calcular la resta de los números y devolver el resultado al main

        g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
        fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
        Si no, se hace la multiplicación y se devuelve el resultado al main
        h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
        una división por cero, el método devuelve 0 y se le informa al usuario el error se le
        informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
 */
package EjerciciosAprendizaje.E3;

import java.util.Scanner;

public class Operacion {
    private int numero1;
    private int numero2;

    // a)
    public Operacion(int numero1, int numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    // b)
    public Operacion(){

    }

    // c) Setters & getters.
    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    // d)
    public Operacion crearOperacion(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor de numero_1");
        numero1 = leer.nextInt();
        System.out.println("Ingrese el valor de numero_2");
        numero2 = leer.nextInt();
        return new Operacion(numero1, numero2);
    }

    //  e)
    public int suma(Operacion numeros){
        return numeros.getNumero1() + numeros.getNumero2();
    }

    //  f)
    public int resta(Operacion numeros){
        return numeros.getNumero1() - numeros.getNumero2();
    }

    //  g)
    public int multiplicacion(Operacion numeros){
        if (numeros.getNumero2() == 0 || numeros.getNumero1() == 0) {
            System.out.println("Multiplicacion invalida");
            return 0;
        }else {
            return numeros.getNumero1() * numeros.getNumero2();
        }
    }

    //  h)
    public float division(Operacion numeros){
        if (numeros.getNumero2() == 0 || numeros.getNumero1() == 0) {
            System.out.println("Multiplicación inválida");
            return 0;
        }else {
            return (float) numeros.getNumero1() /numeros.getNumero2();
        }
    }

}
