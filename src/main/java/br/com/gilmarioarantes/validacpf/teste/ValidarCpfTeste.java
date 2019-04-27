package br.com.gilmarioarantes.validacpf.teste;

import org.junit.Before;
import org.junit.Test;

import br.com.gilmarioarantes.validacpf.model.ValidaCPF;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class ValidarCpfTeste {
	
	
	
private ValidaCPF validaCpf;
	
	@Before
	public void setup() {
		
		validaCpf = new ValidaCPF();
	}
	
	
	@Test
	public void cpfValido() {
		
		Assert.assertTrue(validaCpf.isCPF("123"));
	}
	
	@Test
	public void ecpf() {
		
		Assert.assertTrue(validaCpf.isCPF("00882041118"));
	}
	
	
	

}
