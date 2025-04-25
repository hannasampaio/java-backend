package br.com.sampaioh.dao;

public interface IContratoDao {
    void salvar();
    String buscar(Long id);
    void excluir(Long id);
    void atualizar(Long id, String novoContrato);
}