package provaa1;

public class Figura {

    private double altura;
    private double largura;

    public Figura(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }
    
    public void aumentaAltura(double quantidade){
    this.altura = altura += quantidade;
    
    }
    
    public void aumentaLagura(double quantidade){
    this.largura = largura += quantidade;
    }
    
    public void mostrar(){
        System.out.println("A altura e: " + altura);
        System.out.println("A largura e: " + largura);
    }
    
    public double calcularArea(){
    return altura*largura;
    }
    
    public void trocarAlturaPorLargura() {
        double temp = altura;
        altura = largura;
        largura = temp;
    }
    
    public String tipo() {
        if (altura == largura) {
            return "Quadrado";
        } else {
            return "Retângulo";
        }
    }
}
