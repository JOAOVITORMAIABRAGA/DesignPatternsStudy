package Decorators;
import Interfaces.IBebida;

public class BebidaDecoratorBuilder {
	private IBebida bebida;
	public BebidaDecoratorBuilder(IBebida bebida) {
		this.bebida = bebida;
	}
	
	public BebidaDecoratorBuilder addLeite() {
		this.bebida = new Leite(this.bebida);
		return this;
	}
	
	public BebidaDecoratorBuilder addDesconto() {
		this.bebida = new Desconto(this.bebida);
		return this;
	}
	
	public IBebida build() {
		return this.bebida;
	}
}
