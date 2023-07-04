/*

    En este ejercicio deberemos instanciar en el main, una fecha usando la clase
    Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
    usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
    deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que
    se puede conseguir instanciando un objeto Date con constructor vacío.

 */

package EjerciciosAprendizaje.E11;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateUtil {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Ingrese el día: ");
        int dia = scanner.nextInt();

        System.out.print("Ingrese el mes: ");
        int mes = scanner.nextInt();

        System.out.print("Ingrese el año: ");
        int anio = scanner.nextInt();

        // Crear objeto Date con la fecha ingresada por el usuario
        Date fechaIngresada = new Date(anio - 1900, mes - 1, dia);

        // Obtener fecha actual
        Date fechaActual = new Date();

        // Mostrar la fecha ingresada
        System.out.println("Fecha ingresada: " + sdf.format(fechaIngresada));

        // Diferencia
        int aniosDiferencia = fechaActual.getYear() - fechaIngresada.getYear();

        System.out.println("Años de diferencia: " + aniosDiferencia);
    }
}
