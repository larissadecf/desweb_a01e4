package figuras;

public class Esfera implements Volume {

	private double raio;

	@Override
	public double volume() {
	
		return (4.0/3.0)*Math.PI*Math.pow(raio, 3);
	}

}
