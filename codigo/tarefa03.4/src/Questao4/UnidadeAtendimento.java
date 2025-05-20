package Questao4;
import java.util.ArrayList;
import java.util.List;

public class UnidadeAtendimento {
    private String nome;
    private String tipos;
    private List<Medico> medicos = new ArrayList<>();

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public String getTipos() {return tipos;}
    public void setTipos(String tipos) {this.tipos = tipos;};
    public List<Medico> getMedicos() {return medicos;}
    public void setMedicos(List<Medico> medicos) {this.medicos = medicos;}

    public UnidadeAtendimento(String nome, String tipos) {
        this.nome = nome;
        this.tipos = tipos;
    }
    public void adicionarMedico(Medico medico) {
        medicos.add(medico);
    }
    public void removerMedico(Medico medico) {
        medicos.remove(medico);
    }
    public List<Medico> listarMedicos() {
        return medicos;
    }
}

