package questao3;

public class PlacaMae {
    private String fabricante;
    private String chipset;
    private int numeroSlots;
    private String tipoMemoria;

    public PlacaMae(String fabricante, String chipset, int numeroSlots, String tipoMemoria) {
        this.fabricante = fabricante;
        this.chipset = chipset;
        this.numeroSlots = numeroSlots;
        this.tipoMemoria = tipoMemoria;
    }
    public void verificarCompatibilidade() {
        System.out.println("Verificando compatibilidade da placaMae..");
    }
    public void monitorarTemperatura() {
        System.out.println("Monitorando temperatura da placaMae..");
    }
    public void atualizarBios() {
        System.out.println("Atualizando BIOS da placaMae..");
    }
    public void detectarDispositivos() {
        System.out.println("Detectando dispositivos conectados à placaMae..");
    }
}
