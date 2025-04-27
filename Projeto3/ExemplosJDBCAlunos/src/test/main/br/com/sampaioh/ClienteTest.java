package br.com.sampaioh;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import br.com.sampaioh.dao.IClienteDAO;
import br.com.sampaioh.dao.ClienteDAO;
import br.com.sampaioh.domain.Cliente;

public class ClienteTest {

	@Test
	public void cadastrarClienteTest() throws Exception {
		IClienteDAO dao = new ClienteDAO();

		// Teste de cadastro
		Cliente cliente = new Cliente();
		cliente.setCodigo("01");
		cliente.setNome("Carlos Silva");

		Integer qtd = dao.cadastrar(cliente);
		assertTrue(qtd == 1);

		// Verificando se o cliente foi cadastrado corretamente
		Cliente clienteBD = dao.consultar(cliente.getCodigo());
		assertNotNull(clienteBD);
		assertEquals(cliente.getCodigo(), clienteBD.getCodigo());
		assertEquals(cliente.getNome(), clienteBD.getNome());
	}

	@Test
	public void atualizarClienteTest() throws Exception {
		IClienteDAO dao = new ClienteDAO();

		// Teste de atualização
		Cliente cliente = new Cliente();
		cliente.setCodigo("02");
		cliente.setNome("Lucas Almeida");
		dao.cadastrar(cliente);

		// Atualizando o nome
		cliente.setNome("Lucas Almeida Atualizado");
		Integer qtdAtualizada = dao.atualizar(cliente);
		assertTrue(qtdAtualizada == 1); // Verifica se a atualização foi realizada

		// Verificando se a atualização foi persistida
		Cliente clienteAtualizado = dao.consultar(cliente.getCodigo());
		assertEquals("Lucas Almeida Atualizado", clienteAtualizado.getNome());

		// Exclui o cliente após o teste
		dao.excluir(clienteAtualizado);
	}

	@Test
	public void consultarClienteTest() throws Exception {
		IClienteDAO dao = new ClienteDAO();

		// Teste de consulta
		Cliente cliente = new Cliente();
		cliente.setCodigo("03");
		cliente.setNome("Ana Maria");
		dao.cadastrar(cliente);

		Cliente clienteConsultado = dao.consultar(cliente.getCodigo());
		assertNotNull(clienteConsultado);
		assertEquals(cliente.getCodigo(), clienteConsultado.getCodigo());
		assertEquals(cliente.getNome(), clienteConsultado.getNome());

		dao.excluir(clienteConsultado); // Exclui para limpar o banco
	}

	@Test
	public void buscarTodosClientesTest() throws Exception {
		IClienteDAO dao = new ClienteDAO();

		// Teste de buscar todos os clientes
		Cliente cliente1 = new Cliente();
		cliente1.setCodigo("04");
		cliente1.setNome("Mariana Rocha");
		dao.cadastrar(cliente1);

		Cliente cliente2 = new Cliente();
		cliente2.setCodigo("05");
		cliente2.setNome("Carlos Pereira");
		dao.cadastrar(cliente2);

		List<Cliente> clientes = dao.buscarTodos();
		assertTrue(clientes.size() >= 2); // Verifica se pelo menos dois clientes estão cadastrados

		// Limpeza dos dados de teste
		dao.excluir(cliente1);
		dao.excluir(cliente2);
	}

	@Test
	public void excluirClienteTest() throws Exception {
		IClienteDAO dao = new ClienteDAO();

		// Teste de exclusão
		Cliente cliente = new Cliente();
		cliente.setCodigo("06");
		cliente.setNome("João Souza");
		dao.cadastrar(cliente);

		Integer qtdExcluida = dao.excluir(cliente);
		assertTrue(qtdExcluida == 1); // Verifica se foi excluído corretamente

		Cliente clienteExcluido = dao.consultar(cliente.getCodigo());
		assertNull(clienteExcluido); // Verifica se o cliente foi realmente excluído
	}
}
