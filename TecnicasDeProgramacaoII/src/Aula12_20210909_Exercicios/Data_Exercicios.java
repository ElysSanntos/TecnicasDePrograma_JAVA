package Aula12_20210909_Exercicios;


public class Data_Exercicios 
{
	private byte dia, mes; /* private evitar a possibilidade de declarar uma data inexistente, 
	  						independente da valida��o do construtor - exe: x.dia = 50 - sem usar o metodo get;*/
private short ano;




private static boolean isBissexto (short ano)
{
if (ano<1583) // vigencia do Calendario Juliano
	if (ano%4 == 0)
		return true;
	else
		return false;


//vigencia do Calendario Gregoriano

if (ano%400 == 0)
	return true;

if (ano%4==0 && ano%100!=0)
	return true;

return false;
}

private static boolean isValida (byte dia, byte mes, short ano)
{
if (ano==1582 && mes==10 && dia>=5 && dia<=14)
	return false; // Bula Papal Inter Gravissimas, do Papa Greg�rio XIII

if (dia<1 || dia>31)
	return false;

if (mes<1 || mes>12)
	return false;

if (ano==0)
	return false;

//quando eu chego aqui, n�o preciso me preocupar com as valida��es acima, a partir de agora, vamos validar os detalhes
//Os meses abaixo, n�o podem ser maiores que 30
if ((mes==4 || mes==6 || mes==9 || mes==11) && dia>30)
	return false;

if (mes==2 && dia>29) // nunca � maior que 29, n�o importa se � bissexto ou n�o
	return false;

if (mes==2 && dia>28 && !isBissexto(ano))
	return false;

return true;
}


public Data_Exercicios (byte dia, byte mes, short ano) throws Exception /*Construtor - Mesmo nome da classe - n�o 
																		tem retorno - void n�o assumido*/


{
	/*Valido dia mes e ano, lan�o exce��o se n�o for valido. 
	 * Sendo valido, guardo o dia, mes e ano fornecido como 
	 * parametros nos atributos do meu objeto*/
if (!isValida(dia,mes,ano))
	throw new Exception ("Data invalida");

this.dia=dia;
this.mes=mes;
this.ano=ano;
}



//getters
/*Com finalidade de conseguir saber(ver) os valores e consiga saber apesar dos atributos serem privados*/

public byte getDia(){return this.dia;}
public byte getMes(){return this.mes;}
public short getAno(){return this.ano;}


//setters
/*Para alterar os atributos dia, mes e ano
 * 1 - valida se o dia que veio como parametro, junto com o mes e o ano, s�o validos 
 * - Se n�o: Lan�a exec��o 
 * - Se sim, atualizo o dia, mes e ano*/

public void setDia (byte dia) throws Exception
{
if (!isValida(dia,this.mes,this.ano))
	throw new Exception ("Dia inv�lido");

this.dia=dia;
}    

public void setMes (byte mes) throws Exception
{
if (!isValida(this.dia,mes,this.ano))
	throw new Exception ("M�s inv�lido");

this.mes=mes;
}    

public void setAno (short ano) throws Exception
{
if (!isValida(this.dia,this.mes,ano))
	throw new Exception ("Ano inv�lido");

this.ano=ano;
}

public void setTudo(byte dia, byte mes, short ano )throws Exception
{
if(!Data_Exercicios.isValida(dia,mes,ano))
	throw new Exception("Data Inv�lida");

this.dia = dia;
this.mes = mes;
this.ano = ano;
}




public void tranformeSeNoDiaSeguinte ()
//alterar this.dia e/ou this.mes e/ou this.ano para
// a data avancar 1 dia rumo ao futuro

{
    if (!isValida(dia,mes,ano))
    {
        this.dia=(byte)15;
    }
    else {
    	
        if (isValida((byte) (this.dia+1),this.mes,this.ano))
            this.dia++;
        else
            if (isValida((byte)1,(byte)(this.mes+1),this.ano))
            {
                this.dia=1;
                this.mes++;
            }
            else
            {
                this.dia=1;
                this.mes=1;
                this.ano++;
                
                if (this.ano==0)
                    this.ano++;
            }
    }
}

public void tranformeSeNoDiaAnterior () /* esse metodo modificada a data original*/
{
    // alterar this.dia e/ou this.mes e/ou this.ano para
    // a data avancar 1 dia rumo ao passado
	
	if (!isValida(dia,mes,ano))
    {
        this.dia=(byte)15;
    }
    else
        if (isValida((byte)(this.dia-1),this.mes,this.ano))
            this.dia--;
        else {
        	byte mesAuxiliar = this.mes;
        	mesAuxiliar --;
            for(byte i = 31;i >= 28; i--) 
            	
            {
            	if (isValida((byte)i,(byte)mesAuxiliar,this.ano))
            	{
                    this.dia=i;
                    this.mes--;
                    break;
                }
            	
            }
            if(mesAuxiliar==0) 
            {

                this.dia=31;
                this.mes=12;
                this.ano--;
                
                if (this.ano==0)
                    this.ano++;
          
        }
        }
}

public Data_Exercicios getDiaAnterior ()/*N�o muda a data de referencia*/
{
    // retornar uma data que representa 1 dia antes do
    // objeto acionador deste m�todo, ou seja, do this
	
	
	Data_Exercicios ret=null; /*� preciso realizar um retorno, por isso declaro como null*/
    try
    {
     this.tranformeSeNoDiaAnterior();
   	 ret = new Data_Exercicios (this.dia,this.mes,this.ano);
    }
    catch(Exception erro)
    {}
    
        
    return ret;
	
}

public Data_Exercicios getDiaSeguinte ()
{
    // retornar uma data que representa 1 dia depois do
    // objeto acionador deste m�todo, ou seja, do this
	
	Data_Exercicios ret=null;
     try
     {
         this.tranformeSeNoDiaSeguinte();
    	 ret = new Data_Exercicios (this.dia,this.mes,this.ano);
     }
     catch(Exception erro)
     {}
     
         
     return ret;
}

/*=========M�TODOS OBRIGAT�RIOS==============*/
@Override
public String toString()
{
return
(this.dia < 10?"0":"")+this.dia+ "/"+
(this.mes < 10?"0":"")+this.mes+ "/"+
this.ano;

}

/*Vers�o 2.0 do m�todo Equals*/

@Override
public boolean equals (Object obj)
{
	if (this==obj) return true;
	if (obj==null) return false;
	
	if (this.getClass() != obj.getClass()) return false; // usando um metodo getClass(), herdado de Object 
														 //- Por exemplo se eu passar uma string no parametro, ser� identificado.
	
	//Vers�o alternativa
	//if (obj.getClass() != Data_Programa4.class) return false;
	
	Data_Exercicios data = (Data_Exercicios) obj; //Preciso fazer o obj ser encarado como um tipo Data, 
												//depois fa�o a compara��o com os atributos da data, fazendo com que eu escreva somente uma vez data
	
	if (this.dia !=data.dia) return false;
	if (this.mes !=data.mes) return false;
	if (this.ano !=data.ano) return false;
	 return true;
}


}
