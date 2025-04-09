import java.util.Scanner;

public class NotasAluno {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double nota1, nota2, nota3, nota4;

        System.out.println("Bem-vindo ao sistema de notas!");

        System.out.println("Digite a primeira nota: ");
        nota1 = s.nextDouble();

        System.out.println("Digite a segunda nota: ");
        nota2 = s.nextDouble();

        System.out.println("Digite a terceira nota: ");
        nota3 = s.nextDouble();

        System.out.println("Digite a quarta nota: ");
        nota4 = s.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("\nMédia do aluno: " + media);

        if (media >= 7) {
            System.out.println("Resultado: Aprovado");
        } else if (media >= 5) {
            System.out.println("Resultado: Recuperação");
        } else {
            System.out.println("Resultado: Reprovado");
        }

        s.close();
    }
}

