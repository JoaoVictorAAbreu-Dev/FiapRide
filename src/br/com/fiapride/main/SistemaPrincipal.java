package br.com.fiapride.main;

import br.com.fiapride.model.Garrafa;
import br.com.fiapride.model.Passageiro;
import br.com.fiapride.model.SmartPhone;

public class SistemaPrincipal {

    public static void main(String[] args) {
        exibirPassageiros();
        exibirGarrafas();
        exibirSmartPhones();
    }

    private static void exibirPassageiros() {
        Passageiro passageiro1 = new Passageiro();
        passageiro1.nome  = "Ana Silva";
        passageiro1.saldo = 50.0;

        Passageiro passageiro2 = new Passageiro();
        passageiro2.nome  = "Carlos Souza";
        passageiro2.saldo = 12.50;

        System.out.println("--- Sistema FiapRide ---");
        System.out.println("Passageiro: " + passageiro1.nome + " | Saldo: R$" + passageiro1.saldo);
        System.out.println("Passageiro: " + passageiro2.nome + " | Saldo: R$" + passageiro2.saldo);
    }

    private static void exibirGarrafas() {
        Garrafa minhaGarrafa = new Garrafa();
        minhaGarrafa.cor            = "Azul";
        minhaGarrafa.material       = "Plástico";
        minhaGarrafa.capacidadeEmMl = 500;

        Garrafa garrafaDoProfessor = new Garrafa();
        garrafaDoProfessor.cor            = "Metálica";
        garrafaDoProfessor.material       = "Alumínio";
        garrafaDoProfessor.capacidadeEmMl = 750;

        System.out.println("\n--- Garrafas ---");
        System.out.println("Minha garrafa: " + minhaGarrafa.cor);
        System.out.println("Garrafa do professor: " + garrafaDoProfessor.cor);
    }

    private static void exibirSmartPhones() {
        SmartPhone meuCelular = new SmartPhone();
        meuCelular.marca         = "Samsung";
        meuCelular.armazenamento = 128;
        meuCelular.tamanhoTela   = 6.5;
        meuCelular.bateria       = 20;

        SmartPhone celularAmigo = new SmartPhone();
        celularAmigo.marca         = "Apple";
        celularAmigo.armazenamento = 256;
        celularAmigo.tamanhoTela   = 6.1;

        System.out.println("\n--- SmartPhones ---");
        System.out.println("Meu celular: " + meuCelular.marca);
        System.out.println("Celular do amigo: " + celularAmigo.marca);

        System.out.println("\n--- Testes SmartPhone ---");
        meuCelular.carregarBateria(50);   // válido: 20 + 50 = 70%
        meuCelular.instalarApp(40);       // válido: 128 - 40 = 88MB
        meuCelular.carregarBateria(-10);  // inválido: negativo
        meuCelular.instalarApp(500);      // inválido: sem espaço
        meuCelular.carregarBateria(200);  // limita em 100%
    }
}