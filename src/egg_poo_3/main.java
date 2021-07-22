package egg_poo_3;

import java.util.Scanner;

public class main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Operacion o = new Operacion();
        
        o.crearOperacion();
        
        System.out.println(o.dividir());
        System.out.println(o.multiplicar());
        System.out.println(o.sumar());
        System.out.println(o.restar());
    }
    
}
