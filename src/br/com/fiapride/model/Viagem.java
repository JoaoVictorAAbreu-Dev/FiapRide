package br.com.fiapride.model;

public class Viagem {

    // 1. Atributos simples
    private String destino;
    private double valor;

    // 2. Atributos de associação — nomes indicam o PAPEL de cada objeto
    private Passageiro solicitante;
    private Veiculo veiculoUtilizado;

    // 3. Construtor — uma Viagem só pode existir com destino, passageiro e veículo
    public Viagem(String destino, Passageiro solicitante, Veiculo veiculoUtilizado) {
        this.destino = destino;
        this.solicitante = solicitante;
        this.veiculoUtilizado = veiculoUtilizado;
        this.valor = 0.0; // calculado depois
        System.out.println("Nova viagem solicitada para: " + this.destino);
    }

    // 4. Métodos de ação
    public void exibirResumo() {
        System.out.println("\n--- RESUMO DA VIAGEM ---");
        System.out.println("Destino: " + this.destino);
        System.out.println("Passageiro: " + this.solicitante.getNome());
        System.out.println("Veículo: " + this.veiculoUtilizado.getModelo()
                + " (Placa: " + this.veiculoUtilizado.getPlaca() + ")");
        System.out.println("------------------------\n");
    }

    // Getters
    public String getDestino() { return this.destino; }
    public Passageiro getSolicitante() { return this.solicitante; }
    public Veiculo getVeiculoUtilizado() { return this.veiculoUtilizado; }
}
