package br.com.sampaioh.abstratas;

public class Programa {
    public static void main(String[] args) {
        exibirTitulo();

        PessoaFisica pf = new PessoaFisica("João Silva", "123.456.789-00", 4500.0);
        PessoaJuridica pj = new PessoaJuridica("Tech Solutions", "12.345.678/0001-99", 25000.0);

        pf.setNome("João Pereira");
        pf.setCpf("987.654.321-00");
        pf.setRendimento(5000.0);

        pj.setNome("Tech Innovations");
        pj.setCnpj("12.345.678/0001-88");
        pj.setFaturamento(30000.0);

        imprimir(pf);
        imprimir(pj);
    }

    private static void exibirTitulo() {
        System.out.println("===========================================");
        System.out.println("     BEM-VINDO AO SISTEMA DE IMPOSTOS      ");
        System.out.println("===========================================\n");
    }

    public static void imprimir(Pessoa pessoa) {
        System.out.println("===== " + pessoa.getClass().getSimpleName() + " =====");
        System.out.println("Nome: " + pessoa.getNome());
        pessoa.imprimirDetalhes();
        System.out.println("Imposto devido: R$ " + pessoa.calcularImposto());
        System.out.println();
    }
}
