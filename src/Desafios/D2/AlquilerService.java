package Desafios.D2;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class AlquilerService {
    static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public void crearAlquiler(ArrayList<Alquiler> vectorAlquiler){
        System.out.println("Ingrese el titulo:");
        String titulo = leer.next();
        System.out.print("Ingrese la fecha de inicio (dd/MM/yyyy): ");
        String fechaInicio = leer.next();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaInicial = new Date();
        try {
            fechaInicial  = dateFormat.parse(fechaInicio);
            System.out.println("Fecha ingresada: " + fechaInicial);
        } catch (ParseException e) {
            System.out.println("Fecha inválida. Asegúrese de seguir el formato dd/MM/yyyy.");
        }

        System.out.print("Ingrese la fecha final (dd/MM/yyyy): ");
        String fechaFinal = leer.next();

        //SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaFin = new Date();
        try {
            fechaFin = dateFormat.parse(fechaFinal);
            System.out.println("Fecha ingresada: " + fechaFin);
        } catch (ParseException e) {
            System.out.println("Fecha inválida. Asegúrese de seguir el formato dd/MM/yyyy.");
        }

        System.out.println("Ingrese el precio:");
        double precio = calcularIngreso(fechaInicial, fechaFin);
        vectorAlquiler.add(new Alquiler(titulo, fechaInicial, fechaFin, precio));
    }

    public void listarPeliculasAlquiladas(ArrayList<Alquiler> vectorAlquiler){
        for (Alquiler elemento : vectorAlquiler) {
            System.out.println(elemento.toString());
        }
    }

    public void buscarAlquiler(ArrayList<Alquiler> vectorAlquiler){
        System.out.print("Ingrese la fecha (dd/MM/yyyy): ");
        String fechaString = leer.next();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaInicial = new Date();
        try {
            fechaInicial  = dateFormat.parse(fechaString);
            System.out.println("Fecha ingresada: " + fechaInicial);
        } catch (ParseException e) {
            System.out.println("Fecha inválida. Asegúrese de seguir el formato dd/MM/yyyy.");
        }

        for (Alquiler elemento : vectorAlquiler) {
            //int dias = restarFechas(elemento.getFechaInicio(), fechaInicial);
            if (elemento.getFechaInicio().compareTo(fechaInicial) == 0) {
                System.out.println("Si existe...!!!");
                System.out.println(elemento);
            }else {
                System.out.println("No encontrado... :(");
            }
        }
    }

    public static int restarFechas(Date fecha1, Date fecha2) {
        LocalDate localDate1 = fecha1.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
        LocalDate localDate2 = fecha2.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
        return (int) ChronoUnit.DAYS.between(localDate1, localDate2);
    }

    public double calcularIngreso(Date fechaInicio, Date fechaFin){
        int diasAlquilados = restarFechas(fechaInicio, fechaFin);
        double costo = 0;
        if (diasAlquilados <= 3) {
            return costo = 10;
        } else{
            return costo = 10 + ((diasAlquilados -3) * 0.1);
        }

    }

}
