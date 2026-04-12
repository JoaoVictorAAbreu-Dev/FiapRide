package br.com.fiapride.main;

import br.com.fiapride.model.Android;
import br.com.fiapride.model.Dono;
import br.com.fiapride.model.Iphone;

public class TesteSmartPhone {

    public static void main(String[] args) {

        System.out.println("--- Teste SmartPhone: Herança ---\n");

        // 1. Criando os donos
        Dono joao = new Dono("João", "joao@email.com");
        Dono lucia = new Dono("Lucia", "lucia@email.com");

        // 2. Instanciando subclasses — cada uma com seu atributo exclusivo
        Android celularDoJoao = new Android("Samsung", 128, 6.5, joao, "Android 14");
        Iphone celularDaLucia = new Iphone("Apple", 256, 6.1, lucia, "A18 Pro");

        // 3. Prova da herança: Android e Iphone acessam métodos da mãe SmartPhone
        //    sem que esses métodos tenham sido reescritos nelas!
        System.out.println("\n--- Teste de Herança ---");
        System.out.println("Dono: " + celularDoJoao.getProprietario().getNome()
                + " | Marca: " + celularDoJoao.getMarca()
                + " | SO: " + celularDoJoao.getVersaoAndroid());

        System.out.println("Dona: " + celularDaLucia.getProprietario().getNome()
                + " | Marca: " + celularDaLucia.getMarca()
                + " | Chip: " + celularDaLucia.getVersaoChip());

        // 4. Métodos herdados funcionando normalmente
        System.out.println("\n--- Métodos herdados de SmartPhone ---");
        celularDoJoao.carregarBateria(80);
        celularDoJoao.instalarApp(40);
        celularDaLucia.carregarBateria(100);

        // 5. Testes inválidos
        System.out.println("\n--- Tentando burlar o sistema ---");
        celularDoJoao.carregarBateria(-5);
        celularDoJoao.instalarApp(999);
    }
}