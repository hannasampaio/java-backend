package br.com.sampaioh;

import br.com.sampaioh.factory.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("========== FABRICA FIAT ==========");
        FabricaDeCarro fiat = new FabricaFiat();

        Carro popularFiat = fiat.criarCarroPopular("Fiat Uno");
        Carro luxoFiat = fiat.criarCarroLuxo("Fiat Fastback");

        System.out.println("\n[Carro Popular Fiat]");
        popularFiat.exibirInfo();

        System.out.println("\n[Carro de Luxo Fiat]");
        luxoFiat.exibirInfo();


        System.out.println("\n========== FABRICA CHEVROLET ==========");
        FabricaDeCarro chevrolet = new FabricaChevrolet();

        Carro popularChevrolet = chevrolet.criarCarroPopular("Chevrolet Onix");
        Carro luxoChevrolet = chevrolet.criarCarroLuxo("Chevrolet Cruze");

        System.out.println("\n[Carro Popular Chevrolet]");
        popularChevrolet.exibirInfo();

        System.out.println("\n[Carro de Luxo Chevrolet]");
        luxoChevrolet.exibirInfo();
    }
}

