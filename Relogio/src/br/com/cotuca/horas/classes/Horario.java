package br.com.cotuca.horas.classes;

public class Horario 
{
	//ATRIBUTOS
	
	private Long totalMilesegundos = System.currentTimeMillis() - 10800000; // total de milisegundos passados desde 1/1/1970 a partir das 23hrs(Era Unix) - Marco zero
																// diferen�a de 3 horas p/Brasil por isso a subtra��o
	private long totalSegundos = totalMilesegundos/1000; //Convers�o para segundos
	private long segundosAtual = totalSegundos % 60; // obter o segundo neste momento
	private long totalMinutos = totalSegundos / 60; //Todos os minutos desde 1970
	private long minutoAtual = totalMinutos % 60; // obter minuto atual
	private long totalHora = totalMinutos / 60; // todas as horas desde 1970
	private long horaAtual = totalHora % 24; // hora neste momento
	
	
	// GETTERS E SETERS
	public void setHoraAtual( Long horaAtual)
	{
		this.horaAtual = horaAtual;
	}
	
	public Long getHoraAtual()
	{
		return horaAtual;
	}
	
	public void setMinutoAtual(Long minutoAtual)
	{
		this.minutoAtual = minutoAtual;
	}
	public Long getMinutoAtual()
	{
		return minutoAtual;
	}
	
	public void setSegundoAtual(Long segundoAtual)
	{
		this.segundosAtual = segundoAtual;
	}
	public Long getSegundosAtual()
	{
		return segundosAtual;
	}
	
	
	public void adiante (int qtdSegundos) throws Exception
	{
	    // alterar this.horas e/ou this.minutos e/ou this.segundos
	    // para o hor�rio avan�ar a quantidade de segundos fornecida
	    // como par�metro; lan�ar exce��o, caso essa quantidade seja
	    // negativa ou zero
	}

	public void atrase () throws Exception
	{
	    // alterar this.horas e/ou this.minutos e/ou this.segundos
	    // para o hor�rio retroceder a quantidade de segundos fornecida
	    // como par�metro; lan�ar exce��o, caso essa quantidade seja
	    // negativa ou zero
	}

	/*public Horario daquiA (int qtdSegundos) throws Exception
	{
	    // retornar o hor�rio que se situa para frente na linha do tempo
	    // exatamente a quantidade de segundos fornecida; lan�ar exce��o,
	    // caso essa quantidade seja negativa ou zero
	}

	public Horario ha (int qtdSegundos) throws Exception
	{
	    // retornar o hor�rio que se situa para tr�s na linha do tempo
	    // exatamente a quantidade de segundos fornecida; lan�ar exce��o,
	    // caso essa quantidade seja negativa ou zero
	}*/

}
