package EjerciciosAprendizaje.E13;

public class Main {
    public static void main(String[] args) {
        //Ejercicio 13.
        Curso curso = new Curso();
        Curso matematicas = curso.crearCurso();
        System.out.println(matematicas);
        System.out.println(matematicas.calcularGananciaSemanal());

        Curso fisica = curso.crearCurso();
        System.out.println(fisica.calcularGananciaSemanal());

        Curso quimica = curso.crearCurso();
        System.out.println(quimica.calcularGananciaSemanal());
    }
}
