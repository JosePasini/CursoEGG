package egg_poo_6;

import javax.swing.JOptionPane;

public class Cafetera {

    private int capacidad_maxima;
    private int cantidad_actual;

    public Cafetera() {
    }

    public Cafetera(int capacidad_maxima, int capacidad_actual) {
        this.capacidad_maxima = capacidad_maxima;
        this.cantidad_actual = capacidad_actual;
    }

    public int getCapacidad_maxima() {
        return capacidad_maxima;
    }

    public void setCapacidad_maxima(int capacidad_maxima) {
        this.capacidad_maxima = capacidad_maxima;
    }

    public int getCapacidad_actual() {
        return cantidad_actual;
    }

    public void setCapacidad_actual(int capacidad_actual) {
        this.cantidad_actual = capacidad_actual;
    }

    public void llenarCafetera() {
        this.cantidad_actual = this.capacidad_maxima;
    }

    public void servirTaza(int tamanioTaza) {
        int taza = 0;

        if (this.cantidad_actual >= tamanioTaza) {
            this.cantidad_actual -= tamanioTaza;
            taza = tamanioTaza;
            JOptionPane.showMessageDialog(null, "Taza llenada con exito. \n" + tamanioTaza + " ml");
        } else {

            taza = this.cantidad_actual;
            this.cantidad_actual -= taza;
            JOptionPane.showMessageDialog(null, "NO se llenó. \nSe sirvió "+ taza+ " ml de " + tamanioTaza + " ml");

        }
    }

    public void vaciarCafetera() {
        this.cantidad_actual = 0;
    }

    @Override
    public String toString() {
        return "Cafetera{" + "capacidad_maxima=" + capacidad_maxima + ", cantidad_actual=" + cantidad_actual + '}';
    }

    public void agregarCafe(int cafeAgregar) {
        if (cafeAgregar + this.cantidad_actual > this.capacidad_maxima) {
            this.cantidad_actual = this.capacidad_maxima;
            JOptionPane.showMessageDialog(null, "Cafetera LLENA \n " + this.cantidad_actual + " ml");
        } else {
            this.cantidad_actual += cafeAgregar;
        }

    }

}
