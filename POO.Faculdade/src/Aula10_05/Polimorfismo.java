package Aula10_05;

public class Polimorfismo {
	
	public static void main(String[] args) {
		
		Trapezio t = new Trapezio();
		
		System.out.println(t.Area());
		
		Quadrado q = new Quadrado(4, 4);
		
		System.out.println(q.Area());
	}

}
