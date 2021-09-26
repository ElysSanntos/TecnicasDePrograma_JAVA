
package _20210819;

/*Comentários de trecho*/
//Comentarios de linha - Usar em linhas de dificil compreensão

import java.io.*;
//Esta contido nas bibliotecas java.io*( java.ioInputStreamReader / java.io.IOException / java.io.)


public class Main 

{
	public static void main(String[] args) //Para ser uma classe executavel, deve ter um metodo exatamente assim --uma classe executavel não deveria ter outro metodo
	{
		
		System.out.println("Aula 19/08/2021 e aula 23/08/2021");
		System.out.print("Hello ");
		System.out.println("World");
		System.out.println("Este é um programa feito em Java");
		
		BufferedReader leitorTeclado = new BufferedReader(new InputStreamReader(System.in));//(System.in) significa teclado
		/*BufferedReader arquivo = new BufferedReader(new FileReader("arquivo.txt);
		 * While(arquivo.ready())
		 * System.out.println(arquivo.readLine())
		 */
		
		System.out.print("Como você se chama?");
		
		String nome = "";
		try 
		{
			nome = leitorTeclado.readLine();
			System.out.println("Bem vindo ao estudo de Java, "+nome);
		} catch (Exception e) 
		{}//aqui eu deveria escrever os comandos para tratar o erro, mas neste caso estou ignorando o erro pois sei que não dará erro para o readLine
		
		
		
				int qtd = 0;
				for(;;)// forever -- repetição infinita -- para com um break
				{
				System.out.print(nome+", Quantas vezes você pretende fazer essa matéria? " );
				
				try {
					 qtd = Integer.parseInt(leitorTeclado.readLine());
					if (qtd<=0)
					System.out.println(nome+", Com essa quantidade de vezes é quase certo que você fará esta materia fará varias vezes!");
					else
						break;
						
				} catch (IOException e) {}
				catch(NumberFormatException e){
					System.err.println("A quantidade de vezes deve ser um numero inteiro; tente novamente....");
				}
				
				}
				System.out.print(nome+", boa sorte, que você não faça mais do que "+qtd+" vez(es) esta matéria!");
	}

}
