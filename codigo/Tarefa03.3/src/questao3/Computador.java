package questao3;

public class Computador {
    private String marca;
    private String modelo;
    private String processador;
    private String memoriaRAM;
    private PlacaMae placaMae;

    public Computador(String marca, String modelo, String processador, String memoriaRAM, PlacaMae placaMae) {
        this.marca = marca;
        this.modelo = modelo;
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
        this.placaMae = placaMae;
    }

    public boolean ligar() {
        System.out.println("Ligando o computador " + marca + " " + modelo + "...");
        return true;
    }

    public boolean desligar() {
        System.out.println("Desligando o computador " + marca + " " + modelo + "...");
        return true;
    }

    public String atualizarMemoria(String novaMemoria) {
        this.memoriaRAM = novaMemoria;
        System.out.println("Memória RAM atualizada para: " + novaMemoria);
        return this.memoriaRAM;
    }

    public void executarDiagnostico() {
        System.out.println("Executando diagnóstico no computador...");
        placaMae.verificarCompatibilidade();
        placaMae.monitorarTemperatura();
        placaMae.detectarDispositivos();
    }
}
