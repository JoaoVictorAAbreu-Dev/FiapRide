package br.com.fiapride.model;

// Moto É UM Veiculo — relação "É UM" válida, herança correta
public class Moto extends Veiculo {

    // Atributo exclusivo da Moto — diferencia motos elétricas das convencionais
    private boolean isEletrica;

    public Moto(String placa, String modelo, boolean isEletrica) {
        super(placa, modelo);
        this.isEletrica = isEletrica;
    }

    public boolean isEletrica() {
        return this.isEletrica;
    }
}
