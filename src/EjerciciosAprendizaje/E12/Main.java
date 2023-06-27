package EjerciciosAprendizaje.E12;

public class Main {
    public static void main(String[] args) {
        //Ejercicio 12.
        PersonaService personaService = new PersonaService();
        Persona persona = personaService.crearPersona();
        personaService.calcularEdad(persona);
        System.out.println(personaService.menorQue(persona, 20));
        System.out.println(persona.mostrarPersona());
    }
}
