package sistema_acampamento;

import java.util.Scanner;
import java.util.ArrayList;

public class GerenciadorAcampamento {
	ArrayList<Pessoa> pessoas = new ArrayList<>();
	
	Scanner sc = new Scanner(System.in);
	
	public void cadastrar () {
		Pessoa p = new Pessoa();
		
		System.out.println("-----------------");
		System.out.print("Nome: ");
		p.setNome(sc.nextLine().trim());
		
		System.out.print("Idade: ");
		p.setIdade(sc.nextInt());
		sc.nextLine();
		
		System.out.print("Sexo: ");
		p.setSexo(sc.nextLine().trim());
		
		System.out.print("Cidade: ");
		p.setCidade(sc.nextLine().trim());
		
		System.out.print("CPF: ");
		String cpf = sc.nextLine().trim();
        while (!cpf.matches("\\d{11}")) {
            System.out.print("CPF inválido. Digite 11 números: ");
            cpf = sc.nextLine().trim();
        }
        p.setCpf(cpf);
		
		int pagou;
		do {
		    System.out.print("Pagou? (1) SIM  (2) NÃO: ");
		    pagou = sc.nextInt();
		    sc.nextLine();
		} while (pagou != 1 && pagou != 2);
		p.setPagou(pagou);
		
		
		
		pessoas.add(p);
		System.out.println("Pessoa cadastrada com sucesso!!");
	}
	
	
	
	public void listar () {
		if (pessoas.isEmpty()) {
			System.out.println("Nenhuma pessoa foi cadastrada ainda.");
			return;
		}
		
		for (Pessoa p : pessoas) {
			System.out.println("--------------------------------");
			System.out.println("Nome: " + p.getNome());
			System.out.println("Idade: " + p.getIdade());
			System.out.println("Sexo: " + p.getSexo());
			System.out.println("Cidade: " + p.getCidade());
			System.out.println("CPF: ***.***.***-**");
		}
	}
	
	public void mostrarPagantes () {
	    boolean achou = false;

	    for (Pessoa p : pessoas) {
	        if (p.getPagou() == 1) {
	            System.out.println(p.getNome() + " - " + p.getStatus());
	            achou = true;
	        }
	    }

	    if (!achou) {
	        System.out.println("Ninguém pagou ainda.");
	    }
	}
	
	public void mostrarNaoPagantes() {
	    boolean achou = false;

	    for (Pessoa p : pessoas) {
	        if (p.getPagou() == 2) {
	            System.out.println(p.getNome() + " - " + p.getStatus());
	            achou = true;
	        }
	    }

	    if (!achou) {
	        System.out.println("Todos já pagaram.");
	    }
	}
	
}
