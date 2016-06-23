package br.com.robson.testeJava.stream;

public class StringStream implements Stream {

	private String str;
	private int cont;

	public StringStream(String str) {
		this.str = str;
		cont = 0;
	}

	@Override
	public char getNext() {
		char c = str.charAt(cont);
		cont++;
		return c;
	}

	@Override
	public boolean hasNext() {
		return cont < str.length();
	}

	public static char firstChar(Stream stream) throws Exception {
		char c = '$';
		boolean achou = false;
		while (stream.hasNext()) {
			c = stream.getNext();
			int cont = 0;
			Stream stream2 = stream.clone();
			while (stream2.hasNext()) {
				if (c == stream2.getNext()) {
					cont++;
				}
			}
			if (cont == 1) {
				achou = true;
				break;
			}
		}
		if (achou){
			return c;
		} else  {
			throw new Exception("Não foi encontrado nenhum caractere sem repetição.");
		}
	}
	
	@Override
	public Stream clone() throws CloneNotSupportedException {
		Stream stream = new StringStream(str);
		return stream;
	}

}
