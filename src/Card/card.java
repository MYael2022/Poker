package Card;

public class card {
    private String palo;
    private String color;
    private String valor;

    
    public card(String palo, String color,String valor) {
     this.palo=palo;
     this.color=color;
     this.valor=valor; 
    } 


    public String getPalo() {
        return this.palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getValor() {
        return this.valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    
}
