package br.com.cotuca.horas.classes;

public class Horario 
{
	//ATRIBUTOS
	
	private Long totalMilesegundos = System.currentTimeMillis() - 10800000; // total de milisegundos passados desde 1/1/1970 a partir das 23hrs(Era Unix) - Marco zero
																// diferença de 3 horas p/Brasil por isso a subtração
	private long totalSegundos = totalMilesegundos/1000; //Conversão para segundos
	private long segundosAtual = totalSegundos % 60; // obter o segundo neste momento
	private long totalMinutos = totalSegundos / 60; //Todos os minutos desde 1970
	private long minutoAtual = totalMinutos % 60; // obter minuto atual
	private long totalHora = totalMinutos / 60; // todas as horas desde 1970
	private long horaAtual = totalHora % 24; // hora neste momento
	
	
	// CONSTRUTOR
	public Horario() {}
	
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
	
	public void validaHoras(long hora, long minuto, long segundo)
	{
		try {
			if((horaAtual > 0) && (horaAtual<= 23)) {
				this.horaAtual = hora;
				if((minutoAtual > 0 ) && (minutoAtual <= 60)) {
					this.minutoAtual = minuto;
				}
				if((segundosAtual > 0) && (segundosAtual <= 60)) {
					this.segundosAtual = segundo;
				}
			}
			
		} catch (Exception e) {
			
		}
	}
	
	public void adiante (Long qtdSegundos) throws Exception
	{
	    // alterar this.horas e/ou this.minutos e/ou this.segundos
	    // para o horário avançar a quantidade de segundos fornecida
	    // como parâmetro; lançar exceção, caso essa quantidade seja
	    // negativa ou zero
		
		try 
		{
			if(qtdSegundos < = 0)
			{
				throw new Exception ("Segundos Inválidos!");
				
			}
			if((segundosAtual > 59)||(minutoAtual > 59) ||(horaAtual > 23) {
				this.segundosAtual = 0;
				this.minutoAtual = 0;
				this.horaAtual = 0;
				
				}
			}
			
		} catch (Exception erroSegundos) {}
	}

	public void atrase () throws Exception
	{
	    // alterar this.horas e/ou this.minutos e/ou this.segundos
	    // para o horário retroceder a quantidade de segundos fornecida
	    // como parâmetro; lançar exceção, caso essa quantidade seja
	    // negativa ou zero
		try 
		{
			if(qtdSegundos < = 0)
			{
				throw new Exception ("Segundos Inválidos!");
				
			}
			if((segundosAtual < 59)||(minutoAtual < 59) ||(horaAtual < 23) {
				this.segundosAtual --;
				this.minutoAtual --;
				this.horaAtual --;
				
				}
			}
			
		} catch (Exception erroSegundos) {}
	}
		
	}

	/*public Horario daquiA (int qtdSegundos) throws Exception
	{
	    // retornar o horário que se situa para frente na linha do tempo
	    // exatamente a quantidade de segundos fornecida; lançar exceção,
	    // caso essa quantidade seja negativa ou zero
	}

	public Horario ha (int qtdSegundos) throws Exception
	{
	    // retornar o horário que se situa para trás na linha do tempo
	    // exatamente a quantidade de segundos fornecida; lançar exceção,
	    // caso essa quantidade seja negativa ou zero
	}*/

}
