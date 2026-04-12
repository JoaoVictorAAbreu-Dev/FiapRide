package br.com.fiapride.model;

// Carro É UM Veiculo — relação "É UM" válida, herança correta
public class Carro extends Veiculo {

    // Atributo exclusivo do Carro — a mãe Veiculo não tem isso
    private int capacidadePassageiros;

    // Construtor: repassa placa e modelo para a mãe resolver, Carro cuida só do seu
    public Carro(String placa, String modelo, int capacidadePassageiros) {
        super(placa, modelo);
        this.setCapacidadePassageiros(capacidadePassageiros);
    }

    public int getCapacidadePassageiros() {
        return this.capacidadePassageiros;
    }

    private void setCapacidadePassageiros(int capacidadePassageiros) {
        if (capacidadePassageiros > 0) {
            this.capacidadePassageiros = capacidadePassageiros;
        } else {
            System.out.println("Erro: capacidade de passageiros inválida.");
        }
    }
}
