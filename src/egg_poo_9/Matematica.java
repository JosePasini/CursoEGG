package egg_poo_9;

public class Matematica {
    private double num_uno;
    private double num_dos;

    public Matematica() {
    }

    public Matematica(double num_uno, double num_dos) {
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
    
    public double devolverMayor(){
        if (this.num_uno > this.num_dos) {
            return num_uno;
        } else if (this.num_dos > this.num_uno){
            return num_dos;
        } else {
        return num_uno;
        }
    }
    
    public double calcularPotencia(double a, double b){
        System.out.println("Mayor: " +a);
        System.out.println("Menor: " +b);
        
        double p = Math.pow(a, b);
        System.out.println("P: " + p);
        p = Math.round(p*100.0)/100.0;
        System.out.println("P: " + p);
        return p;
    }

    public double calcularRaiz(double a) {
        a = Math.abs(a);
        double raiz = Math.sqrt(a);
        raiz = Math.round(raiz*100.0)/100.0;
        return raiz;
    }
    
    
}
