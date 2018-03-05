package figuras;

public class Cilindro implements Volume {

	private double altura,raio;
	@Override
	public double volume() {
		return Math.PI*Math.pow(raio, 3)*altura;
	}
}
	

