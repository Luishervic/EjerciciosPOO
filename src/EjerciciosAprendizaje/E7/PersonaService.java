package EjerciciosAprendizaje.E7;

import java.util.Scanner;

public class PersonaService {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    //  d)
    public Persona crearPersona(){
        System.out.println("Ingrese el nombre de la persona:");
        String nombre = leer.next();
        System.out.println("Ingrese la edad:");
        int edad = leer.nextInt();
        System.out.println("Ingrese el sexo: ('H' hombre, 'M' mujer, 'O' otro)");

        String sexo = leer.next();
        while (!sexo.equals("H") && !sexo.equals("M") && !sexo.equals("O") ){
            System.out.println("Sexo no válido, intente nuevamente.");
            sexo = leer.next();
        }

        System.out.println("Ingrese el peso");
        float peso = leer.nextFloat();
        System.out.println("Ingrese la altura:");
        float altura = leer.nextFloat();
        return new Persona(nombre,edad,sexo,peso,altura);
    }

    //  e)
    public int calcularIMC(Persona persona){
        double imc = persona.getPeso()/Math.pow(persona.getAltura(), 2);
        if (imc < 20) {
            return -1;            
        } else if (imc >= 20 && imc <= 25)  {
            return 0;
        } else {
            return 1;
        }
    }

    //  f)
    public boolean esMayorDeEdad(Persona persona){
        if (persona.getEdad() >= 18) {
            return true;
        }else {
            return false;
        }
    }

}
