package egg_poo_2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Circunferencia c = new Circunferencia();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese radio: ");
        Double r = sc.nextDouble();
        
        c.setRadio(r);
        
        System.out.println(c.calcularArea());
        System.out.println(c.calcularPerimetro());
        
    }
    
}
