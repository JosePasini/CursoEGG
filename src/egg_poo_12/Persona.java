package egg_poo_12;

import java.time.LocalDate;
import java.time.Period;
import javax.swing.JOptionPane;

public class Persona {

    private String nombre;
    private LocalDate fechaNacimiento;
    private LocalDate hoy = LocalDate.now();
    private Period edad;

    public LocalDate getHoy() {
        return hoy;
    }

    public void setHoy(LocalDate hoy) {
        this.hoy = hoy;
    }

    public int getEdad() {
        return edad.getYears();
    }

    public void setEdad(Period edad) {
        this.edad = edad;
    }
    
    public Persona() {
    }

    public Persona(String nombre, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void crearPersona() {
        this.nombre = JOptionPane.showInputDialog("Ingrese nombre");

        int dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese día de nacimiento"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese mes de nacimiento"));
        int anio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese año de nacimiento"));

        fechaNacimiento = LocalDate.of(anio, mes, dia);
        System.out.println(fechaNacimiento);
    }

    public void calcularEdad() {
        this.edad = Period.between(fechaNacimiento, hoy);
        JOptionPane.showMessageDialog(null, "Su edad es: " + edad.getYears());
    }
    
    public boolean menorQue(int otraEdad){
        if (this.edad.getYears() < otraEdad) {
            JOptionPane.showMessageDialog(null, "Su edad es: " + edad.getYears() + " es menor que " + otraEdad);
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Su edad es: " + edad.getYears() + " es mayor que " + otraEdad);
            return false;
        }
    }
    
    public void mostrarPersona(){
        JOptionPane.showMessageDialog(null, "Nombre: " + this.getNombre()
        + "\nFecha de nacimiento: " + this.getFechaNacimiento() + " \nEdad: " + this.getEdad());
    }

}
