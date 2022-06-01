package Aula10_05;

public class FiguraGeometrica {

	//Atributos
	
	private int base, altura;
	
	//Construtores
	
	public FiguraGeometrica() {}
	
	public FiguraGeometrica(int base, int altura) {
		super();
		this.base = base;
		this.altura = altura;
	}
	
	//Getters and Setters
	
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}

	
	//Métodos
	
	public int Area() {
		int area = base * altura;
		
		
		return area;
	}
	
}
