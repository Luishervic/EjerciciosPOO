package EjerciciosAprendizaje.E8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Ejercicio 8
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        CadenaService cadenaService = new CadenaService();
        Cadena cadena = cadenaService.crearCadena();
        System.out.println("Ingrese la palabra o cadena:");
        String cadenaTexto = leer.next();
        cadena.setFrase(cadenaTexto);
        cadena.setLongitud(cadenaTexto.length());
        cadenaService.mostrarVocales(cadena);
        cadenaService.invertirFrase(cadena);
        cadenaService.contiene(cadena,"a");
        cadenaService.unirFrase(cadena, "es viernes");
        cadenaService.remplazar(cadena, 'e');
        cadenaService.compararLongitud(cadena,"esta es la nueva cadena");
    }

}
