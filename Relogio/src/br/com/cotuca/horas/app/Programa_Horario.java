package br.com.cotuca.horas.app;

import br.com.cotuca.horas.classes.Horario;

public class Programa_Horario {

	public static void main(String[] args) 
	{
		Horario hora = new Horario();
		hora.setHoraAtual((long) 18); 
		hora.setMinutoAtual((long) 34);
		hora.setSegundoAtual((long) 59);
		
		/*hora.getHoraAtual();
		hora.getMinutoAtual();
		hora.getSegundosAtual();*/
			
		System.out.println(hora.getHoraAtual() + ":" + hora.getMinutoAtual() + ":" + hora.getSegundosAtual());
		//System.out.println(hora.getHoraAtual() + ":" + hora.getMinutoAtual() + ":" + hora.adiante(0);
	}

}