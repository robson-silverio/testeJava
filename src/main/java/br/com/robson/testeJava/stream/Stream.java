package br.com.robson.testeJava.stream;

public interface Stream extends Cloneable{
	
	public char getNext();
	public boolean hasNext();
	public Stream clone()throws CloneNotSupportedException;

}
