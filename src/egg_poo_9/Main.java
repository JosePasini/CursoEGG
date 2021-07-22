package egg_poo_9;

public class Main {
    public static void main(String[] args) {
        double num_uno = Math.random() *9+1;
        double num_dos = Math.random() *9+1;
        
        Matematica matematica = new Matematica();
        num_uno = Math.round(num_uno*100.0)/100.0;
        num_dos = Math.round(num_dos*100.0)/100.0;
        matematica.setNum_uno(num_uno);
        matematica.setNum_dos(num_dos);
        System.out.println(matematica.getNum_uno() + " , " + matematica.getNum_dos());
        
        double mayor = matematica.devolverMayor();
        double potencia;
        double raiz;
        
        if (mayor == num_uno) {
            
            potencia = matematica.calcularPotencia(mayor, num_dos);
            raiz = matematica.calcularRaiz(num_dos);
        } else {
            potencia = matematica.calcularPotencia(num_dos, num_uno);
            raiz = matematica.calcularRaiz(num_uno);
        }
        System.out.println("Potencia: " +  potencia);
        System.out.println("Raiz cuadrada: " + raiz);
    }
    
}
