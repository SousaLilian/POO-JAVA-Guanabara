package aula04;

public class Aula04 {

	public static void main(String[] args) {
		
		Caneta c1 = new Caneta("BIC", 0.05f, "Azul");

		System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta() + " de cor " + c1.getCor());

	}

}
