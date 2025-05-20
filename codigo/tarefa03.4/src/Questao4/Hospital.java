package Questao4;
import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private String nome;
    private String endereco;
    private List<UnidadeAtendimento> unidades = new ArrayList<>();

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public String getEndereco() {return endereco;}
    public void setEndereco(String endereco) {this.endereco = endereco;}
    public List<UnidadeAtendimento> getUnidades() {return unidades;}
    public void setUnidades(List<UnidadeAtendimento> unidades) {this.unidades = unidades;}

    public Hospital(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }
    public void adicionarUnidade(UnidadeAtendimento unidade) {
        unidades.add(unidade);
    }
    public void removerUnidade(UnidadeAtendimento unidade) {
        unidades.remove(unidade);
    }
    public List<UnidadeAtendimento> listarUnidades() {
        return unidades;
    }
}
