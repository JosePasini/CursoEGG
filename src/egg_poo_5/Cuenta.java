package egg_poo_5;

public class Cuenta {

    private int numero_cuenta;
    private String DNI;
    private double saldo_actual;

    public Cuenta() {
    }

    public Cuenta(int numero_cuenta, String DNI, double saldo_actual) {
        this.numero_cuenta = numero_cuenta;
        this.DNI = DNI;
        this.saldo_actual = saldo_actual;
    }

    public int getNumero_cuenta() {
        return numero_cuenta;
    }

    public void setNumero_cuenta(int numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public double getSaldo_actual() {
        return saldo_actual;
    }

    public void setSaldo_actual(double saldo_actual) {
        this.saldo_actual = saldo_actual;
    }

    public void ingresar_dinero(double dinero) {
        this.saldo_actual += dinero;
        System.out.println("Se agregó " + dinero + "\nA la cuenta: " + this.numero_cuenta
                + "\nSaldo actual: " + this.saldo_actual);
    }

    public double retirar(double monto_a_retirar) {
        if (monto_a_retirar - this.saldo_actual > 0) {
            this.saldo_actual = this.saldo_actual - monto_a_retirar ;
            System.out.println("MONTO RETIRADO $" + monto_a_retirar);
            System.out.println("Saldo actual: $" + this.saldo_actual);
        } else {
            this.saldo_actual = 0;
        }
        return this.saldo_actual;
    }

    public double extraccion_rapida(double monto_a_retirar) {
        if (monto_a_retirar <= (this.saldo_actual * 0.2)) {
            this.saldo_actual = this.saldo_actual - monto_a_retirar ;
            System.out.println("xxxxxx EXTRACIÓN RAPIDA xxxxxx \n MONTO RETIRADO $" + monto_a_retirar);
            System.out.println("Saldo actual: $" + this.saldo_actual);
        } else {
            System.out.println("xxxxxx EXTRACCIÓN RAPIDA xxxxxx \nNo puede retirar más del 20%");
        }
        return this.saldo_actual;
    }
    
    public void consultar_saldo(){
        System.out.println("Saldo actual: " + this.saldo_actual);
    }
    
    public void consultar_datos(){
        System.out.println("Numero de cuenta: " + this.numero_cuenta 
                        + "\nNumero de DNI: " + this.DNI +
                           "\nSaldo actual: " + this.saldo_actual);
    }

}
