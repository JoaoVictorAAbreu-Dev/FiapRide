package br.com.fiapride.model;

// Iphone É UM SmartPhone — herança válida
public class Iphone extends SmartPhone {

    // Atributo exclusivo do Iphone — geração do chip Apple Silicon
    private String versaoChip;

    public Iphone(String marca, int armazenamento, double tamanhoTela, double valor,
                  Dono proprietario, String versaoChip) {
        super(marca, armazenamento, tamanhoTela, valor, proprietario);
        this.versaoChip = versaoChip;
    }

    public String getVersaoChip() {
        return this.versaoChip;
    }

    // ─────────────────────────────────────────────────────────────────────────
    // POLIMORFISMO — iPhone é um produto premium com alto custo de reposição
    // Por isso sua taxa de seguro é a mais alta: 20% do valor do aparelho
    // ─────────────────────────────────────────────────────────────────────────
    @Override
    public double calcularTaxaSeguro() {
        return this.getValor() * 0.20;
    }
}