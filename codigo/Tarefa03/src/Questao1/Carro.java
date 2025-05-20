package Questao1;

public class Carro {
    private String modelo;

    public Carro(String modelo) {
        this.modelo = modelo;
    }
    public void dirigir() {
        System.out.println("Dirigindo o carro modelo " + modelo);
    }
    public String getModelo() {
        return modelo;
    }
}