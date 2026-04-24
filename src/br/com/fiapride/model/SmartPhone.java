package br.com.fiapride.model;

public class SmartPhone {

    private static final int BATERIA_MAXIMA = 100;

    private String marca;
    private int armazenamento;
    private double tamanhoTela;
    private int bateria;
    private double valor;

    // Atributo de associação — indica o PAPEL do objeto: quem possui este aparelho
    private Dono proprietario;

    // Construtor — um SmartPhone só pode ser criado com um dono definido
    public SmartPhone(String marca, int armazenamento, double tamanhoTela, double valor, Dono proprietario) {
        this.setMarca(marca);
        this.setArmazenamento(armazenamento);
        this.setTamanhoTela(tamanhoTela);
        this.setValor(valor);
        this.bateria = 0;
        this.proprietario = proprietario;
    }

    // Getters
    public String getMarca()             { return this.marca; }
    public int    getArmazenamento()     { return this.armazenamento; }
    public double getTamanhoTela()       { return this.tamanhoTela; }
    public int    getBateria()           { return this.bateria; }
    public double getValor()             { return this.valor; }
    public Dono   getProprietario()      { return this.proprietario; }

    // Setters privados com regras
    private void setMarca(String marca) {
        this.marca = marca;
    }

    private void setArmazenamento(int armazenamento) {
        if (armazenamento > 0) {
            this.armazenamento = armazenamento;
        } else {
            System.out.println("Erro: armazenamento inválido.");
        }
    }

    private void setTamanhoTela(double tamanhoTela) {
        this.tamanhoTela = tamanhoTela;
    }

    private void setValor(double valor) {
        if (valor > 0) {
            this.valor = valor;
        } else {
            System.out.println("Erro: valor inválido.");
        }
    }

    // ─────────────────────────────────────────────────────────────────────────
    // MÉTODO POLIMÓRFICO — resposta GENÉRICA da superclasse
    // Cada subclasse vai sobrescrever com sua própria regra de negócio
    // ─────────────────────────────────────────────────────────────────────────
    public double calcularTaxaSeguro() {
        // Regra genérica: 10% do valor do aparelho
        return this.valor * 0.10;
    }

    // Métodos de negócio (herdados como estavam)
    public void carregarBateria(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Erro: quantidade deve ser maior que zero.");
            return;
        }
        this.bateria = Math.min(this.bateria + quantidade, BATERIA_MAXIMA);
        System.out.println("Bateria: " + this.bateria + "%");
    }

    public void instalarApp(int tamanhoEmMb) {
        if (tamanhoEmMb <= 0) {
            System.out.println("Erro: tamanho inválido.");
            return;
        }
        if (tamanhoEmMb > this.armazenamento) {
            System.out.println("Erro: armazenamento insuficiente. Disponível: " + this.armazenamento + "MB");
            return;
        }
        this.armazenamento -= tamanhoEmMb;
        System.out.println("App instalado! Armazenamento restante: " + this.armazenamento + "MB");
    }
}