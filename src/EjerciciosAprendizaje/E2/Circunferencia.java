/*
    Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
    tipo real. A continuación, se deben crear los siguientes métodos:
    a) Método constructor que inicialice el radio pasado como parámetro.
    b) Métodos get y set para el atributo radio de la clase Circunferencia.
    c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del objeto.
    d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio2).
    e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).

 */


package EjerciciosAprendizaje.E2;

import java.util.Scanner;
import java.lang.Math;

public class Circunferencia {
    private float radio;

    private double pi = Math.PI;

    //  Constructor por defecto.
    public Circunferencia(){

    }
    //  a)
    public Circunferencia(float radio) {
        this.radio = radio;
    }


    //  Setters y Getters.
    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    //  c)
    public Circunferencia crearCincunferencia(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa el radio de la circunferencia:");
        radio = leer.nextInt();
        setRadio(radio);
        return new Circunferencia(radio);
    }

    //  d)
    public void area(Circunferencia circulo){
        double area = pi * (circulo.getRadio() * circulo.getRadio());
        System.out.printf("El area calculada de la circunferencia fue de: %.2f\n", area);
    }

    //  e)
    public void perimetro(Circunferencia circulo){
        double perimetro = 2 * pi * circulo.getRadio();
        System.out.printf("El radio calculado de la circunferencia fue de: %.2f\n", perimetro);
    }

}
