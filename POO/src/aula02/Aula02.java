package aula02;

public class Aula02 {

	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		c1.modelo = "BIC cristal";
		c1.cor = "Azul";
		//c1.ponta = o.5f;
		c1.carga = 80;
		//c1.tampada = true;
		c1.tampar();
		c1.status();
		c1.rabiscar();
		
	}

}
