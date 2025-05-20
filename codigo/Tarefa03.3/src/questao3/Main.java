package questao3;

public class Main {
    public static void main(String[] args) {
        PlacaMae placa = new PlacaMae("Gigabyte", "Z590", 2, "DDR4");
        Computador acerV15 = new Computador("Acer", "V15", "Intel Core i7", "8GB", placa);

        acerV15.ligar();
        acerV15.executarDiagnostico();
        acerV15.atualizarMemoria("16GB");
        acerV15.desligar();
    }
}