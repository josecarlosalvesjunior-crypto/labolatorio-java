package sistema_acampamento;

public class Pessoa {
	private String nome;
	private int idade;
	private String cidade;
	private String sexo;
	private String cpf;
	private int pagou;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getPagou() {
		return pagou;
	}

	public void setPagou(int pagou) {
		if (pagou == 1 || pagou == 2) {
	        this.pagou = pagou;
	    }
	}
	
	public String getStatus() {
	    if (pagou == 1) {
	        return "Pagou";
	    } else if (pagou == 2) {
	        return "Não pagou";
	    }
	    return "Não informado";
	}
	
}
