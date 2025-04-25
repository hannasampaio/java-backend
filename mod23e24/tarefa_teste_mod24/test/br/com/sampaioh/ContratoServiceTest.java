package br.com.sampaioh;

import br.com.sampaioh.dao.ContratoDao;
import br.com.sampaioh.dao.IContratoDao;
import br.com.sampaioh.dao.mocks.ContratoDaoMock;
import br.com.sampaioh.service.ContratoService;
import br.com.sampaioh.service.IContratoService;
import org.junit.Assert;
import org.junit.Test;


public class ContratoServiceTest {

    @Test
    public void salvarTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarComBancoDeDadosTest() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test
    public void buscarTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.buscar(1L);
        Assert.assertEquals("Contrato encontrado com ID 1", retorno);
    }

    @Test
    public void excluirTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.excluir(1L);
        Assert.assertEquals("Excluído", retorno);
    }

    @Test
    public void atualizarTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.atualizar(1L, "Contrato atualizado");
        Assert.assertEquals("Atualizado", retorno);
    }
}
