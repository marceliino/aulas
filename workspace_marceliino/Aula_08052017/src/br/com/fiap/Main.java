package br.com.fiap;

public class Main {
	
	public static void main(String[] asas) {
		Aluno aluno = new Aluno();
		aluno.setNomeAluno("Marcelo");
		aluno.setCodigoAluno(123);
		
		System.out.println(aluno.getNomeAluno() + " - "+ aluno.getCodigoAluno());
		
		Cliente cliente = new Cliente("123","456","rua asas", "Marcelo");
		System.out.println(cliente);		
	}

}
