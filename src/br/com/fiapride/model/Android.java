package br.com.fiapride.model;

// Android É UM SmartPhone — herança válida
public class Android extends SmartPhone {

    // Atributo exclusivo do Android — versão do sistema operacional
    private String versaoAndroid;

    public Android(String marca, int armazenamento, double tamanhoTela, double valor,
                   Dono proprietario, String versaoAndroid) {
        super(marca, armazenamento, tamanhoTela, valor, proprietario);
        this.versaoAndroid = versaoAndroid;
    }

    public String getVersaoAndroid() {
        return this.versaoAndroid;
    }

    // ─────────────────────────────────────────────────────────────────────────
    // POLIMORFISMO — Android tem ecossistema aberto, mais vulnerável a vírus
    // Por isso sua taxa de seguro é maior: 15% do valor do aparelho
    // ─────────────────────────────────────────────────────────────────────────
    @Override
    public double calcularTaxaSeguro() {
        return this.getValor() * 0.15;
    }
}