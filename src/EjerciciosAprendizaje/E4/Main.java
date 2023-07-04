package EjerciciosAprendizaje.E4;

public class Main {
    public static void main(String[] args) {
        // Ejercicio 4
        RectanguloService rectanguloService = new RectanguloService();
        Rectangulo rectangulo = rectanguloService.crearRectangulo();
        System.out.printf("Area: %.2f\n", rectanguloService.calcularArea(rectangulo));
        System.out.printf("Perimetro: %.2f\n", rectanguloService.calcularPerimetro(rectangulo));
        rectanguloService.dibujarRectangulo(rectangulo);
    }

}
