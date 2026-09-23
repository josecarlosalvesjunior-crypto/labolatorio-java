package sistema_notas;

public class Aluno {
	String nome;
    double nota1;
    double nota2;
    double nota3;
	
    public Aluno(String nome) {
        this.nome = nome;
    }

    public double calcularMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }

}
