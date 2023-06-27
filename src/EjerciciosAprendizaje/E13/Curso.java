/*

    Un profesor particular está dando cursos para grupos de cinco alumnos y necesita un
    programa para organizar la información de cada curso. Para ello, crearemos una clase
    entidad llamada Curso, cuyos atributos serán: nombreCurso, cantidadHorasPorDia,
    cantidadDiasPorSemana, turno (mañana o tarde), precioPorHora y alumnos. Donde
    alumnos es un arreglo de tipo String de dimensión 5 (cinco), donde se alojarán los
    nombres de cada alumno. A continuación, se implementarán los siguientes métodos:
        a) Un constructor por defecto.
        b) Un constructor con todos los atributos como parámetro.
        c) Métodos getters y setters de cada atributo.
        d) método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos
            que asisten a las clases. Nosotros nos encargaremos de almacenar esta información
            en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el
            nombre de cada alumno.
        e) Método crearCurso(): el método crear curso, le pide los valores de los atributos al
            usuario y después se le asignan a sus respectivos atributos para llenar el objeto
            Curso. En este método invocaremos al método cargarAlumnos() para asignarle valor
            al atributo alumnos.
        f) Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
            en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
            día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
            se repite el encuentro.

 */
package EjerciciosAprendizaje.E13;

import java.util.Arrays;
import java.util.Scanner;

public class Curso {
    static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private String nombreCurso;
    private int cantidadHorasPorDia;
    private int cantidadDiasPorSemana;
    private boolean turno;
    private float precioPorHora;
    private String[] alumnos = new String[5];
    //  a)
    public Curso() {
    }

    //  b)
    public Curso(String nombreCurso, int cantidadHorasPorDia, int cantidadDiasPorSemana, boolean turno, float precioPorHora, String[] alumnos) {
        this.nombreCurso = nombreCurso;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
        this.alumnos = alumnos;
    }

    //  c)
    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCantidadHorasPorDia() {
        return cantidadHorasPorDia;
    }

    public void setCantidadHorasPorDia(int cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }

    public int getCantidadDiasPorSemana() {
        return cantidadDiasPorSemana;
    }

    public void setCantidadDiasPorSemana(int cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }

    public boolean isTurno() {
        return turno;
    }

    public void setTurno(boolean turno) {
        this.turno = turno;
    }

    public float getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(float precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }

    //  d)
    public String[] cargarAlumnos(){
        String[] alumnosTemp = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.printf("Ingresa el nombre del alumno %d:\n", i + 1);
            alumnosTemp[i] = leer.next();
            while (alumnosTemp[i].isEmpty()) {
                System.out.println("Nombre del alumno invalido, intenta nuevamente");
                alumnosTemp[i] = leer.next();
            }
        }
        return alumnosTemp;
    }

    //  e)
    public Curso crearCurso(){
        String nombreCurso = validarEntradaString("Ingrese el nombre del curso:");
        int cantidadHorasPorDia = validarEntradaInt("Ingrese la cantidad de horas por dia:");
        int cantidadDiasPorSemana = validarEntradaInt("Cantidad de dias por semana:");
        String turnoEscrito = validarEntradaString("Ingrese el turno Matutino o Vespertino (M/V)");

        while (!turnoEscrito.equalsIgnoreCase("matutino") && !turnoEscrito.equalsIgnoreCase("vespertino")){
            System.out.println("Turno no valido, intente nuevamente");
            turnoEscrito = leer.next().toLowerCase();
        }
        boolean turno;
        if (turnoEscrito.equals("matutino")) {
            turno = true;
        }else {
            turno = false;
        }

        int precioPorHora = validarEntradaInt("Ingrese precio por hora:");
        String [] alumnos = cargarAlumnos();

        return new Curso(nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana, turno,precioPorHora,alumnos);
    }

    //  f)
    public float calcularGananciaSemanal(){
        return ((cantidadHorasPorDia * precioPorHora) * alumnos.length) * cantidadDiasPorSemana;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nombreCurso='" + nombreCurso + '\'' +
                ", cantidadHorasPorDia=" + cantidadHorasPorDia +
                ", cantidadDiasPorSemana=" + cantidadDiasPorSemana +
                ", turno=" + turno +
                ", precioPorHora=" + precioPorHora +
                ", alumnos=" + Arrays.toString(alumnos) +
                '}';
    }

    // Funcionalidades extra.
    public int validarEntradaInt(String mensaje) {
        int valor = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            System.out.println(mensaje);
            valor = leer.nextInt();
            if (valor != 0) {
                entradaValida = true;
            } else {
                System.out.println("El número debe ser mayor o diferente de cero. Intente nuevamente.");
            }
        }

        return valor;
    }

    public String validarEntradaString(String mensaje) {
        String valor = "";
        boolean entradaValida = false;

        while (!entradaValida) {
            System.out.println(mensaje);
            valor = leer.next();
            if (!valor.isEmpty()) {
                entradaValida = true;
            } else {
                System.out.println("La entrada no puede estar vacía. Intente nuevamente.");
            }
        }

        return valor;
    }


}
