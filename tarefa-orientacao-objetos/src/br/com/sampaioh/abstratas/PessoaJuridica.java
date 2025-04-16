package br.com.sampaioh.abstratas;

/**
 * @author sampaioh
 */

public class PessoaJuridica extends Pessoa {

    private String cnpj;
    private Double faturamento;

    public PessoaJuridica(String nome, String cnpj, Double faturamento) {
        super(nome);
        this.cnpj = cnpj;
        this.faturamento = faturamento;
    }

    // Getter criado para possível uso no futuro
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    // Getter criado para possível uso no futuro
    public Double getFaturamento() {
        return faturamento;
    }

    public void setFaturamento(Double faturamento) {
        this.faturamento = faturamento;
    }

    @Override
    public Double calcularImposto() {
        return faturamento * 0.20;
    }

    @Override
    public void imprimirDetalhes() {
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Faturamento: R$ " + faturamento);
    }
}
