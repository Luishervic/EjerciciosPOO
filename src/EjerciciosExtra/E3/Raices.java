/*
    Realiza una clase llamada Raices, donde representaremos los valores de una
    ecuación de 2o grado. Tendremos los 3 coeficientes como atributos, llamémosles a, b y c.
    Hay que insertar estos 3 valores para construir el objeto a través de un método
    constructor. Luego, las operaciones que se podrán realizar son las siguientes:
    a) Método getDiscriminante(): devuelve el valor del discriminante (double). El
        discriminante tiene la siguiente formula: (b^2)-4*a*c
    b) Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
        que esto ocurra, el discriminante debe ser mayor que 0.
    c) Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
        que esto ocurra, el discriminante debe ser igual que 0.
    d) Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2
        posibles soluciones.
    e) Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz.
        Es en el caso en que se tenga una única solución posible.
    f) Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
        pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
        obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
        de no existir solución, se mostrará un mensaje.
 */
package EjerciciosExtra.E3;

public class Raices {
    private int a;
    private int b;
    private int c;

    public Raices() {
    }

    public Raices(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminante(){
        return Math.pow(b,2) - 4*a*c;
    }

    public boolean tieneRaices(){
        return getDiscriminante() > 0;
    }

    public boolean tieneRaiz(){
        return getDiscriminante() == 0;
    }

    public void obtenerRaices(){
        if (tieneRaices()) {
            double x1 = (-b - Math.sqrt(Math.pow(b,2)-4*a*c))/2*a;
            double x2 = (-b + Math.sqrt(Math.pow(b,2)-4*a*c))/2*a;
            System.out.printf("x1 = %.4f\n",x1);
            System.out.printf("x2 = %.4f\n",x2);
        }

    }

    public void obtenerRaiz(){
        if (tieneRaiz()) {
            double x1 = (-b - Math.sqrt(Math.pow(b,2)-4*a*c))/2*a;
            System.out.printf("x1 = %.4f\n",x1);
        }
    }

    public void calcular(){
        if (tieneRaices()) {
            System.out.println("Dos soluciones iguales diferentes.");
            obtenerRaices();
        } else if (tieneRaiz()) {
            System.out.println("Solución real repetida.");
            obtenerRaiz();
        } else System.out.println("La ecuación no tiene posibles soluciones. :(");
    }

    @Override
    public String toString() {
        return "Raices{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
