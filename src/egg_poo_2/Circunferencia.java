package egg_poo_2;

public class Circunferencia {
    private Double radio;

    public Circunferencia(Double radio) {
        this.radio = radio;
    }

    public Circunferencia() {
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }
    
    public Double calcularArea(){
        Double area;
        area = Math.PI * Math.pow(radio, 2);
        return area;
    }
    
        
    public Double calcularPerimetro(){
        Double perimetro;
        perimetro = 2 * Math.PI * radio;
        return perimetro;
    }
    
}
