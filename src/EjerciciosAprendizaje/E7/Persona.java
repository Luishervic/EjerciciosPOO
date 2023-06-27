/*
    Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
    sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
    atributo, puede hacerlo. Los métodos que se implementarán son:
        a) Un constructor por defecto.
        b) Un constructor con todos los atributos como parámetro.
        c) Métodos getters y setters de cada atributo.
        d) Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
            al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
            Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O.
            Si no es correcto se deberá mostrar un mensaje
        e) Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
            kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
            significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
            Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
            persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
            de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
            función devuelve un 1.
        f) Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
            devuelve un booleano.
 */
package EjerciciosAprendizaje.E7;

public class Persona {
    private String nombre;
    private int edad;
    private String sexo;
    private float peso;
    private float altura;

    //  a)
    public Persona(){}

    //  b)
    public Persona(String nombre, int edad, String sexo, float peso, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    //  c)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}
