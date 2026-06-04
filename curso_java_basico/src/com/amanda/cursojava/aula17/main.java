package com.amanda.cursojava.aula17;

public class main {

	public static void main(String[] args) {
				
		Contato contato = new Contato();
		contato.setNome("Tyrion");
		//contato.setEndereco("Kings Landing");
		
		Endereco end = new Endereco();
		end.setNomeRua("Porto real");
		contato.setEndereco(end);
		
		//relacionamento tem-um telefone
		Telefone telefone = new Telefone();
		telefone.setTipo("celular");
		telefone.setDdd("11");
		telefone.setNumero("99999-9999");

		Telefone telefone2 = new Telefone();
		telefone2.setTipo("casa");
		telefone2.setDdd("11");
		telefone2.setNumero("88888-8888");
		
		Telefone [] telefones = new Telefone[2];
		telefones[0] = telefone;
		telefones[1] = telefone2;

		contato.setTelefone(telefones);

		
		System.out.println(contato.getNome());
		if (contato != null && contato.getEndereco() != null){
			System.out.println(contato.getEndereco().getNomeRua());
		}
	}
}