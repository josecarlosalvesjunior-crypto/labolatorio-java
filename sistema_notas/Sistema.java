package sistema_notas;

import java.util.Scanner;

public class Sistema {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		GerenciadorAlunos sistema = new GerenciadorAlunos();

		int opcao = 0;
		
		while (opcao != 7) {
			System.out.println("--- Sistema de notas ---");

			System.out.println("1 - Cadastrar aluno\r\n" + "2 - Lançar notas\r\n" + "3 - Calcular média\r\n"
					+ "4 - Listar alunos\r\n" + "5 - Mostrar aprovados\r\n" + "6 - Mostrar reprovados\r\n"
					+ "7 - Sair");

			System.out.println("Escolha uma opção: ");

			opcao = sc.nextInt();

			switch (opcao) {

			case 1:
				sistema.cadastrar();
				break;

			case 2:
				sistema.lancarNotas();
				break;

			case 3:
				sistema.listar();
				break;

			case 4:
				sistema.listar();
				break;

			case 5:
				sistema.mostrarAprovados();
				break;

			case 6:
				sistema.mostrarReprovados();
				break;

			case 7:
				System.out.println("Sistema encerrado.");
				break;

			default:
				System.out.println("Opção inválida!");

			}
		}

		sc.close();
	}
}
