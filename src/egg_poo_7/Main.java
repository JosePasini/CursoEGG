package egg_poo_7;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        // Variables 
        int[] porcentaje_imc = new int[3];
        int[] porcentaje_sexo = new int[2];

        // Creación de objetos 
        Persona p = new Persona("jose", 26, 67, 175, 'H');
        Persona p3 = new Persona("Pedro", 15, 80, 170, 'H');
        Persona p4 = new Persona("García", 71, 65, 178, 'O');

        // Para el objeto 'P2' utilizamos el método creado en la clase
        Persona p2 = new Persona();
        p2.crearPersona();

        // To Strings
        System.out.println(p.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());

        //####################################//
        // Verificamos si es mayor de edad
        esMayorEdad(p, porcentaje_sexo);
        esMayorEdad(p2, porcentaje_sexo);
        esMayorEdad(p3, porcentaje_sexo);
        esMayorEdad(p4, porcentaje_sexo);

        JOptionPane.showMessageDialog(null, "MAYORES: " + porcentaje_sexo[0]
                                    + "\nMENORES: " + porcentaje_sexo[1]);

        //#############################################//
        // Verificamos el IMC 
        
        JOptionPane.showMessageDialog(null, p.getNombre() + " IMC: " + p.calcularIMC(porcentaje_imc)
                            + "\n" + p2.getNombre() + " IMC: " + p2.calcularIMC(porcentaje_imc) 
                            + "\n" + p3.getNombre() + " IMC: " + p3.calcularIMC(porcentaje_imc) 
                            + "\n" + p4.getNombre() + " IMC: " + p4.calcularIMC(porcentaje_imc));
        
        JOptionPane.showMessageDialog(null, "PESO POR DEBAJO DEL IDEAL: " + porcentaje_imc[0]
                                + "\nPESO IDEAL: " + porcentaje_imc[1]
                                + "\nPESO POR ARRIBA DEL IDEAL: " + porcentaje_imc[2]);

    }

    public static int esMayorEdad(Persona p, int[] porcentaje) {
        if (p.esMayorEdad()) {
            JOptionPane.showMessageDialog(null, p.getNombre() + " es mayor de edad con " + p.getEdad() + " años");
            porcentaje[0]++;
            return 1;
        } else {
            JOptionPane.showMessageDialog(null, p.getNombre() + " es menor de edad con " + p.getEdad() + " años");
            porcentaje[1]++;
            return 0;
        }
    }

}
