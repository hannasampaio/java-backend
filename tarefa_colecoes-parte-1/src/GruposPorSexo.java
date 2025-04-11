import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GruposPorSexo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> masculinos = new ArrayList<>();
        List<String> femininos = new ArrayList<>();

        System.out.println("===================================");
        System.out.println("     CADASTRO DE PESSOAS POR SEXO ");
        System.out.println("===================================");

        String continuar = "S";

        while (continuar.equalsIgnoreCase("S")) {
            System.out.println("\n--- Nova Pessoa ---");

            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Sexo (M/F): ");
            String sexo = scanner.nextLine();

            if (sexo.equalsIgnoreCase("M")) {
                masculinos.add(nome);
                System.out.println("Adicionado ao grupo masculino.");
            } else if (sexo.equalsIgnoreCase("F")) {
                femininos.add(nome);
                System.out.println("Adicionada ao grupo feminino.");
            } else {
                System.out.println("Sexo inválido! Digite apenas M ou F.");
            }

            System.out.print("Deseja adicionar outra pessoa? (S/N): ");
            continuar = scanner.nextLine();
        }

        System.out.println("\n========================");
        System.out.println("     RESULTADO FINAL    ");
        System.out.println("========================");

        System.out.println("\nGrupo Masculino:");
        for (String nome : masculinos) {
            System.out.println(nome);
        }

        System.out.println("\nGrupo Feminino:");
        for (String nome : femininos) {
            System.out.println(nome);
        }

        scanner.close();
    }
}
