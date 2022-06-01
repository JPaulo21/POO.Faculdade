package Aula10_05;

public class Trapezio extends FiguraGeometrica{
	
	private int baseMenor;

	public Trapezio() {}

	public Trapezio(int base, int altura) {
		super(base, altura);
		
	}
	
	public int getBaseMenor() {
		return baseMenor;
	}

	public void setBaseMenor(int baseMenor) {
		this.baseMenor = baseMenor;
	}

	@Override
	public int Area() {
		// TODO Auto-generated method stub
		return (super.getBase()+baseMenor)*super.getAltura()/2;
		
	}

	
}
