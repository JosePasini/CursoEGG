package egg_poo_extra_6;

import javax.swing.JOptionPane;

public class Ahorcado {

    private String palabraBuscar;
    private char[] arregloPalabra;// = new String[palabraBuscar.length()];
    private char[] arregloPalabraAux;
    int jugadasMaximas;
    int palabrasEncontradas;

    public Ahorcado() {
    }

    public Ahorcado(String palabraBuscar, int jugadasMaximas) {
        this.palabraBuscar = palabraBuscar;
        this.jugadasMaximas = jugadasMaximas;
    }

    public String getPalabraBuscar() {
        return palabraBuscar;
    }

    public void setPalabraBuscar(String palabraBuscar) {
        this.palabraBuscar = palabraBuscar;
    }

    public char[] getArregloPalabra() {
        return arregloPalabra;
    }

    public void setArregloPalabra(char[] arregloPalabra) {
        this.arregloPalabra = arregloPalabra;
    }

    public int getJugadasMaximas() {
        return jugadasMaximas;
    }

    public void setJugadasMaximas(int jugadasMaximas) {
        this.jugadasMaximas = jugadasMaximas;
    }

    public int getPalabrasEncontradas() {
        return palabrasEncontradas;
    }

    public void setPalabrasEncontradas(int palabrasEncontradas) {
        this.palabrasEncontradas = palabrasEncontradas;
    }

    public void crearJuego() {
        this.palabraBuscar = JOptionPane.showInputDialog("Ingrese la palabra que luego desea buscar ").trim().toUpperCase();
        this.jugadasMaximas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de jugadas máximas paraa adivinar la palabra"));
        this.palabrasEncontradas = 0;

        arregloPalabra = new char[palabraBuscar.length()];
        arregloPalabraAux = new char[palabraBuscar.length()];
        
        for (int i = 0; i < arregloPalabra.length; i++) {
            arregloPalabra[i] = palabraBuscar.charAt(i);
            arregloPalabraAux[i] = '_';
            
        }

    }

    public void mostrarPalabra() {
        for (int i = 0; i < arregloPalabra.length; i++) {
            System.out.print(arregloPalabra[i] + " - ");
        }
    }

    public void longitud() {
        String barritas = "";
        for (int i = 0; i < arregloPalabraAux.length; i++) {
            barritas += arregloPalabraAux[i];
            barritas += " ";
        }
        JOptionPane.showMessageDialog(null, "La cantidad de letras a encontrar son: " + arregloPalabra.length
                + "\n" + barritas);

    }

    public boolean buscarLetra(char x) {
        boolean bandera = false;
        for (int i = 0; i < arregloPalabra.length; i++) {
            if (x == arregloPalabra[i]) {
                arregloPalabraAux[i] = x;
                bandera = true;
                JOptionPane.showMessageDialog(null, "Letra encontrada en la posición " + (i + 1));
            }
        }
        if (!bandera) {
            this.jugadasMaximas--;
            JOptionPane.showMessageDialog(null, "Letra NO encontrada.\nJuegadas disponibles: " + this.jugadasMaximas);
        }
        return bandera;
    }
    
    public boolean esGanador(){
        for (int i = 0; i < this.arregloPalabra.length; i++) {
            if (arregloPalabra[i] != arregloPalabraAux[i]) {
                return false;
            }
        }
        return true;
    }


}
