package figuras;

public class Piramide implements Volume {

	private double largura,cumprimento,altura;
	@Override
	public double volume() {
		return (1.0/3.0)*largura*cumprimento*altura;
	}

}
