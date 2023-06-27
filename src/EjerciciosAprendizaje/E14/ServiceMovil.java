package EjerciciosAprendizaje.E14;

import java.util.Scanner;

public class ServiceMovil {
    static Scanner rd = new Scanner(System.in).useDelimiter("\n");

    //  d)
    public Movil cargarMovil(){
        System.out.println("Ingresa la marca del movil:");
        String marca = rd.next();
        System.out.println("Ingresa el precio del movil");
        int precio = rd.nextInt();
        System.out.println("Ingresa el modelo:");
        String modelo = rd.next();
        System.out.println("Ingresa la cantidad de memoria RAM:");
        int memoria = rd.nextInt();
        System.out.println("Ingresa la cantidad de almacenamiento:");
        int almacenamiento = rd.nextInt();
        return new Movil(marca,precio,modelo, memoria, almacenamiento, ingresarCodigo());
    }

    //  e)
    public int[] ingresarCodigo(){
        int[] codigo = new int[7];
        for (int i = 0; i < codigo.length; i++) {
            System.out.printf("Ingresa el elemento %d del código:\n", i + 1);
            codigo[i] = rd.nextInt();
        }
        return codigo;
    }


}
