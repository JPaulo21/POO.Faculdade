package Aula14_03;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Meu carro");
		
		Automovel a = new Automovel();
		
		a.setPlaca("GD5F-5613");
		a.setCor("Verde");
		a.setModelo("TRACKER");
		a.setAno(2022);
		a.setAro(16);
		a.setQtdPortas(4);
		a.setQtdPneu(4);
		
		System.out.print("Modelo:"+a.getModelo()+"\nPlaca:"+a.getPlaca()+"\nCor:"+a.getCor());
		
	}
	
}
