package br.com.sampaioh.dao.mocks;

import br.com.sampaioh.dao.IContratoDao;

public class ContratoDaoMock implements IContratoDao {

    @Override
    public void salvar() {
        // simula persistência
    }

    @Override
    public String buscar(Long id) {
        return "Contrato encontrado com ID " + id;
    }

    @Override
    public void excluir(Long id) {
        // simula exclusão
    }

    @Override
    public void atualizar(Long id, String novoContrato) {
        // simula atualização
    }
}
