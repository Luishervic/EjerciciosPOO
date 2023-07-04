/*
    Crea una clase en Java donde declares una variable de tipo array de Strings que
    contenga los doce meses del año, en minúsculas. A continuación, declara una variable
    mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo,
    mesSecreto = mes[9]. El programa debe pedir al usuario que adivine el mes secreto. Si el
    usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar
    el mes secreto.
 */

package EjerciciosExtra.E5;

import java.util.Random;


public class JuegoMes {
    static Random random = new Random();
    private String mesSecreto;
    private String [] meses = {"enero","febrero","marzo","abril","mayo","junio","julio",
            "agosto","septiembre","octubre","noviembre","diciembre"};
    int numeroAleatorio = random.nextInt(12);

    public JuegoMes() {
        mesSecreto = meses[numeroAleatorio];
    }


    public boolean verificar(String mes){
        return mes.equals(mesSecreto);
    }


}
