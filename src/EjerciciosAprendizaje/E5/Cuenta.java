/*
    Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
    numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
    Las operaciones asociadas a dicha clase son:
        a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
        b) Agregar los métodos getters y setters correspondientes
        c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
        d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
        y se la sumara a saldo actual.
        e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
        la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
        pondrá el saldo actual en 0.
        f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
        usuario no saque más del 20%.
        g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
        h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta.
 */
package EjerciciosAprendizaje.E5;

public class Cuenta {
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private int edad;
    private int numeroDeCuenta;
    private long DNICliente;
    private int saldoActual;

    //  a) Constructores.
    public Cuenta(){

    }

    public Cuenta(String nombre, String apellidoPaterno, String apellidoMaterno, int edad, int numeroDeCuenta, long DNICliente, int saldoActual) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.edad = edad;
        this.numeroDeCuenta = numeroDeCuenta;
        this.DNICliente = DNICliente;
        this.saldoActual = saldoActual;
    }

    //  b) Setters & getters.
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public long getDNICliente() {
        return DNICliente;
    }

    public void setDNICliente(long DNICliente) {
        this.DNICliente = DNICliente;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "nombre='" + nombre + '\'' +
                ", apellidoPaterno='" + apellidoPaterno + '\'' +
                ", apellidoMaterno='" + apellidoMaterno + '\'' +
                ", edad=" + edad +
                ", numeroDeCuenta=" + numeroDeCuenta +
                ", DNICliente=" + DNICliente +
                ", saldoActual=" + saldoActual +
                '}';
    }
}
