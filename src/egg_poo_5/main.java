package egg_poo_5;

public class main {

    public static void main(String[] args) {
        Cuenta c = new Cuenta(1111, "39234900", 10000);
        c.consultar_saldo();

        System.out.println("***");
        c.consultar_datos();
        System.out.println("***");
        
        c.extraccion_rapida(2000);
        
        
    }

}
