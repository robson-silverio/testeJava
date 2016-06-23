package br.com.robson.testeJava.stream;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
	
public class TestStream {
	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Test
	public void testeStreamInicio() throws Exception {

		Stream stream = new StringStream("abcABCbc");
		char c = StringStream.firstChar(stream);
		Assert.assertTrue(c == 'a');
	}

	@Test
	public void testeStreamMeio() throws Exception {
		
		Stream stream = new StringStream("abcABCabcBC");
		char c = StringStream.firstChar(stream);
		Assert.assertTrue(c == 'A');
	}

	@Test
	public void testeStreamFim() throws Exception {
		Stream stream = new StringStream("abcABCabcABCd");
		char c = StringStream.firstChar(stream);
		Assert.assertTrue(c == 'd');
	}

	@Test
	public void testeStreamComTodoCaracteresRepetidos() throws Exception {
	
		Stream stream = new StringStream("abcABCabcABC");
		thrown.expect(Exception.class);
		thrown.expectMessage("Não foi encontrado nenhum caractere sem repetição.");
		StringStream.firstChar(stream);
	}

}
