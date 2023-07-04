package EjerciciosAprendizaje.E4;

import java.util.Scanner;

public class RectanguloService {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Rectangulo crearRectangulo(){
        System.out.println("Ingrese la base del rectángulo:");
        float base = leer.nextFloat();
        System.out.println("Ingrese altura del rectángulo:");
        float altura = leer.nextFloat();
        return new Rectangulo(base,altura);
    }

    public float calcularArea(Rectangulo rectangulo){
        return rectangulo.getBase() * rectangulo.getAltura();
    }

    public float calcularPerimetro(Rectangulo rectangulo){
        return 2 * (rectangulo.getBase() + rectangulo.getAltura());
    }

    public void dibujarRectangulo(Rectangulo rectangulo){
        for (int fila = 0; fila < rectangulo.getAltura(); fila++) {
            for (int col = 0; col < rectangulo.getBase(); col++) {
                if (fila== 0 || col == 0 || fila == rectangulo.getAltura() - 1  || col == rectangulo.getBase() - 1) {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
