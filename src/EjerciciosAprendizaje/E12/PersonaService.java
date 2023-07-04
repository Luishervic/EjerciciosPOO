package EjerciciosAprendizaje.E12;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class PersonaService {
    //  a)
    public Persona crearPersona(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el nombre:");
        String nombre = leer.next();
        System.out.print("Ingrese el día: ");
        int dia = leer.nextInt();

        System.out.print("Ingrese el mes: ");
        int mes = leer.nextInt();

        System.out.print("Ingrese el año: ");
        int anio = leer.nextInt();

        Date fecha = new Date(anio - 1900, mes - 1, dia);

        return new Persona(nombre, fecha);
    }

    //  b)
    public void calcularEdad(Persona persona){
        Date fechaActual = new Date();
        long diferenciaMilis = fechaActual.getTime() - persona.getFechaNacimiento().getTime();
        long edad = TimeUnit.MILLISECONDS.toDays(diferenciaMilis)/365;
        System.out.printf("La edad de %s es %d\n", persona.getNombre(), edad);
    }

    //  c)
    public boolean menorQue(Persona persona, int edadAComparar){
        Date fechaActual = new Date();
        long diferenciaMilis = fechaActual.getTime() - persona.getFechaNacimiento().getTime();
        long edad = TimeUnit.MILLISECONDS.toDays(diferenciaMilis)/365;
        return edad < edadAComparar;
    }
}
