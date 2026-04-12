package br.com.fiapride.model;

// Iphone É UM SmartPhone — herança válida
public class Iphone extends SmartPhone {

    // Atributo exclusivo do Iphone — geração do chip Apple Silicon
    private String versaoChip;

    public Iphone(String marca, int armazenamento, double tamanhoTela, Dono proprietario,
                  String versaoChip) {
        super(marca, armazenamento, tamanhoTela, proprietario);
        this.versaoChip = versaoChip;
    }

    public String getVersaoChip() {
        return this.versaoChip;
    }
}
