package Aula8_20210830;

public class  Main {

	public static void main(String[] args) {
		try 
		{
			//Cria uma nova data
			Data x = new Data((byte)30,(byte)8,(short)2021);
			System.out.println(x.getDia()+"/"+x.getMes()+"/"+x.getAno());
			
			
			
			//Altera a uma data
			 x.setTudo((byte)29,(byte)6,(short)1992);
	            System.out.println (x.getDia()+"/"+x.getMes()+"/"+x.getAno());
			
			
			x.setDia((byte)19);
			x.setMes((byte)1);
			x.setAno((short)1966);
			System.out.println(x.getDia()+"/"+x.getMes()+"/"+x.getAno());
			
			
		} catch (Exception erro) {
			System.err.println(erro.getMessage());
		}
		System.out.println("Obrigada por usar este programa.");
	}

}
