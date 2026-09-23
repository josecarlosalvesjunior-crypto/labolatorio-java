package sistema_acampamento;

import java.util.Scanner;

public class Sistema {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	GerenciadorAcampamento gerenciador = new GerenciadorAcampamento();

    	int opcao = 0;
    	
    	while (opcao != 5) {
    		
    		System.out.println("--- Acampamento 2026 ---");
    		System.out.println("[1]- Cadastrar pessoa");
    		System.out.println("[2]- Listar pessoas cadastradas");
    		System.out.println("[3]- Mostrar pagantes");
    		System.out.println("[4]- Mostrar não pagantes");
    		System.out.println("[5]- Sair");
    		System.out.print("Escolha uma opção: ");
    		
    		opcao = sc.nextInt();
    		
    		switch(opcao) {
    		case 1:
    			gerenciador.cadastrar();
    			break;
    		case 2:
    			gerenciador.listar();
    			break;
    		case 3: 
    			gerenciador.mostrarPagantes();
    			break;
    		case 4:
    			gerenciador.mostrarNaoPagantes();
    			break;
    		case 5:
    			System.out.println("Sistema encerrado!");
    			break;
    		default: 
    			System.out.println("Opção inválida!");

    		}
    	}
    	
    }
    
}