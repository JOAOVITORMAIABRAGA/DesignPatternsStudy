package Builder;
import java.util.ArrayList;

import Nodes.*;
import Interface.INo;

public class CategoryBuilder {
	private String nome;
	private ArrayList<INo> nos = new ArrayList<INo>();
	
	public CategoryBuilder(String nome) {
		this.nome = nome;
	}
	
	public CategoryBuilder addProduto(String nome, double valor) {
		this.nos.add(new Produto(nome, valor));
		return this;
	}
	
	public CategoryBuilder addCategory(Categoria categoria) {
		this.nos.add(categoria);
		return this;
	}
	
	public Categoria build() {
		Categoria categoria = new Categoria(this.nome, this.nos);
		return categoria;
	}
}
