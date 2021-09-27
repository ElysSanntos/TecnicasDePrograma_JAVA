package br.com.cotuca.jogoDaForca.classes;

import java.util.Scanner;

import sun.awt.dnd.SunDragSourceContextPeer;

public class ControladorDeLetrasJaDigitadas implements Cloneable
{
    private String letrasJaDigitadas;

    public ControladorDeLetrasJaDigitadas ()
    {
        // torna this.letrasJaDigitadas igual ao String vazio
    }

    public boolean isJaDigitada (char letra)
    {
        // percorrer o String this.letrasJaDigitadas e verificar se ele
        // possui a letra fornecida, retornando true em caso afirmativo
        // ou false em caso negativo
    	
    	try 
    	{
    		char letraTendada = new Scanner(System.in).next().charAt(0);
    		if(this.letrasJaDigitadas.indexOf(letraTendada) >= 0) //Significa que encontramos a letra tentada dentro da string letras usadas, 
    																//isso significa que a letra é repedida
    		{
    			System.out.printf(" A  letra %s já foi digitada, tente novamente!", this.letrasJaDigitadas);													
    		}else 
    		{
    			this.letrasJaDigitadas += letraTentada;    			
    		}
    		if(palavra.indexOf(letraTentada) >= 0) //Significa que a palavra sorteada tem a letra informada pelo usuário 
    												//e neste caso precisamos substituir o tracinho por esta letra
    		{
    			palavra = ""; //Vamos criar um loop para localizar onde realizar a substituição
    			for(int j = 0;j < palavra.length();j++)
    			{
    				palavra += this.letrasJaDigitadas.indexOf(palavra.charAt(j)) >= 0 ? palavra.charAt(j) : "__";
    				/* Nas letras usadas, vamos pegar o indice, vai verificar se a palavra sorteada nesta posição j, 
    				 * existe na palavra sorteada, se existir, vamos pegar a letra e substituir pelo tracinho*/
    			}
    			
    			/*Vamos verificar se ainda tem jogo*/
    			
    			if (palavra.contains("__"))
    			{
    				System.out.printf("Muito bem! %s existe na palavra, ainda há letras escondidas.", palavra);
    			}else {
    				System.out.printf("Parabéns, a palavra sorteada éh %s", palavra);
    				System.exit(0);
    			}else // Vamos verificar se a letra digitada existe na palavra
    			{
    				System.out.printf("Infelizmente a letra digitada %s não existe na palavra sorteada.",this.letrasJaDigitadas);
    				
    			}
    		}
		} catch (Exception e) 
    	{
			
		}
    }

    public void registre (char letra) throws Exception
    {
		// verifica se a letra fornecida ja foi digitada (pode usar
		// o método this.isJaDigitada, para isso), lancando uma exceção
		// em caso afirmativo.
		// concatena a letra fornecida a this.letrasJaDigitadas.
    }

    public String toString ()
    {
		// retorna um String com TODAS as letras presentes em
		// this.letrasJaDigitadas separadas por vírgula (,).
    }

    public boolean equals (Object obj)
    {
        // verificar se this e obj são iguais
    }

    public int hashCode ()
    {
        // calcular e retornar o hashcode de this
    }

    public ControladorDeLetrasJaDigitadas(
    ControladorDeLetrasJaDigitadas controladorDeLetrasJaDigitadas)
    throws Exception // construtor de cópia
    {
        // copiar c.letrasJaDigitadas em this.letrasJaDigitadas
    }

    public Object clone ()
    {
        // criar uma cópia do this com o construtor de cópia e retornar
    }
}
