package Models;
import Interfaces.IBebida;

class Cafe implements IBebida{
	private double custo = 5;
	private String descricao = "Cafe";
	
	@Override
	public double getCusto() {
		return custo;
	}

	@Override
	public String getDescricao() {
		return descricao;
	}

}
