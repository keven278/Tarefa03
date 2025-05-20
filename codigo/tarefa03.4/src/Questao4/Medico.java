package Questao4;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.sql.Time;

public class Medico {
    private String nome;
    private String crm;
    private String especialidade;
    private List<Consulta> consultas = new ArrayList<>();

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public String getCrm() {return crm;}
    public void setCrm(String crm) {this.crm = crm;}
    public String getEspecialidade() {return especialidade;}
    public void setEspecialidade(String especialidade) {this.especialidade = especialidade;}
    public List<Consulta> getConsultas() {return consultas;}
    public void setConsultas(List<Consulta> consultas) {this.consultas = consultas;}

    public Medico(String nome, String crm, String especialidade) {
        this.nome = nome;
        this.crm = crm;
        this.especialidade = especialidade;
    }
    public void realizarConsulta(Paciente paciente, String descricao, Date data, Time hora) {
        Consulta consulta = new Consulta(data, hora, descricao);
        consultas.add(consulta);
        paciente.adicionarConsulta(consulta);
    }
    public List<Consulta> listarConsultas() {
        return consultas;
    }
}
