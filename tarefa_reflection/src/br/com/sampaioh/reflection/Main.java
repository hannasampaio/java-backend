package br.com.sampaioh.reflection;

/**
 * @author sampaioh
 */
public class Main {
    public static void main(String[] args) {
        Class<Transacao> clazz = Transacao.class;

        System.out.println("=========================================");
        System.out.println("  MAPEAMENTO DE ENTIDADE PARA TABELA     ");
        System.out.println("=========================================\n");


        if (clazz.isAnnotationPresent(Tabela.class)) {
            Tabela entidade = clazz.getAnnotation(Tabela.class);
            System.out.println("Entidade mapeada para a tabela: " + entidade.nome());
        } else {
            System.out.println("A anotação @EntidadeTabela não está presente.");
        }
    }
}
