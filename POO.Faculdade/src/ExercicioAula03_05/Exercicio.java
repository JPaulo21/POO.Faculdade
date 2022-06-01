package ExercicioAula03_05;

import java.util.Vector;

public class Exercicio {

	public static void main(String[] args) {
		
		Vector<Aluno> aluno = new Vector<Aluno>();
		
		Aluno a = new Aluno();
		
		a.setMat(6846135);
		a.setNome("Maria");
		a.setN1(8.8);
		a.setN2(9.3);
		
		aluno.add(a);
		
		Aluno[] alunos = new Aluno[1];
		
		aluno.copyInto(alunos);
	
		System.out.println("Mat: "+alunos[0].getMat()+"\nNome: "+alunos[0].getNome()+"\nN1: "+alunos[0].getN1()+"\nN2: "+alunos[0].getN2());
	}
	
}
