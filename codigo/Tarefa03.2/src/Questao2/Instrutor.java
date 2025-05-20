
package Questao2;
import java.util.ArrayList;
import java.util.List;
public class Instrutor {
    private String nome;
    private String formacao;
    private String email;
    private int experienciaAnos;
    private List<Curso> cursosMinistrados;

    public Instrutor(String nome, String formacao, String email, int experienciaAnos) {
        this.nome = nome;
        this.formacao = formacao;
        this.email = email;
        this.experienciaAnos = experienciaAnos;
        this.cursosMinistrados = new ArrayList<>();
    }
    public void ministrarCurso(Curso curso) {
        if (!cursosMinistrados.contains(curso)) {
            cursosMinistrados.add(curso);
            curso.adicionarInstrutor(this); // associação bidirecional
        }
    }
    public int atualizarExperiencia(int anos) {
        this.experienciaAnos = anos;
        return this.experienciaAnos;
    }
    public String alterarEmail(String novoEmail) {
        this.email = novoEmail;
        return this.email;
    }
    public void listarCursosMinistrados() {
        System.out.println("Cursos ministrados por " + nome + ":");
        for (Curso curso : cursosMinistrados) {
            System.out.println("- " + curso.getNome());
        }
    }
    public String getNome() {
        return nome;
    }
}