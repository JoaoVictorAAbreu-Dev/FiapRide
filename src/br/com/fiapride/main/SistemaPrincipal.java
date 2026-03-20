package br.com.fiapride.main;

import br.com.fiapride.model.Passageiro;
import br.com.fiapride.model.Veiculo;

public class SistemaPrincipal {

    public static void main(String[] args) {

        System.out.println("--- Iniciando o Sistema FiapRide ---\n");

        Passageiro passageiro1 = new Passageiro("Ana Silva", "222.222.222-22");
        passageiro1.adicionarSaldo(50.0);

        Passageiro passageiro2 = new Passageiro("Carlos Souza", "333.333.333-33");
        passageiro2.adicionarSaldo(12.5);

        System.out.println("\n--- Status dos Passageiros ---");
        System.out.println("Passageiro: " + passageiro1.getNome() + " | Saldo: R$ " + passageiro1.getSaldo() + " | CPF: " + passageiro1.getCpf());
        System.out.println("Passageiro: " + passageiro2.getNome() + " | Saldo: R$ " + passageiro2.getSaldo() + " | CPF: " + passageiro2.getCpf());

        System.out.println("\n--- Realizando Viagens ---");
        passageiro1.pagarViagem(20.0);
        passageiro2.pagarViagem(20.0);

        System.out.println("\n--- Veículos ---");
        Veiculo meuCarro = new Veiculo("ABC-1234", "Toyota Corolla");
        meuCarro.atualizarPlaca("XYZ-9999");
        meuCarro.atualizarPlaca(""); // tentativa inválida
    }
}