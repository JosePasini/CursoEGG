package egg_poo_8;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        char caracter;
        int vocalesTotales = 0, contadorCaracter = 0;
        String fraseDadaVuelta;
        String otraFrase;

        String frase = JOptionPane.showInputDialog("Ingrese frase por favor");
        Cadena cadena = new Cadena(frase, frase.length());

        JOptionPane.showMessageDialog(null, "Longitud: " + cadena.getLongitud());
        vocalesTotales = contarVocales(cadena.getFrase());
        System.out.println("vocalesTotales " + vocalesTotales);

        fraseDadaVuelta = invertirVocal(cadena.getFrase());
        JOptionPane.showMessageDialog(null, "Frase dada vuelta\n" + fraseDadaVuelta);
        System.out.println(fraseDadaVuelta);

        caracter = JOptionPane.showInputDialog("Ingrese caracter para ver cuantas veces se repite").charAt(0);
        contadorCaracter = vecesRepetido(frase, caracter);

        JOptionPane.showMessageDialog(null, "El caracter '" + caracter + "' se repite " + contadorCaracter + " veces");

        otraFrase = JOptionPane.showInputDialog("Ingrese otra frase por favor");

        cadena.compararLongitud(otraFrase);
        String fraseConcatenada = cadena.unirFrases(otraFrase);

        JOptionPane.showMessageDialog(null, "Frase concatenada\n" + fraseConcatenada);

        String caracterReemplaza = JOptionPane.showInputDialog("Ingrese caracter que reemplazará todas las 'a'");

        String fraseCaracterReemplazado = cadena.reemplazarCaracter(caracterReemplaza);

        JOptionPane.showMessageDialog(null, fraseCaracterReemplazado);

        String letra = JOptionPane.showInputDialog("Ingrese letra para ver si se encuentra en la frase");

        if (cadena.contieneLetra(letra)) {
            JOptionPane.showMessageDialog(null, "La letra " + letra.charAt(0) + "\nSi se encuentra en la frase " + cadena.getFrase());
        } else {
            JOptionPane.showMessageDialog(null, "La letra " + letra.charAt(0) + "\nNo se encuentra en la frase " + cadena.getFrase());
        }

    }

    public static int contarVocales(String c) {
        int contadorVocal = 0;
        for (int i = 0; i < c.length(); i++) {
            int v = (int) c.charAt(i);
            if (v == 65 || v == 69 || v == 73 || v == 79 || v == 85 || v == 97 || v == 101 || v == 105 || v == 111 || v == 117) {
                System.out.println((int) c.charAt(i));
                contadorVocal++;
            }
        }
        return contadorVocal;
    }

    public static String invertirVocal(String frase) {
        String fraseDadaVuelta = "";
        int j = 0;
        for (int i = frase.length() - 1; i >= 0; i--) {
            fraseDadaVuelta += frase.charAt(i);
        }
        return fraseDadaVuelta;
    }

    public static int vecesRepetido(String frase, char letra) {
        int cont = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letra) {
                cont++;
            }
        }
        return cont;
    }

}
