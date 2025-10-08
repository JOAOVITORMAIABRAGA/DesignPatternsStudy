import Builder.CategoryBuilder;
import Nodes.*;

public class Main {
	public static void main(String [] args) {
		Categoria C1 = new CategoryBuilder("Palmeiras").addProduto("Camisa N° 1", 350.00).build();
		Categoria C2 = new CategoryBuilder("Vozão").addProduto("Camisa N° 1", 350.00).build();
		Categoria C3 = new CategoryBuilder("Centauro").addCategory(C2).addCategory(C1).build();
		System.out.println(C3.toString());
	}
}
