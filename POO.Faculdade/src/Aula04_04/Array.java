package Aula04_04;


public class Array {

	public static void main(String[] args) {

		String nome[] = {"JP", "Roberta", "Adilson", "Maria", "Jose"};
		
		for(int i = 0; i<5; i++) {
			
			System.out.print(nome[i]+" ");
		}
		System.out.println("\n");

		String[][] nomes = new String[5][5];
		
		for(int i = 0; i<5; i++) {
			
			nomes[i][0] = nome[i];
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {

				System.out.printf("%7s", nomes[i][j]);
				if(j==4) {
					System.out.print("\n");
				}
			}
		}

		
	}

}
