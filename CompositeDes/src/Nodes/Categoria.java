package Nodes;
import Interface.INo;
import java.util.ArrayList;

public class Categoria implements INo{
	
	private String nome;
	private ArrayList<INo> produtos;
	
	public Categoria(String nome, ArrayList<INo> produtos) {
		this.nome = nome;
		this.produtos = produtos;
	}
	
	@Override
	public double calcularPreço() {
		double preço = 0;
		for(int i = 0; i < produtos.size();i++) {
			preço = preço + produtos.get(i).calcularPreço();
		}
		return preço;
	}
	
	@Override
	public String toString() {
		return "Categoria " + this.nome + " possui os Produtos e Subcategorias: " +this.produtos.toString();
	}

}
