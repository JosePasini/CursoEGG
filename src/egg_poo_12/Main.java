
package egg_poo_12;

public class Main {
    public static void main(String[] args) {
        Persona p = new Persona();
        p.crearPersona();
        p.calcularEdad();
        System.out.println(p.menorQue(15));
        p.mostrarPersona();
    }
    
}
