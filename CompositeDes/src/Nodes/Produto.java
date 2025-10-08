package Nodes;
import Interface.INo;

public class Produto implements INo{
	private double preço;
	private String nome;
	
	public Produto(String nome, double preço) {
		this.preço = preço;
		this.nome = nome;
	}
	
	@Override
	public double calcularPreço() {
		return this.preço;
	}
	
	@Override
	public String toString() {
		return this.nome;
	}

}
