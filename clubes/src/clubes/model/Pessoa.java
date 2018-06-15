package clubes.model;


public abstract class Pessoa {

    private String nome;
    private double peso;
    private double estatura;
    
    public abstract void engordar();
    public abstract void emagrecer();
    
    public Pessoa(String nome, double peso, double estatura) {
        this.nome = nome;
        this.peso = peso;
        this.estatura = estatura;
    }

    public Pessoa() {
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    
    
    
   
    
}
