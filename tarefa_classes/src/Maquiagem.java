/**
 * @author sampaio.h
 */
public class Maquiagem {

    private int codigo;
    private String nome;
    private String tipo;

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Método que exibe as informações do produto
     * Exibe código, nome e tipo da maquiagem
     */
    public void exibirInformacoes() {
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Tipo: " + tipo);
    }

    /**
     * Método que retorna o valor total da maquiagem, dependendo da quantidade
     *
     * @return O valor total da maquiagem (valor unitário * quantidade)
     */

    public int getValor(int quantidade) {
        return 50 * quantidade;
    }
}
