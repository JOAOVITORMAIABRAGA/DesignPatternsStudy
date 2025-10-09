import Decorators.BebidaDecoratorBuilder;
import Interfaces.IBebida;
import Models.BebidaFactory;

public class Main {
	public static void main(String[] args) {
		IBebida bebida = BebidaFactory.criar("Cafe");
		System.out.println(bebida.getDescricao() +" "+ bebida.getCusto());
		bebida = new BebidaDecoratorBuilder(bebida).addLeite().addDesconto().build();
		System.out.println(bebida.getDescricao() + bebida.getCusto());
	}
}
