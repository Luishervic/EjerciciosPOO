/*

    Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
    (Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes
    métodos:
        a) Agregar un método de creación del objeto que respete la siguiente firma:
            crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
            usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
            fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
        b) Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
            en cuenta que para conocer la edad de la persona también se debe conocer la fecha
            actual.
        c) Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
            edad y retorna true en caso de que el receptor tenga menor edad que la persona que
            se recibe como parámetro, o false en caso contrario.
        d) Metodo mostrarPersona(): este método muestra la persona creada en el método
            anterior.

 */

package EjerciciosAprendizaje.E12;

import java.util.Date;


public class Persona {
    private String nombre;
    private Date fechaNacimiento;

    public Persona() {
    }

    public Persona(String nombre, Date fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    //  d)
    public String mostrarPersona() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }

}
