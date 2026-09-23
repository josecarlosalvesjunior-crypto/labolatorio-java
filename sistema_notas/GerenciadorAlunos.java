package sistema_notas;

import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorAlunos {

    ArrayList<Aluno> alunos = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    public void cadastrar() {

        System.out.print("Digite o nome do aluno: ");
        String nome = sc.nextLine();
        while (!nome.matches("[a-zA-ZÀ-ÿ ]+")) {
            System.out.print("Digite apenas letras: ");
            nome = sc.nextLine();
        }

        Aluno aluno = new Aluno(nome);

        alunos.add(aluno);

        System.out.println("Aluno cadastrado com sucesso!");
    }

    public void lancarNotas() {

        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
            return;
        }

        System.out.print("Digite o nome do aluno: ");
        String nome = sc.nextLine();

        for (Aluno aluno : alunos) {

            if (aluno.nome.equalsIgnoreCase(nome)) {

                System.out.print("Digite a nota 1: ");
                aluno.nota1 = sc.nextDouble();
                while (aluno.nota1 < 0 || aluno.nota1 > 10 ) {
                	System.out.println("Erro! a nota precisa estar entre 0 e 10");
                	System.out.println("Digite a nota 1: ");
                    aluno.nota1 = sc.nextDouble();
                }

                System.out.print("Digite a nota 2: ");
                aluno.nota2 = sc.nextDouble();
                while (aluno.nota2 < 0 || aluno.nota2 > 10 ) {
                	System.out.println("Erro! a nota precisa estar entre 0 e 10");
                	System.out.println("Digite a nota 2: ");
                    aluno.nota2 = sc.nextDouble();
                }

                System.out.print("Digite a nota 3: ");
                aluno.nota3 = sc.nextDouble();
                while (aluno.nota2 < 0 || aluno.nota2 > 10 ) {
                	System.out.println("Erro! a nota precisa estar entre 0 e 10");
                	System.out.println("Digite a nota 2: ");
                    aluno.nota2 = sc.nextDouble();
                }

                System.out.println("Notas cadastradas!");
                return;
            }
        }

        System.out.println("Aluno não encontrado.");
    }

    public void listar() {

        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
            return;
        }

        for (Aluno aluno : alunos) {

            System.out.println("----------------------");
            System.out.println("Nome: " + aluno.nome);
            System.out.printf("Nota 1: %.2f%n", aluno.nota1);
            System.out.printf("Nota 2: %.2f%n", aluno.nota2);
            System.out.printf("Nota 3: %.2f%n", aluno.nota3);
            System.out.printf("Média: %.2f%n", aluno.calcularMedia());
        }
    }

    public void mostrarAprovados() {

        for (Aluno aluno : alunos) {

            if (aluno.calcularMedia() >= 7) {
                System.out.printf(aluno.nome + " - Média: %.2f%n", aluno.calcularMedia());
            }
            else {
            	System.out.println("Não tem aprovados");
            }
        }
    }

    public void mostrarReprovados() {

        for (Aluno aluno : alunos) {

            if (aluno.calcularMedia() < 7) {
                System.out.printf(aluno.nome + " - Média: %.2f%n", aluno.calcularMedia());
            }
            else {
            	System.out.println("Não tem reprovados");
            }
        }
    }
}