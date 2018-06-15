
package clubes.model;

public class Jogador extends Pessoa{
    
    private int velocidade;
    private int resistencia;
    private int habilidade;
    private double salario;
    private double multa;
    private int tempoContrato;
    private boolean pernaDireita;

    public Jogador(int velocidade, int resistencia, int habilidade, double salario, double multa, int tempoContrato, boolean pernaDireita, String nome, double peso, double estatura) {
        super(nome, peso, estatura);
        this.velocidade = velocidade;
        this.resistencia = resistencia;
        this.habilidade = habilidade;
        this.salario = salario;
        this.multa = multa;
        this.tempoContrato = tempoContrato;
        this.pernaDireita = pernaDireita;
    }
    public Jogador() {
    }

    @Override
    public void engordar() {
        double massaCorporal;
        massaCorporal = this.getPeso()+1;
        this.setPeso(massaCorporal);
    }
    public void engordar(double umPeso) {
        double massaCorporal;
        massaCorporal = this.getPeso()+umPeso;
        this.setPeso(massaCorporal);
    }
    @Override
    public void emagrecer() {
        double massaCorporal;
        massaCorporal = this.getPeso()-1;
        this.setPeso(massaCorporal);
    }
    public void emagrecer(double umPeso) {
        double massaCorporal;
        massaCorporal = this.getPeso()-umPeso;
        this.setPeso(massaCorporal);
    }
    
   public String demitir(int id){
       
       String demite = "DELETE FROM joga10 WHERE id ="+id+";"; 
       return demite;
   }
    
    

    
    
               
    
}
