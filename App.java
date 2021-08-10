# lista.alunos
import java.util.Scanner;
import java.util.ArrayList;

public class App {
	public static void main(String[] args) {
		Scanner leitor =  new Scanner(System.in);
		ArrayList<Aluno> turma = new ArrayList<Aluno>();
		
		int op; //opção do menu
		do {
			System.out.println("1 - Listar alunos da turma");
			System.out.println("2 - Inserir aluno na turma");
			System.out.println("3 - Remover aluno da turma");
			System.out.println("4 - Sair");
			System.out.println("Informe sua opção:");
			op = leitor.nextInt();
			
            switch(op) {
				case 1: if(turma.size()==0) {
							System.out.println("Turma vazia");
						}else {
							for(int i=0; i < turma.size(); i++) {
								System.out.println("Aluno: " + turma.get(i).getNome() + " : " + turma.get(i).getIdade());
							}
						}
					    break;
				case 2: String nome;
						int idade;
						leitor.nextLine();
						System.out.println("Informe o nome do aluno: ");
						nome = leitor.nextLine();
						do {
							System.out.println("Informe a idade (em anos): ");
							idade = leitor.nextInt();
						}while(idade < 0);
						Aluno a = new Aluno(nome,idade);
						turma.add(a);
						System.out.println("Aluno(a) registrado(a) com sucesso!");
					    break;
				case 3: int cod;
						if (turma.size()==0) {
							System.out.println("Turma vazia: não é possível remover aluno");
						}else {
							for(int i=0; i < turma.size(); i++ ) {
								System.out.println((i+1) +  " - " + turma.get(i).getNome());
							}
							do {
								System.out.println("Informe o código do aluno para ser removido: ");
								cod = leitor.nextInt();
							}while((cod <=0) || (cod > turma.size()));
							turma.remove(cod-1);
							System.out.println("Aluno(a) removido(a) com sucesso!");
						}
					    break;
				case 4: System.out.println("Encerrando ...");
				        break;
				default: System.out.println("Opção inválida!");
			}
		}while(op != 4);
	}
}
