package br.com.fiapride.main;

import br.com.fiapride.model.Android;
import br.com.fiapride.model.Dono;
import br.com.fiapride.model.Iphone;
import br.com.fiapride.model.SmartPhone;

import java.util.ArrayList;
import java.util.List;

public class TesteSmartPhone {

    public static void main(String[] args) {

        System.out.println("══════════════════════════════════════════════");
        System.out.println("   TESTE DE POLIMORFISMO — calcularTaxaSeguro");
        System.out.println("══════════════════════════════════════════════\n");

        // 1. Criando os donos
        Dono joao  = new Dono("João",  "joao@email.com");
        Dono lucia = new Dono("Lucia", "lucia@email.com");
        Dono carlos = new Dono("Carlos", "carlos@email.com");

        // 2. Instanciando objetos — cada um com seu tipo específico
        Android celularDoJoao   = new Android("Samsung Galaxy S24", 128, 6.5,  4_500.00, joao,   "Android 14");
        Iphone  celularDaLucia  = new Iphone ("Apple iPhone 16 Pro", 256, 6.1, 9_000.00, lucia,  "A18 Pro");
        SmartPhone genericoCarlos = new SmartPhone("Motorola Edge", 64, 6.3, 2_000.00, carlos);

        // ─────────────────────────────────────────────────────────────────────
        // 3. LISTA tipada com a SUPERCLASSE — aqui mora a magia do polimorfismo!
        //    A lista aceita qualquer objeto que seja "um SmartPhone".
        // ─────────────────────────────────────────────────────────────────────
        List<SmartPhone> aparelhos = new ArrayList<>();
        aparelhos.add(celularDoJoao);    // Android  (15%)
        aparelhos.add(celularDaLucia);   // Iphone   (20%)
        aparelhos.add(genericoCarlos);   // SmartPhone genérico (10%)

        // 4. O TESTE DE FOGO — mesmo método, resultados completamente diferentes!
        System.out.println("--- Simulação de Cotação de Seguros ---\n");

        for (SmartPhone aparelho : aparelhos) {
            double taxa = aparelho.calcularTaxaSeguro(); // ← POLIMORFISMO em ação!

            System.out.printf("Aparelho : %s (%s)%n",
                    aparelho.getMarca(), aparelho.getClass().getSimpleName());
            System.out.printf("Dono     : %s%n", aparelho.getProprietario().getNome());
            System.out.printf("Valor    : R$ %.2f%n", aparelho.getValor());
            System.out.printf("Taxa     : R$ %.2f%n", taxa);
            System.out.println("----------------------------------------------");
        }

        System.out.println("\nObserve: o MESMO comando 'calcularTaxaSeguro()'");
        System.out.println("gerou resultados DIFERENTES para cada objeto. Isso é Polimorfismo!");
    }
}