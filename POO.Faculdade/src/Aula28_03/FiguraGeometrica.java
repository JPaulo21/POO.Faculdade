package Aula28_03;

public class FiguraGeometrica {

	//Atributos
	
	private int base, altura;
	private String tipo;
	
	//Construtores
	
	public FiguraGeometrica(int base, int altura, String tipo) {
		super();
		this.base = base;
		this.altura = altura;
		this.tipo = tipo;
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
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	//Métodos
	
	public int Area() {
		int area = base * altura;
		
		if(tipo.equalsIgnoreCase("Losango") || tipo.equalsIgnoreCase("Losango") || tipo.equalsIgnoreCase("Losango")) {
			
			area /= 2;
		}
		
		return area;
	}
	
}
