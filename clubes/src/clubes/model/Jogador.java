
package clubes.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

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
        public int getVelocidade(int id) {
        Connection con;
        try {
            con = Conexao.conecta();
            Statement stmt = con.createStatement();
            String sql ="SELECT velocidade FROM jogador WHERE id = "+id+";";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
            int teste = rs.getInt("velocidade");
            this.velocidade = teste;
                System.out.println(teste);
            }
    
        } catch (Exception e) {
            System.out.println(e);
        }
        return this.velocidade;
    }

    public int getResistencia(int id) {
        Connection con;
        try {
            con = Conexao.conecta();
            Statement stmt = con.createStatement();
            String sql ="SELECT resistencia FROM jogador WHERE id = "+id+";";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
            int teste = rs.getInt("resistencia");
            this.resistencia = teste;
                System.out.println(teste);
            }
    
        } catch (Exception e) {
            System.out.println(e);
        }
        return this.resistencia;
    }
    public int getHabilidade(int id){
        Connection con;
        try {
            con = Conexao.conecta();
            Statement stmt = con.createStatement();
            String sql ="SELECT habilidade FROM jogador WHERE id = "+id+";";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
            int teste = rs.getInt("habilidade");
            this.habilidade = teste;
                System.out.println(teste);
            }
    
        } catch (Exception e) {
            System.out.println(e);
        }
        return this.habilidade;
    }

    public void setVelocidade(int id) {
                Connection con;
        try {
            con = Conexao.conecta();
            Statement stmt = con.createStatement();
            String sql = "UPDATE jogador SET velocidade = "+this.velocidade+" where id = "+id+";";
            stmt.executeUpdate(sql);
            
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void setResistencia(int id) {
        Connection con;
        try {
            con = Conexao.conecta();
            Statement stmt = con.createStatement();
            String sql = "UPDATE jogador SET resistencia = "+this.resistencia+" where id = "+id+";";
            stmt.executeUpdate(sql);
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void  setHabilidade(int id) {
        Connection con;
        try {
            con = Conexao.conecta();
            Statement stmt = con.createStatement();
            String sql = "UPDATE jogador SET habilidade = "+this.habilidade+" where id = "+id+";";
            stmt.executeUpdate(sql);
            
        } catch (Exception e) {
            System.out.println(e);
        }
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
    public void treinarVelocidade(int id){
        int novaVl = getVelocidade(id);
        novaVl++;
        this.velocidade = novaVl;
        setVelocidade(id);
    }    
    public void treinarResistencia(int id){
        int novaRs = getResistencia(id);
        novaRs++;
        this.resistencia = novaRs;
        setResistencia(id);
    }
    public void treinarHabilidade(int id){
        
        int novaHb = getHabilidade(id);
        novaHb++;
        this.habilidade = novaHb;
        setHabilidade(id);
    }
    public String demitir(int id){
       String demite = "DELETE FROM jogador WHERE id ="+id+";"; 
       return demite;
    }
}
