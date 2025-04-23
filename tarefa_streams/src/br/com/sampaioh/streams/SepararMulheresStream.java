package br.com.sampaioh.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author sampaioh
 */

public class SepararMulheresStream {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("===========================================");
        System.out.println(" Bem-vindo ao Separador de Nomes por Sexo");
        System.out.println("===========================================");

        System.out.println("Digite os nomes e sexos separados por vírgula (ex: Rita-F, Caio-M):");
        String entrada = s.nextLine();

        List<String> nomesFemininos = Arrays.stream(entrada.split(","))
                .map(item -> item.trim().split("-"))
                .filter(dados -> dados.length == 2 && dados[1].trim().equalsIgnoreCase("F"))
                .map(dados -> dados[0].trim())
                .toList();

        System.out.println("\n====================================");
        System.out.println("      LISTA DE NOMES FEMININOS      ");
        System.out.println("====================================");

        if (!nomesFemininos.isEmpty()) {
            nomesFemininos.forEach(nome -> System.out.println(" " + nome));
        } else {
            System.out.println("Nenhum nome feminino encontrado.");
        }

        s.close();
    }
}
