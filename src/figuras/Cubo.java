package figuras;

public class Cubo implements Volume {
private double largura,cumprimento,altura;
	
	@Override
	public double volume() {
		
		return largura*cumprimento*altura;
	}

}
