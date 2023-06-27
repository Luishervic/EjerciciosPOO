/*

    Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
    los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
    tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
    persona es mayor de edad.
    Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
    distintas variables, para después en el main, calcular un porcentaje de esas 4 personas

    cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
    también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores.

 */

package EjerciciosAprendizaje.E7;

public class Main {
    public static void main(String[] args) {
        //Ejercicio 7
        PersonaService personaService = new PersonaService();
        Persona luis = personaService.crearPersona();
        Persona jesus = personaService.crearPersona();
        Persona vicente = personaService.crearPersona();
        Persona daniel = personaService.crearPersona();

        int imcLuis = personaService.calcularIMC(luis);
        int imcJesus = personaService.calcularIMC(jesus);
        int imcVicente = personaService.calcularIMC(vicente);
        int imcDaniel = personaService.calcularIMC(daniel);

        System.out.println(imcLuis);
        System.out.println(imcJesus);
        System.out.println(imcVicente);
        System.out.println(imcDaniel);

        boolean mayorLuis = personaService.esMayorDeEdad(luis);
        boolean mayorJesus = personaService.esMayorDeEdad(jesus);
        boolean mayorVicente = personaService.esMayorDeEdad(vicente);
        boolean mayorDaniel = personaService.esMayorDeEdad(daniel);

        int[] imc = {imcLuis, imcJesus, imcVicente, imcDaniel};
        int personasEnPesoIdeal = 0;
        int personasPorDebajoPesoIdeal = 0;
        int personasConSobrepeso = 0;
        int totalPersonas = imc.length;

        for (int i = 0; i < totalPersonas; i++) {
            if (imc[i] == 0) {
                personasEnPesoIdeal++;
            } else if (imc[i] == -1) {
                personasPorDebajoPesoIdeal++;
            } else if (imc[i] == 1) {
                personasConSobrepeso++;
            }
        }

        float porcentajePesoIdeal = (personasEnPesoIdeal * 100) / totalPersonas;
        float porcentajePorDebajoPesoIdeal = (personasPorDebajoPesoIdeal * 100) / totalPersonas;
        float porcentajeSobrepeso = (personasConSobrepeso * 100) / totalPersonas;

        System.out.println("Porcentaje de personas en su peso ideal: " + porcentajePesoIdeal + "%");
        System.out.println("Porcentaje de personas por debajo del peso ideal: " + porcentajePorDebajoPesoIdeal + "%");
        System.out.println("Porcentaje de personas con sobrepeso: " + porcentajeSobrepeso + "%");


        boolean[] edades = {mayorLuis, mayorJesus, mayorVicente, mayorDaniel};
        int personasMayores = 0;
        int personasMenores = 0;
        int totalEdades = edades.length;

        for (int i = 0; i < totalEdades; i++) {
            if (edades[i]) {
                personasMayores++;
            }else {
                personasMenores++;
            }
        }

        float porcentajeMayorDeEdad = (personasMayores * 100) / totalPersonas;
        float porcentajeMenorDeEdad = (personasMenores * 100) / totalPersonas;

        System.out.println("Porcentaje de personas mayores es: "+ porcentajeMayorDeEdad + "%");
        System.out.println("Porcentaje de personas menores: " + porcentajeMenorDeEdad + "%");
    }
}
