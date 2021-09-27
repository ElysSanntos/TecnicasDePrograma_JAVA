package br.com.treinaweb.zoologico.app;

import br.com.treinaweb.zoologico.classes.Animal;

public class Programa {

	public static void main(String[] args) 
	{
		Animal cachorro = new Animal("Totó",2,"Pincher");
		
		Animal cachorros = new Animal("Lili");
		cachorros.setEspecie("Poodle");
		cachorros.setIdade(3);
		
		
		
		System.out.println("Olá, seu animal é: " + cachorro.getEspecie() +
				           ", o mome do cachorro é: " + cachorro.getNome() + ", ele tem "+cachorro.getIdade()
				           + " anos");
		
		System.out.println("Olá, seu animal é: " + cachorros.getEspecie() +
		           ", o mome do cachorro é: " + cachorros.getNome() + ", ele tem "+cachorros.getIdade()
		           + " anos");
		
		
		if(cachorro.ehAdulto())
		{
			System.out.println("Animal adulto");
		}else {
			System.out.println("\nAnimal não é adulto");
		}
	}

}
