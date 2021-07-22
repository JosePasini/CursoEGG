package egg_poo_4;

public class Rectangulo {

    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double superficie() {
        return this.base * this.altura;
    }

    public double perimetro() {
        return (this.base + this.altura) * 2;
    }

    public void dibujarCuadrado() {
        int b = (int) this.base;
        int a = (int) this.altura;

        for (int i = 0; i < b; i++) {
            System.out.print("* ");
        }
        
        for (int i = 0; i < a - 1; i++) {
            System.out.print("* ");
            for (int j = 0; j < b - 1; j++) {
                System.out.print("  ");
                if (j == b - 2 && (i != 0)) {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
        for (int i = 0; i < b; i++) {
            System.out.print("* ");
        }

    }

}
