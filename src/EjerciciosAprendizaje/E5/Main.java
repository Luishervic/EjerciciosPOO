package EjerciciosAprendizaje.E5;

public class Main {
    public static void main(String[] args) {
        //Ejercicio 5
        CuentaService cuentaService = new CuentaService();
        Cuenta cuentaEjemplo = cuentaService.crearCuenta();
        System.out.println(cuentaService.consultarSaldo(cuentaEjemplo));
        cuentaService.ingresarSaldo(cuentaEjemplo, 1000);
        System.out.println(cuentaService.consultarSaldo(cuentaEjemplo));
        cuentaService.retirarSaldo(cuentaEjemplo, 100);
        System.out.println(cuentaService.consultarSaldo(cuentaEjemplo));
        cuentaService.extraccionRapidaSaldo(cuentaEjemplo, 300);
        System.out.println(cuentaService.consultarSaldo(cuentaEjemplo));
        cuentaService.retirarSaldo(cuentaEjemplo, 800);
        System.out.println(cuentaService.consultarSaldo(cuentaEjemplo));
        cuentaService.retirarSaldo(cuentaEjemplo, 500);
        System.out.println(cuentaService.consultarSaldo(cuentaEjemplo));
    }
}
