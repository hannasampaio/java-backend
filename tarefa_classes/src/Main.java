public class Main {
    public static void main(String[] args) {
        Maquiagem base = new Maquiagem();
        base.setCodigo(1);
        base.setNome("Base Líquida");
        base.setTipo("Base");

        base.exibirInformacoes();

        System.out.println("Valor total: " + base.getValor(3));
    }
}