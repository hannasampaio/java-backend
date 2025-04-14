import java.util.Arrays;
import java.util.Scanner;

/**
 * @author sampaioh
 */

public class OrdenaNomes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("=======================================");
        System.out.println("   Bem-vindo ao Ordenador de Nomes");
        System.out.println("=======================================");

        System.out.println("Digite os nomes separados por vírgula:");
        String entrada = s.nextLine();

        String[] nomes = entrada.split(",");
        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = nomes[i].trim();
        }

        Arrays.sort(nomes);

        System.out.println("Nomes em ordem alfabética:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        s.close();
    }
}
