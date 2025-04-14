import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SepararPorSexo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("===========================================");
        System.out.println(" Bem-vindo ao Separador de Nomes por Sexo");
        System.out.println("===========================================");

        Map<String, ArrayList<String>> grupos = new HashMap<>();
        grupos.put("Feminino", new ArrayList<>());
        grupos.put("Masculino", new ArrayList<>());

        System.out.println("Digite os nomes e sexos separados por vírgula (ex: Rita-F, Caio-M):");
        String entrada = s.nextLine();

        String[] entradas = entrada.split(",");

        for (String item : entradas) {
            String[] dados = item.split("-");

            if (dados.length == 2) {
                String nome = dados[0].trim();
                String sexo = dados[1].trim().toUpperCase();

                if (sexo.equals("F")) {
                    grupos.get("Feminino").add(nome);
                } else if (sexo.equals("M")) {
                    grupos.get("Masculino").add(nome);
                } else {
                    System.out.println("Sexo inválido para o nome: " + nome);
                }
            } else {
                System.out.println("Formato inválido para a entrada: " + item);
            }
        }

        System.out.println("\n====================================");
        System.out.println("    RESULTADO DOS GRUPOS POR SEXO   ");
        System.out.println("====================================");

        ArrayList<String> nomesFemininos = grupos.get("Feminino");
        if (!nomesFemininos.isEmpty()) {
            System.out.println("\nNomes Femininos:");
            for (String nome : nomesFemininos) {
                System.out.println(" " + nome);
            }
        } else {
            System.out.println("\nNenhum nome feminino registrado.");
        }

        ArrayList<String> nomesMasculinos = grupos.get("Masculino");
        if (!nomesMasculinos.isEmpty()) {
            System.out.println("\nNomes Masculinos:");
            for (String nome : nomesMasculinos) {
                System.out.println(" " + nome);
            }
        } else {
            System.out.println("\nNenhum nome masculino registrado.");
        }

        s.close();
    }
}
