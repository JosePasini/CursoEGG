package egg_poo_1;

import java.util.Scanner;

public class main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Libro l = new Libro();
        pedirDatosLibro(l);
        darDatos(l);
        
    }
    
    public static void pedirDatosLibro(Libro l){
        
        System.out.print("Ingrese ISBN: ");
        String ISBN = sc.nextLine();
        
        System.out.print("Ingrese autor: ");
        String autor = sc.nextLine();
        
        System.out.print("Ingrese titulo: ");
        String titulo = sc.nextLine();
        
        System.out.print("Ingrese numero de páginas: ");
        int numero_paginas = sc.nextInt();
        
        l.setAutor(autor);
        l.setISBN(ISBN);
        l.setNumero_paginas(numero_paginas);
        l.setTitulo(titulo);
        
    }
    
    public static void darDatos(Libro l){
        System.out.println("ISBN: " + l.getISBN()
                            + "\nAutor: " + l.getAutor() + " \nTitulo: " + l.getTitulo()
                            + "\nNumero de páginas: " + l.getNumero_paginas());
        
    }
    
}
