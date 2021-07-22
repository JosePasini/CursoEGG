package egg_poo_7;

import javax.swing.JOptionPane;

public class Persona {

    final int PESO_IDEAL = -1;
    final int PESO_POR_DEBAJO = 0;
    final int PESO_POR_ARRIBA = 1;

    private String nombre;
    private int edad;
    private int peso;
    private int altura;
    private char sexo;

    public Persona() {
    }

    public Persona(String nombre, int edad, int peso, int altura, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public boolean comprobarSexo(char s) {
        boolean bandera;
        if (s == 'H' || s == 'M' || s == 'O' || s == 'h' || s == 'm' || s == 'o') {
            bandera = true;
        } else {
            bandera = false;
        }
        return bandera;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", altura=" + altura + ", sexo=" + sexo + '}';
    }

    public void crearPersona() {
        this.nombre = JOptionPane.showInputDialog("Ingrese nombre");
        this.edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad"));
        this.altura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese altura en cm"));
        this.peso = Integer.parseInt(JOptionPane.showInputDialog("Ingrese peso en kg"));
        String s = JOptionPane.showInputDialog("Ingrese sexo\n 'H', 'M', 'O' ");
        if (comprobarSexo(s.charAt(0))) {
            this.sexo = s.charAt(0);
        } else {
            JOptionPane.showInputDialog("Sexo incorrecto");
            this.sexo = '?';
        }
    }

    public int calcularIMC(int[] porcentaje_imc) {
        double alturaEnMt = (double) this.altura / 100;
        double imc = (double) this.peso / ((double) Math.pow(alturaEnMt, 2));
        JOptionPane.showMessageDialog(null, "IMC: " + imc);

        if (imc < 20) {
            porcentaje_imc[0]++;
            return PESO_POR_DEBAJO;
        } else if (imc >= 20 && imc <= 25) {
            porcentaje_imc[1]++;
            return PESO_IDEAL;
        } else if (imc > 25) {
            porcentaje_imc[2]++;
            return PESO_POR_ARRIBA;
        }
        return 99;
    }

    public boolean esMayorEdad() {
        if (edad >= 18) {
            return true;
        } else {
            return false;
        }
    }

}
