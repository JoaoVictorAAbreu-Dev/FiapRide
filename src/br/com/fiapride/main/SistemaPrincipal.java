package br.com.fiapride.main;

import br.com.fiapride.model.Carro;
import br.com.fiapride.model.Moto;
import br.com.fiapride.model.Passageiro;
import br.com.fiapride.model.Viagem;

public class SistemaPrincipal {

    public static void main(String[] args) {

        System.out.println("--- FIAPRIDE: Teste de Frota ---\n");

        // 1. Criando os passageiros
        Passageiro ana = new Passageiro("Ana Silva", "222.222.222-22");
        ana.adicionarSaldo(50.0);

        Passageiro carlos = new Passageiro("Carlos Souza", "333.333.333-33");
        carlos.adicionarSaldo(12.5);

        // 2. Criando os veículos — agora com subclasses específicas
        Carro uberX = new Carro("ABC-1234", "Chevrolet Onix", 4);
        Moto mottu = new Moto("ABC-9999", "Caloi City", true);

        // 3. Prova da herança: Carro e Moto acessam getPlaca() e getModelo()
        //    sem que esses métodos tenham sido escritos nelas — herdaram da mãe!
        System.out.println("\n--- Teste de Herança ---");
        System.out.println("Carro modelo: " + uberX.getModelo() + " | Placa: " + uberX.getPlaca());
        System.out.println("Vagas para passageiros: " + uberX.getCapacidadePassageiros());

        System.out.println("\nMoto modelo: " + mottu.getModelo() + " | Placa: " + mottu.getPlaca());
        if (mottu.isEletrica()) {
            System.out.println("Atenção: Esta moto é elétrica!");
        }

        // 4. Criando viagens com os veículos específicos
        // Viagem aceita Veiculo — e Carro/Moto SÃO Veiculo (polimorfismo implícito)
        System.out.println("\n--- Criando Viagens ---");
        Viagem viagemDaAna = new Viagem("Avenida Paulista, 1000", ana, uberX);
        Viagem viagemDoCarlos = new Viagem("Rua Augusta, 500", carlos, mottu);

        viagemDaAna.exibirResumo();
        viagemDoCarlos.exibirResumo();

        // 5. Prova da passagem por referência (Aula 05)
        System.out.println("--- Prova da Passagem por Referência ---");
        ana.adicionarSaldo(100.0);
        System.out.println("Saldo da Ana consultado ATRAVÉS da Viagem: R$ "
                + viagemDaAna.getSolicitante().getSaldo());
    }
}