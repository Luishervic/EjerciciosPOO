/*
    Realizar una clase llamada Matemática que tenga como atributos dos números reales con
    los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
    constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
    Math.random para generar los dos números y se guardaran en el objeto con su
    respectivos set. Deberá además implementar los siguientes métodos:

        a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
        b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
            elevado al menor número. Previamente se deben redondear ambos valores.
        c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
            Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */

package EjerciciosAprendizaje.E9;

public class Matematica {
    private double numeroReal1;
    private double numeroReal2;

    public Matematica(){}

    public Matematica(float numeroReal1, float numeroReal2){
        this.numeroReal1 = numeroReal1;
        this.numeroReal2 = numeroReal2;
    }

    public double getNumeroReal1() {
        return numeroReal1;
    }

    public void setNumeroReal1(double numeroReal1) {
        this.numeroReal1 = numeroReal1;
    }

    public double getNumeroReal2() {
        return numeroReal2;
    }

    public void setNumeroReal2(double numeroReal2) {
        this.numeroReal2 = numeroReal2;
    }

    //  a)
    public double devolverMayor(){
        return Math.max(numeroReal1, numeroReal2);
    }

    //  b)
    public float calcularPotencia(){
        float mayor = Math.round(Math.max(numeroReal1, numeroReal2));
        float menor = Math.round(Math.min(numeroReal1, numeroReal2));
        return Math.round(Math.pow(mayor, menor));
    }

    //  c)
    public float calcularRaiz(){
        double menor = Math.min(numeroReal1, numeroReal2);
        return Math.round(Math.sqrt(Math.abs(menor)));
    }

    @Override
    public String toString() {
        return "Matematica{" +
                "numeroReal1=" + numeroReal1 +
                ", numeroReal2=" + numeroReal2 +
                '}';
    }

}
