package br.com.treinaweb.zoologico.app;

import br.com.treinaweb.zoologico.classes.Animal;

public class Programa {

	public static void main(String[] args) 
	{
		Animal cachorro = new Animal("Tot�",2,"Pincher");
		
		Animal cachorros = new Animal("Lili");
		cachorros.setEspecie("Poodle");
		cachorros.setIdade(3);
		
		
		
		System.out.println("Ol�, seu animal �: " + cachorro.getEspecie() +
				           ", o mome do cachorro �: " + cachorro.getNome() + ", ele tem "+cachorro.getIdade()
				           + " anos");
		
		System.out.println("Ol�, seu animal �: " + cachorros.getEspecie() +
		           ", o mome do cachorro �: " + cachorros.getNome() + ", ele tem "+cachorros.getIdade()
		           + " anos");
		
		
		if(cachorro.ehAdulto())
		{
			System.out.println("Animal adulto");
		}else {
			System.out.println("\nAnimal n�o � adulto");
		}
	}

}
