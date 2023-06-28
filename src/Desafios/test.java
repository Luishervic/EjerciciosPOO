package Desafios;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class test {

    public static long restarFechas(Date fecha1, Date fecha2) {
        LocalDate localDate1 = fecha1.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
        LocalDate localDate2 = fecha2.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();

        return ChronoUnit.DAYS.between(localDate1, localDate2);
    }

    public static void main(String[] args) {
        Date fecha1 = new Date(2023-1900,06 - 1,25);
        Date fecha2 = new Date();

        long diferenciaEnDias = restarFechas(fecha1, fecha2);

        System.out.println("La diferencia en días es: " + diferenciaEnDias);
    }


}
