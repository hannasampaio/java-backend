package br.com.sampaioh.dao;

public class ContratoDao implements IContratoDao {

    @Override
    public void salvar() {
        throw new UnsupportedOperationException("Não funciona com o banco");
    }

    @Override
    public String buscar(Long id) {
        throw new UnsupportedOperationException("Não implementado ainda");
    }

    @Override
    public void excluir(Long id) {
        throw new UnsupportedOperationException("Não implementado ainda");
    }

    @Override
    public void atualizar(Long id, String novoContrato) {
        throw new UnsupportedOperationException("Não implementado ainda");
    }
}
