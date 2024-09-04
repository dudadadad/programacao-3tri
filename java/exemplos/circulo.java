package exemplos;

public class circulo extends figura {
    private double raio;
    
    public circulo() {
        setNomefigura("circulo");
    }
    
    public double getRaio() {
        return raio;
    }
    
    public void setRaio(double raio) {
        this.raio = raio;  // Corrigido para atribuir o valor ao atributo 'raio'
    }
    
    @Override 
    public double calculaArea() {
        return Math.PI * Math.pow(raio, 2);   
    }
    
    @Override 
    public double calculaPerimetro() {
        return 2 * Math.PI * raio;
    }
}
