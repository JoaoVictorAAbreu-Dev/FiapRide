package br.com.fiapride.model;

public class Garrafa {

    private String cor;
    private String material;
    private int capacidadeEmMl;

    // Construtor — cor e material são essenciais para existir
    public Garrafa(String cor, String material) {
        this.setCor(cor);
        this.setMaterial(material);
        this.capacidadeEmMl = 0;
    }

    // Getters
    public String getCor() { return this.cor; }
    public String getMaterial() { return this.material; }
    public int getCapacidadeEmMl() { return this.capacidadeEmMl; }

    // Setters privados com regra
    private void setCor(String cor) {
        this.cor = cor;
    }

    private void setMaterial(String material) {
        this.material = material;
    }

    // Regra especial: capacidade entre 1 e 3000ml
    public void definirCapacidade(int valor) {
        if (valor > 0 && valor <= 3000) {
            this.capacidadeEmMl = valor;
            System.out.println("Capacidade definida: " + this.capacidadeEmMl + "ml");
        } else {
            System.out.println("Erro: capacidade deve ser entre 1 e 3000ml.");
        }
    }
}