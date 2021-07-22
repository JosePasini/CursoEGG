package egg_poo_6;

public class main {

    public static void main(String[] args) {
        Cafetera cafetera = new Cafetera(1000, 100);

        System.out.println(cafetera.toString());

        cafetera.servirTaza(140);
        
        
        cafetera.agregarCafe(350);

        
        
        
        System.out.println("************");

        System.out.println(cafetera.toString());

    }
}
