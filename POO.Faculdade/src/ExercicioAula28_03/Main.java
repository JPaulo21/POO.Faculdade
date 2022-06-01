package ExercicioAula28_03;

import java.util.Scanner;

public class Main {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite o tipo de entrada que deseja: \n1.Inteiro \n2.Float \n3.Double \n4.String \n");
		int escolha = leitor.nextInt();
		
		switch(escolha) {
		
			case 1:		
				System.out.print("Digite seu número inteiro: ");
				int numInteiro = leitor.nextInt();
				break;
			case 2:
				System.out.print("Digite seu número Float: ");
				float numFloat = leitor.nextFloat();
				break;
			case 3: 
				System.out.print("Digite seu número Double: ");
				double numDouble = leitor.nextDouble();
				break;
			case 4:
				System.out.print("Digite seu texto: ");
				String string = leitor.next();
				break;
				
			default:
				System.out.println("Número Inválido");
		}
		
		leitor.close();
		
	}

}
