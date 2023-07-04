package EjerciciosAprendizaje.E5;

import java.util.Random;
import java.util.Scanner;

public class CuentaService {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private Random random = new Random();

    // c)
    public Cuenta crearCuenta(){
        System.out.println("Ingrese su nombre:");
        String nombre = leer.next();
        System.out.println("Ingrese apellido paterno:");
        String apellidoPaterno = leer.next();
        System.out.println("Ingrese apellido materno:");
        String apellidoMaterno = leer.next();
        System.out.println("Ingrese edad:");
        int edad = leer.nextInt();
        int numeroCuenta = random.nextInt(10000);
        System.out.println("Ingrese su DNI");
        int Dni = leer.nextInt();
        System.out.println("Ingrese la cantidad de saldo a ingresar, sino quiere hacerlo ingrese 0");
        int saldoActual = leer.nextInt();
        return new Cuenta(nombre,apellidoPaterno,apellidoMaterno,edad,numeroCuenta,Dni,saldoActual);
    }

    //  d)
    public void ingresarSaldo(Cuenta cuenta, int saldo){
        cuenta.setSaldoActual(cuenta.getSaldoActual()+saldo);
    }

    //  e)
    public void retirarSaldo(Cuenta cuenta, int saldo){
        if (saldo > cuenta.getSaldoActual()) {
            cuenta.setSaldoActual(0);
        }else {
            cuenta.setSaldoActual(cuenta.getSaldoActual() - saldo);
        }
    }

    //  f)
    public void extraccionRapidaSaldo(Cuenta cuenta, int saldo){
        if (saldo >= (cuenta.getSaldoActual() * 0.20)) {
            System.out.println("No puedes retirar mas del 20% de tu saldo...!!!");

        }else {
            cuenta.setSaldoActual(cuenta.getSaldoActual() - saldo);

        }
    }

    //  g)
    public int consultarSaldo(Cuenta cuenta){
        return cuenta.getSaldoActual();
    }

    //  h)
    public String consultarDatos(Cuenta cuenta){
        return cuenta.toString();
    }
}
