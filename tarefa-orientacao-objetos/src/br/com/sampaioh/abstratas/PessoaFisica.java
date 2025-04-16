package br.com.sampaioh.abstratas;

/**
 * @author sampaioh
 */

public class PessoaFisica extends Pessoa {

    private String cpf;
    private Double rendimento;

    public PessoaFisica(String nome, String cpf, Double rendimento) {
        super(nome);
        this.cpf = cpf;
        this.rendimento = rendimento;
    }

    // Getter criado para possível uso no futuro
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // Getter criado para possível uso no futuro
    public Double getRendimento() {
        return rendimento;
    }

    public void setRendimento(Double rendimento) {
        this.rendimento = rendimento;
    }

    @Override
    public Double calcularImposto() {
        return rendimento * 0.15;
    }

    @Override
    public void imprimirDetalhes() {
        System.out.println("CPF: " + cpf);
        System.out.println("Rendimento: R$ " + rendimento);
    }
}
