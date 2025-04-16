package br.com.sampaioh.abstratas;

import br.com.sampaioh.interfaces.Imposto;

/**
 * @author sampaioh
 */

public abstract class Pessoa implements Imposto {

    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract void imprimirDetalhes();
}
