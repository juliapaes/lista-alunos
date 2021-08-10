# lista.alunos
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		//Variável SIMPLES
		Aluno julia = new Aluno("Julia Paes", 16);
		//System.out.println("Aluno: " + adri.getNome());
		
		Aluno vitoria = new Aluno("Vitória", 8);
		
		Aluno telma = new Aluno("Telma", 43);
		
		//Variável COMPOSTA do tipo ArrayList (classe, dinâmica)
		ArrayList<Aluno> turma = new ArrayList<Aluno>();
		
		//adicionando objetos à turma
		//turma.add(julia); 
		//turma.add(vitoria);
		//turma.add(telma);
		
		//adicionando objetos à turma em um determinado índice
		turma.add(0,telma);
		turma.add(1,vitoria);
		turma.add(2,julia);
		
		//exibição da lista
		for(int i=0; i < turma.size(); i++ ) {
			System.out.println("Aluno: " + turma.get(i).getNome());
		}
		
		turma.remove(0);
		//exibição da lista
		System.out.println("Lista Atualizada: ");
		for(int i=0; i < turma.size(); i++ ) {
			System.out.println("Aluno: " + turma.get(i).getNome());
		}
	}
}
