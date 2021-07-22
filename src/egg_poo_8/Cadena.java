package egg_poo_8;

import javax.swing.JOptionPane;

public class Cadena {
    
    private String frase;
    private int longitud;

    public Cadena(String frase, int longitud) {
        this.frase = frase;
        this.longitud = longitud;
    }

    public Cadena() {
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    
    public void compararLongitud(String otraFrase){
        int longitudOtraFrase = otraFrase.length();
        if (this.getLongitud() > longitudOtraFrase) {
            JOptionPane.showMessageDialog(null, "La frase de la clase es mayor\n" 
                                        + frase + " > " + otraFrase);
            
        } else if (this.getLongitud() < longitudOtraFrase) {
            JOptionPane.showMessageDialog(null, "La frase de la clase es menor\n"
                                        + otraFrase + " > " + frase);
        } else {
            JOptionPane.showMessageDialog(null, "La longitud es igual\n"
                                        + otraFrase + " = " + frase);
        }
    }
    
    public String unirFrases(String otraFrase){
        String fraseConcatenada = frase;
        fraseConcatenada = fraseConcatenada.concat(otraFrase);
        return fraseConcatenada;
    }
    
    public String reemplazarCaracter(String a){
        String fraseCaracterReemplazado = frase.replace("a", a);
        return fraseCaracterReemplazado;
    }
    
    public boolean contieneLetra(String letra){
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letra.charAt(0)) {
                return true;
            }
        }
        return false;
    }
    
}
