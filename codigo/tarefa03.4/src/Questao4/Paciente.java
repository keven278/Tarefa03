package Questao4;
import java.util.ArrayList;
import java.util.List;

public class Paciente {
    private String nome;
    private String cpf;
    private List<Consulta> consultas = new ArrayList<>();

    public Paciente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    public List<Consulta> listarConsultas() {
        return consultas;
    }
    public void adicionarConsulta(Consulta consulta) {
        consultas.add(consulta);
    }
}
