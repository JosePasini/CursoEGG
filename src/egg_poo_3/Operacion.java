package egg_poo_3;

import java.util.Scanner;

public class Operacion {

    private double num_uno;
    private double num_dos;
    Scanner sc = new Scanner(System.in);

    public Operacion() {
    }

    public Operacion(double num_uno, double num_dos) {
        this.num_uno = num_uno;
        this.num_dos = num_dos;
    }

    public double getNum_uno() {
        return num_uno;
    }

    public void setNum_uno(double num_uno) {
        this.num_uno = num_uno;
    }

    public double getNum_dos() {
        return num_dos;
    }

    public void setNum_dos(double num_dos) {
        this.num_dos = num_dos;
    }

    public void crearOperacion() {

        System.out.print("Ingrese numero uno: ");
        this.setNum_uno(sc.nextInt());

        System.out.print("Ingrese numero dos: ");
        this.setNum_dos(sc.nextInt());
    }

    public double sumar() {
        return this.num_uno + this.num_dos;
    }

    public double restar() {
        return this.num_uno - this.num_dos;
    }

    public double multiplicar() {
        if ((this.num_uno == 0) || (this.num_dos == 0)) {
            System.out.println("Numero incorrecto");
            return 0;
        } else {
            return this.num_uno * this.num_dos;
        }
    }

    public double dividir() {
        if (this.num_dos == 0) {
            System.out.println("No se puede dividir por 0");
            return 0;
        } else {
            return this.num_uno / this.num_dos;
        }
    }

}
