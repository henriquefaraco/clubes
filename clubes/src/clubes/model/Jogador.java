
package clubes.model;

public class Jogador extends Pessoa{
    
    private int velocidade;
    private int resistencia;
    private int habilidade;

    public int getVelocidade() {
        
        return velocidade;
    }

    public int getResistencia() {
        return resistencia;
    }

    public int getHabilidade() {
        return this.habilidade;
        
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public void setHabilidade(int id) {
        String sql = "SELECT habilidade FROM jogador WHERE id = "+id+";";
        this.habilidade = Integer.parseInt(sql);
    }
    
    
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
    public void treinarVelocidade(){
        if(this.velocidade < 6){
            int velNova = this.velocidade++;
        }else{
            int velNova = this.velocidade;
        }
    }    
    public void treinarResistencia(){
        if(this.resistencia < 6){
            int velNova = this.resistencia++;
        }else{
            int velNova = this.resistencia;
        }
    }
    public String treinarHabilidade(int id){
        int novaHb = this.getHabilidade()+1;
        String sql = "UPDATE jogador SET habilidade = "+novaHb+" where id = "+id+";";
        
        
       /* if(this.habilidade < 6){
            int velNova = this.habilidade++;
            th = "UPDATE jogador SET habilidade = "+this.habilidade+" where id = "+id+";";
        }else
            this.habilidade= this.habilidade;
            th = "UPDATE jogador SET habilidade = "+this.habilidade+" where id = "+id+";";
        */return sql;
    }    
    
    public String demitir(int id){
       String demite = "DELETE FROM jogador WHERE id ="+id+";"; 
       return demite;
    }
}
