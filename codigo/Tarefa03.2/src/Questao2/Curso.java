package Questao2;

import java.util.ArrayList;
import java.util.List;
public class Curso {
    private String nome;
    private int cargaHoraria;
    private String nivel;
    private String descricao;
    private List<Instrutor> instrutores;

    public Curso(String nome, int cargaHoraria, String nivel, String descricao) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.nivel = nivel;
        this.descricao = descricao;
        this.instrutores = new ArrayList<>();
    }
    public void adicionarInstrutor(Instrutor instrutor) {
        if (!instrutores.contains(instrutor)) {
            instrutores.add(instrutor);
        }
    }
    public void removerInstrutor(Instrutor instrutor) {
        instrutores.remove(instrutor);
    }
    public String atualizarDescricao(String novaDescricao) {
        this.descricao = novaDescricao;
        return this.descricao;
    }
    public void listarInstrutores() {
        System.out.println("Instrutores do curso " + nome + ":");
        for (Instrutor instrutor : instrutores) {
            System.out.println("- " + instrutor.getNome());
        }
    }
    public String getNome() {
        return nome;
    }
}