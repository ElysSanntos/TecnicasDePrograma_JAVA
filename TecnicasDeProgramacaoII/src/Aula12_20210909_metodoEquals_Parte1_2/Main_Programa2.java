package Aula12_20210909_metodoEquals_Parte1_2;

public class Main_Programa2 {

	public static void main(String[] args) 
	{
		try 
		{
			Data_Programa2 d1 = new Data_Programa2 ((byte)19,(byte)1,(short)1966);
			Data_Programa2 d2 = d1;
			Data_Programa2 d3 = new Data_Programa2((byte)19,(byte) 1,(short) 1966);
			Data_Programa2 d4 = new Data_Programa2((byte)29,(byte) 6,(short) 1992);
			
			if(d1 == d2)
				System.out.println("d1 eh == d2"); //Esperado e concretizado
			else
				System.out.println("d1 NÃO eh == d2");
			if(d1 == d3)
				System.out.println("d1 eh == d3");//Esperado?
			else
				System.out.println("d1 NÃO eh == d3");// Concretizado
			if(d1 == d4)
				System.out.println("d1 eh == d4");
			else
				System.out.println("d1 NÃO eh == d4"); // Esperado e concretizado
				
				
		} catch (Exception erro) {
			System.err.println(erro.getMessage());
		}

	}

}
