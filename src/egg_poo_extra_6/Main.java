package egg_poo_extra_6;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        Ahorcado a = new Ahorcado();
        a.crearJuego();
        a.mostrarPalabra();
        a.longitud();

        while (a.getJugadasMaximas() != 0) {
            char x = JOptionPane.showInputDialog("Ingrese letra a buscar").toUpperCase().charAt(0);
            a.buscarLetra(x);
            a.longitud();
            if (a.esGanador()) {
                JOptionPane.showMessageDialog(null, "FELICITACIONES! \nHa ganado el juego.");
                a.setJugadasMaximas(0);
            }
        }

    }

}
