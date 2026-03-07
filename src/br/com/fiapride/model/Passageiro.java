package br.com.fiapride.model;

public class Passageiro {

    private String nome;
    private String cpf;
    private double saldo;

    // Construtor — obrigatório informar nome e cpf ao criar
    public Passageiro(String nome, String cpf) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setSaldo(0);
    }

    // Getters
    public double getSaldo() {
        return this.saldo;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    // Setters privados — só a própria classe pode usar
    private void setSaldo(double valor) {
        if (valor >= 0) {
            this.saldo = valor;
        } else {
            System.out.println("Erro: saldo negativo bloqueado!");
        }
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    private void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // Métodos de negócio
    public void adicionarSaldo(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: valor inválido.");
            return;
        }
        this.saldo += valor;
        System.out.println("Saldo adicionado! Novo saldo: R$ " + this.saldo);
    }

    public void pagarViagem(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: valor inválido.");
            return;
        }
        if (valor > this.saldo) {
            System.out.println("Erro: saldo insuficiente. Saldo atual: R$ " + this.saldo);
            return;
        }
        this.saldo -= valor;
        System.out.println("Viagem paga! Saldo restante: R$ " + this.saldo);
    }
}