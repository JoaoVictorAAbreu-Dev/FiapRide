package br.com.fiapride.model;

// Android É UM SmartPhone — herança válida
public class Android extends SmartPhone {

    // Atributo exclusivo do Android — versão do sistema operacional
    private String versaoAndroid;

    public Android(String marca, int armazenamento, double tamanhoTela, Dono proprietario,
                   String versaoAndroid) {
        super(marca, armazenamento, tamanhoTela, proprietario);
        this.versaoAndroid = versaoAndroid;
    }

    public String getVersaoAndroid() {
        return this.versaoAndroid;
    }
}
