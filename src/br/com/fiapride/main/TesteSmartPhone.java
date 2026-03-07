package br.com.fiapride.main;

import br.com.fiapride.model.SmartPhone;

public class TesteSmartPhone {

    public static void main(String[] args) {

        System.out.println("--- Teste SmartPhone ---\n");

        // Instanciando com construtor
        SmartPhone meuCelular = new SmartPhone("Samsung", 128, 6.5);
        SmartPhone celularAmigo = new SmartPhone("Apple", 256, 6.1);

        System.out.println("Meu celular: " + meuCelular.getMarca());
        System.out.println("Celular do amigo: " + celularAmigo.getMarca());
        System.out.println("Bateria atual: " + meuCelular.getBateria() + "%");
        System.out.println("Armazenamento: " + meuCelular.getArmazenamento() + "MB");

        // Testes válidos
        System.out.println("\n--- Testes Válidos ---");
        meuCelular.carregarBateria(50);  // 0 + 50 = 50%
        meuCelular.instalarApp(40);      // 128 - 40 = 88MB

        // Testes inválidos — tentando burlar o sistema
        System.out.println("\n--- Tentando Burlar o Sistema ---");
        meuCelular.carregarBateria(-10); // erro: negativo
        meuCelular.instalarApp(500);     // erro: sem espaço
        meuCelular.carregarBateria(200); // limita em 100%

        // Tentando criar com armazenamento inválido
        System.out.println("\n--- Construtor com valor inválido ---");
        SmartPhone celularInvalido = new SmartPhone("Fake", -50, 5.0); // erro: armazenamento negativo
    }
}