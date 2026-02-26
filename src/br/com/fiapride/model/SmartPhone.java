package br.com.fiapride.model;

public class SmartPhone {

    private static final int BATERIA_MAXIMA = 100;

    public String marca;
    public int armazenamento;
    public double tamanhoTela;
    public int bateria;

    public void carregarBateria(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Erro: quantidade deve ser maior que zero.");
            return;
        }
        bateria = Math.min(bateria + quantidade, BATERIA_MAXIMA);
        System.out.println("Bateria: " + bateria + "%");
    }

    public void instalarApp(int tamanhoEmMb) {
        if (tamanhoEmMb <= 0) {
            System.out.println("Erro: tamanho inválido.");
            return;
        }
        if (tamanhoEmMb > armazenamento) {
            System.out.println("Erro: armazenamento insuficiente. Disponível: " + armazenamento + "MB");
            return;
        }
        armazenamento -= tamanhoEmMb;
        System.out.println("App instalado! Armazenamento restante: " + armazenamento + "MB");
    }
}