package br.com.sampaioh.reflection;

/**
 * @author sampaioh
 */

@Tabela(nome = "pedidos")
public class Transacao {
    private double valor;
    private String tipo;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}