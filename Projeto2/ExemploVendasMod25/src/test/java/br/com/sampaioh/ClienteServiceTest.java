package br.com.sampaioh;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.sampaioh.dao.ClienteDaoMock;
import br.com.sampaioh.dao.IClienteDAO;
import br.com.sampaioh.domain.Cliente;
import br.com.sampaioh.exceptions.TipoChaveNaoEncontradaException;
import br.com.sampaioh.services.ClienteService;
import br.com.sampaioh.services.IClienteService;

public class ClienteServiceTest {
	
	private IClienteService clienteService;
	
	private Cliente cliente;
	
	public ClienteServiceTest() {
		IClienteDAO dao = new ClienteDaoMock();
		clienteService = new ClienteService(dao);
	}
	
	@Before
	public void init() {
		cliente = new Cliente();
		cliente.setCpf(12312312312L);
		cliente.setNome("Hanna");
		cliente.setCidade("Rio de Janeiro");
		cliente.setEnd("End");
		cliente.setEstado("Rio de Janeiro");
		cliente.setNumero(7);
		cliente.setTel(1199999999L);
		
	}
	
	@Test
	public void pesquisarCliente() {
		Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCpf());
		Assert.assertNotNull(clienteConsultado);
	}
	
	@Test
	public void salvarCliente() throws TipoChaveNaoEncontradaException {
		Boolean retorno = clienteService.cadastrar(cliente);
		
		Assert.assertTrue(retorno);
	}
	
	@Test
	public void excluirCliente() {
		clienteService.excluir(cliente.getCpf());
	}
	
	@Test
	public void alterarCliente() throws TipoChaveNaoEncontradaException {
		cliente.setNome("Hanna Sampaio");
		clienteService.alterar(cliente);
		
		Assert.assertEquals("Hanna Sampaio", cliente.getNome());
	}
}
