package Aula12_20210909_metodoEquals_Parte1_3;

import Aula12_20210909_metodoEquals_Parte1_2.Data_Programa2;

public class Main_Programa3 {

	public static void main(String[] args) 
	{
		
			try 
			{
				Data_Programa2 d1 = new Data_Programa2 ((byte)19,(byte)1,(short)1966);
				Data_Programa2 d2 = d1;
				Data_Programa2 d3 = new Data_Programa2((byte)19,(byte) 1,(short) 1966);
				Data_Programa2 d4 = new Data_Programa2((byte)29,(byte) 6,(short) 1992);
				
				if(d1.equals(d2))
					System.out.println("d1 eh Equals d2"); //Esperado e concretizado
				else
					System.out.println("d1 NÃO eh Equals d2");
				if(d1.equals(d3))
					System.out.println("d1 eh Equals d3");//Esperado
				else
					System.out.println("d1 NÃO eh Equals d3");// Concretizado
				if(d1.equals(d4))
					System.out.println("d1 eh Equals d4");
				else
					System.out.println("d1 NÃO eh Equals d4"); // Esperado e concretizado
					
					
			} catch (Exception erro) {
				System.err.println(erro.getMessage());
			}

		


	}

}
