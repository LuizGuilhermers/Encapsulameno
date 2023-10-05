package Encapsulamento;

import Encapsulamento.Endereco.Endereco;
import Encapsulamento.ItemTema.ItemTema;
import Encapsulamento.cliente.Cliente;
import Encapsulamento.tema.Tema;

public class Principal {

	public static void main(String[] args) {
		Tema tema = new Tema(1, "Carnaval", "Amarela", 3000.00);
		Cliente cliente = new Cliente (1,"Luiz", "988358604", "45876134798","65625.96256");
		ItemTema itemTema = new ItemTema (1,"Blusa", "Azul");
		Endereco endereco = new Endereco (1,"",25,"","","","","");
		
		System.out.println ("\n" + "Tema");
		System.out.println ("\n" + tema.getNome());
		System.out.println (tema.getCorToalha());
		System.out.println (tema.getValorAluguel());
		
		System.out.println ("\n" + "Cliente");
		System.out.println ("\n" + cliente.getNome());
		System.out.println (cliente.getTelefone());
		System.out.println (cliente.getCpf());
		System.out.println (cliente.getRg());
		
		System.out.println ("\n" + "Item Tema");
		System.out.println ("\n" + itemTema.getNome());
		System.out.println (itemTema.getDescricao());
		
		System.out.println ("\n" + "Endereco");
		System.out.println ("\n" + endereco.getLogradouro());
		System.out.println (endereco.getNumero());
		System.out.println (endereco.getComplemento());
		System.out.println (endereco.getBairro());
		System.out.println (endereco.getCidade());
		System.out.println (endereco.getCep());
		System.out.println (endereco.getUf());
	
		
		
		

	}

}
