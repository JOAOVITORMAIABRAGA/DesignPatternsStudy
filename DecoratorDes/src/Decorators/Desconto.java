package Decorators;
import Interfaces.IBebida;

public class Desconto implements IBebida{
	private double custo;
	private String descricao;
	
	public Desconto(IBebida bebida) {
		this.custo = bebida.getCusto() * 0.9;
		this.descricao = bebida.getDescricao() + " com 10% de desconto";
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
