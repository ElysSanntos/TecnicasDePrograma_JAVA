package Aula12_20210909_Exercicios;


public class Main_Aula12_Exercicios {

	public static void main(String[] args) 
	{
		
			try 
			{
				Data_Exercicios hoje = new Data_Exercicios((byte)1,(byte)1,(short)1);
				Data_Exercicios hojeParaAmanha = new Data_Exercicios((byte)1,(byte)1,(short)1);
				Data_Exercicios hojeParaOntem = new Data_Exercicios((byte)1,(byte)1,(short)1);
				
				System.out.println("Hoje � dia: "+hoje);
				
				Data_Exercicios amanha = hojeParaAmanha.getDiaSeguinte();
				System.out.println("\n==========Dia seguinte==========\n");
				System.out.println("Se hoje  � dia: "+hoje);
				System.out.println("\nEnt�o, amanh� ser�: "+amanha);
				
				Data_Exercicios ontem = hojeParaOntem.getDiaAnterior();
				System.out.println("\n==========Dia Anterior==========\n");
				System.out.println("Se hoje � dia: "+hoje);
				System.out.println("\nEnt�o, ontem foi: "+ontem);
				
				
				
			} catch (Exception erro) 
			{
				System.out.println(erro.getMessage());
				
			}
		}

	}


