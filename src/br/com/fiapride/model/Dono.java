package br.com.fiapride.model;

public class Dono {

    private String nome;
    private String email;

    public Dono(String nome, String email) {
        this.nome = nome;
        this.email = email;
        System.out.println("Dono registrado: " + this.nome);
    }

    public String getNome() { return this.nome; }
    public String getEmail() { return this.email; }
}
