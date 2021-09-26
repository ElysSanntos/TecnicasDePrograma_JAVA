package Aula12_20210909_MetodoEquals_Parte1;

public class Main_Programa1 {

	public static void main(String[] args) 
	{
		try
		{
			Data_Programa1 d1 = new Data_Programa1((byte)19,(byte)1,(short)1966);
			Data_Programa1 d2 = d1;
			
			System.out.println("LOGO APÓS DECLARAR E INSTANCIAR");
			System.out.println("d1: "+d1);
			System.out.println("d2: "+d2);
			
			d1.setAno((short)1976);
			System.out.println("\nLOGO APÓS MUDAR EM d1 O ANO PARA 1976");
			System.out.println("d1: "+d1);
			System.out.println("d2: "+d2);
			
			d1.setAno((short)1986);
			System.out.println("\nLOGO APÓS MUDAR EM d2 O ANO PARA 1986");
			System.out.println("d1: "+d1);
			System.out.println("d2: "+d2);
			
			d1.setMes((byte)6);
			System.out.println("\nLOGO APÓS MUDAR EM d1 O MES PARA 6");
			System.out.println("d1: "+d1);
			System.out.println("d2: "+d2);
			
			d1.setMes((byte)12);
			System.out.println("\nLOGO APÓS MUDAR EM d2 O MES PARA 12");
			System.out.println("d1: "+d1);
			System.out.println("d2: "+d2);
			
			d1.setDia((byte)25);
			System.out.println("\nLOGO APÓS MUDAR EM d1 O DIA PARA 25");
			System.out.println("d1: "+d1);
			System.out.println("d2: "+d2);
			
			d1.setDia((byte)30);
			System.out.println("\nLOGO APÓS MUDAR EM d2 O DIA PARA 30");
			System.out.println("d1: "+d1);
			System.out.println("d2: "+d2);
			
		} catch (Exception erro) 
		{
			System.err.println(erro.getMessage());
		}


		
		
		

	}

}
