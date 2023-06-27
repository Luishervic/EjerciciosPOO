package EjerciciosAprendizaje.E8;

public class CadenaService {

    public Cadena crearCadena(){
        return new Cadena();
    }

    //  a)
    public void mostrarVocales(Cadena cadena){
        String frase = cadena.getFrase().toLowerCase();
        int contador = 0;
        for (int i = 0; i < cadena.getLongitud(); i++) {
            char caracter = frase.charAt(i);
            if (caracter == 'a' || caracter == 'e' || caracter == 'i'
                    || caracter == 'o' || caracter == 'u') {
                contador++;
            }
        }
        System.out.printf("Cantidad de vocales: %d\n", contador);;
    }

    //  b)
    public void invertirFrase(Cadena cadena){
        StringBuilder builder = new StringBuilder(cadena.getFrase());
        System.out.printf("Cadena invertida: %s\n", builder.reverse());
    }

    //  c)
    public void vecesRepetido(Cadena cadena, char letra){
        String frase = cadena.getFrase().toLowerCase();
        int contador = 0;
        for (int i = 0; i < cadena.getLongitud(); i++) {
            char caracter = frase.charAt(i);
            if (caracter == letra) {
                contador++;
            }
        }
        System.out.printf("La cadena contiene %d el caracter %c\n", contador, letra);
    }

    //  d)
    public void compararLongitud(Cadena cadena, String nuevaFrase){
        int longitud = cadena.getLongitud();
        int nuevaLongitud = nuevaFrase.length();

        if (longitud > nuevaLongitud) {
            System.out.printf("La cadena es menor a la anterior por %d caracteres", longitud - nuevaLongitud);
        }else {
            System.out.printf("La cadena es mayor a la anterior por %d caracteres", nuevaLongitud - longitud);
        }
    }

    //  e)
    public void unirFrase(Cadena cadena, String fraseAUnir){
        String frase = cadena.getFrase();
        System.out.println("La nueva frase es: " + frase + " " + fraseAUnir);
    }

    //  f)
    public void remplazar(Cadena cadena, char letra){
        String frase = cadena.getFrase().toLowerCase();
        frase = frase.replace('a', letra);
        System.out.printf("La nueva frase es %s\n", frase);
    }

    //  g)
    public void contiene(Cadena cadena, String letra){
        String frase = cadena.getFrase().toLowerCase();
        if (frase.contains(letra)) {
            System.out.println("Contiene la letra");
        }else{
            System.out.println("No contiene la letra");
        }
    }
}
