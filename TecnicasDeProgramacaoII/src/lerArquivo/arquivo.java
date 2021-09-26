package lerArquivo;

import java.io.BufferedReader;
import java.io.FileReader;


public class arquivo 
{
	public static void main(String[] args) 
	{
		
		
		try 
		{
			BufferedReader arquivo = new BufferedReader(new FileReader("arquivo.txt"));
			while(arquivo.ready())
			System.out.println(arquivo.readLine());
		} catch (Exception e) {
			// TODO: handle exception
		}
		 
		
		
	}

}
