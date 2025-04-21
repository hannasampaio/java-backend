package br.com.sampaioh.annotation;

public class Main {
    public static void main(String[] args) {
        Class<Cliente> classe = Cliente.class;

        if (classe.isAnnotationPresent(Tabela.class)) {
            Tabela anotacao = classe.getAnnotation(Tabela.class);

            System.out.println("=========================================");
            System.out.println(">>> MAPEAMENTO DE ENTIDADE PARA TABELA <<<");
            System.out.println("-----------------------------------------");
            System.out.println("Nome da tabela: " + anotacao.value());
        } else {
            System.out.println("A anotação @Tabela não está presente na classe.");
        }
    }
}
