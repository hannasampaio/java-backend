package br.com.sampaioh;

import org.junit.Assert;
import org.junit.Test;

public class TesteClienteTest {

	@Test
	public void testeClasseCliente() {
		TesteCliente cli = new TesteCliente();
		cli.adicionarNome("Hanna");
		cli.adicionarNome1("Hanna");

		Assert.assertEquals("Hanna", cli.getNome());
	}
}
