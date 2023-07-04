package EjerciciosExtra.E3;

public class Main {
    public static void main(String[] args) {
        //Dos soluciones
        Raices ecuacion1 = new Raices(1,6,8);
        System.out.println(ecuacion1);
        ecuacion1.calcular();

        //Una solucion
        Raices ecuacion2 = new Raices(1, -4, 4);
        System.out.println(ecuacion2);
        ecuacion2.calcular();

        //Sin solucion
        Raices ecuacion3 = new Raices(2, -1, 2);
        System.out.println(ecuacion3);
        ecuacion3.calcular();
    }


}
