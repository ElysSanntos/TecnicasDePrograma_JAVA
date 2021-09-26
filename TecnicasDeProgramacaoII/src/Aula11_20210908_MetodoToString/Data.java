package Aula11_20210908_MetodoToString;



public class Data
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


        // vigencia do Calendario Gregoriano

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
                
        // quando eu chego aqui, n�o preciso me preocupar com as valida��es acima, a partir de agora, vamos validar os detalhes
        //Os meses abaixo, n�o podem ser maiores que 30
        if ((mes==4 || mes==6 || mes==9 || mes==11) && dia>30)
            return false;

        if (mes==2 && dia>29) // nunca � maior que 29, n�o importa se � bissexto ou n�o
            return false;

        if (mes==2 && dia>28 && !isBissexto(ano))
            return false;

        return true;
    }
    
    public void setTudo(byte dia, byte mes, short ano )throws Exception
    {
    	if(!Data.isValida(dia,mes,ano))
    		throw new Exception("Data Inv�lida");
    	
    	this.dia = dia;
    	this.mes = mes;
    	this.ano = ano;
    }
    
    public Data (byte dia, byte mes, short ano) throws Exception /*Construtor - Mesmo nome da classe - n�o tem retorno - 
    																void n�o assumido*/
    
    
    {
        if (!isValida(dia,mes,ano))
            throw new Exception ("Data invalida");

        this.dia=dia;
        this.mes=mes;
        this.ano=ano;
    }
    
    
    
    // getters
    
    public byte getDia()
    {
        return this.dia;
    }
    
    public byte getMes()
    {
        return this.mes;
    }
    
    public short getAno()
    {
        return this.ano;
    }
    
    
    // setters
    
    public void setDia (byte dia) throws Exception
    {
        if (!isValida(dia,this.mes,this.ano))
            throw new Exception ("Dia invalido");
        
        this.dia=dia;
    }    
    
    public void setMes (byte mes) throws Exception
    {
        if (!isValida(this.dia,mes,this.ano))
            throw new Exception ("Mes invalido");
        
        this.mes=mes;
    }    
    
    public void setAno (short ano) throws Exception
    {
        if (!isValida(this.dia,this.mes,ano))
            throw new Exception ("Ano invalido");
        
        this.ano=ano;
    }
    
    public String toString()
    {
    	return
    			(this.dia < 10?"0":"")+this.dia+ "/"+
    			(this.mes < 10?"0":"")+this.mes+ "/"+
    			 this.ano;
    					
    }

}

	
	

