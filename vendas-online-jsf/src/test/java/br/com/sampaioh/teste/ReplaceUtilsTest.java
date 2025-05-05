package br.com.sampaioh.teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.sampaioh.utils.ReplaceUtils;

public class ReplaceUtilsTest {

	@Test
	public void replaceCPF() {
		String cpf = "999.999.999-99";
		String newCpf = ReplaceUtils.replace(cpf, ".", "-");
		
		assertEquals(newCpf, "99999999999");
	}
	
	@Test
	public void replaceTel() {
		String tel = "(21) 00000-0000";
		String newtel = ReplaceUtils.replace(tel, "(", ")", " ", "-");
		
		assertEquals(newtel, "21000000000");
	}
}
