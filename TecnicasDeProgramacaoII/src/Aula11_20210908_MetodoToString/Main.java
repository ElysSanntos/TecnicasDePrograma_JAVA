package Aula11_20210908_MetodoToString;



public class Main 
{
	public static void main(String[]args)
	{
		try 
		{
			Data d = new Data((byte)19,(byte)1,(short)1966);
			System.out.println("d: "+d);
			System.out.println("d: "+d.toString());
		} catch (Exception erro) 
		{
			System.err.println(erro.getMessage());
		}
	}

}
