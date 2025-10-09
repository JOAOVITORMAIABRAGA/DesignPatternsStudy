package Decorators;
import Interfaces.IBebida;

public class Leite implements IBebida{
	private double custo;
	private String descricao;
	
	public Leite(IBebida bebida) {
		this.custo = bebida.getCusto() + 0.5;
		this.descricao = bebida.getDescricao() + " com leite";
	}
	@Override
	public double getCusto() {
		return custo;
	}

	@Override
	public String getDescricao() {
		return descricao;
	}

}
