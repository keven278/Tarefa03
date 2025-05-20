import Questao1.Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Keven");

        p1.usarcarro("Oroch");
        p1.usarcarro("Gol");
        System.out.println("Histórico de carros usados por " + p1.getHistorico().size());
    }
}