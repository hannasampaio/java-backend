package br.com.sampaioh.service;

import br.com.sampaioh.dao.IContratoDao;

public class ContratoService implements IContratoService {

    private IContratoDao contratoDao;

    public ContratoService(IContratoDao contratoDao) {
        this.contratoDao = contratoDao;
    }

    @Override
    public String salvar() {
        contratoDao.salvar();
        return "Sucesso";
    }

    @Override
    public String buscar(Long id) {
        return contratoDao.buscar(id);
    }

    @Override
    public String excluir(Long id) {
        contratoDao.excluir(id);
        return "Excluído";
    }

    @Override
    public String atualizar(Long id, String novoContrato) {
        contratoDao.atualizar(id, novoContrato);
        return "Atualizado";
    }
}
