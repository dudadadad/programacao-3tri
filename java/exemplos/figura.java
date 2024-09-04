package exemplos;

public abstract class figura {
    private String nomeFigura;
    
    public String getNomefigura() {
        return nomeFigura;
    }
   
    public void setNomefigura(String nomeFigura) {
        this.nomeFigura = nomeFigura;
    }
    
    public abstract double calculaArea();
    
    public abstract double calculaPerimetro();
    
    @Override
    public String toString() {
        return "Figura: " + nomeFigura + ", Área: " + calculaArea() + ", Perímetro: " + calculaPerimetro();
    }
}
