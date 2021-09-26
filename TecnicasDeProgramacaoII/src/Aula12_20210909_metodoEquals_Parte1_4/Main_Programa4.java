package Aula12_20210909_metodoEquals_Parte1_4;

import java.util.Vector;

public class Main_Programa4
{
	public static void main (String[] args)
	{
		try 
		{
			Data_Programa4 d1 = new Data_Programa4 ((byte)19,(byte)1,(short)1966);
			Data_Programa4 d2 = d1;
			Data_Programa4
			d3 = new Data_Programa4((byte)19,(byte) 1,(short) 1966);
			Data_Programa4 d4 = new Data_Programa4((byte)29,(byte) 6,(short) 1992);
			
			Vector<Data_Programa4> vec = new Vector<Data_Programa4> ();
			vec.add(d1);
			
			if (vec.contains(d3))
				System.out.println("Vec Contains d3"); // Esperado
			else
				System.out.println("Vec NÃO contains d3"); //Concretizado
				
			
		} catch (Exception erro) 
		{
			System.out.println(erro.getMessage());
			
		}
	}
}
