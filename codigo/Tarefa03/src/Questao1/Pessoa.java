package Questao1;
import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private List<Carro> historico;

    public Pessoa(String nome) {
        this.nome = nome;
        this.historico = new ArrayList<>();
    }
    public void usarcarro(String modeloCarro) {
        Carro carro = new Carro(modeloCarro);
        historico.add(carro);
        System.out.println(nome + " está usando o carro " + modeloCarro);
        carro.dirigir();
    }

    public List<Carro> getHistorico() {
        return historico;
    }
}

