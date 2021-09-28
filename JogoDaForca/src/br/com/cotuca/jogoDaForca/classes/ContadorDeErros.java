package br.com.cotuca.jogoDaForca.classes;

public class ContadorDeErros implements Cloneable
{
    private int qtdMax, qtdErr=0;

    public ContadorDeErros (int qtdMax) throws Exception
    {
		// verifica se qtdMax fornecida não é positiva, lançando
		// uma exceção.
		    	
    	if(qtdMax < 0) throw new Exception("Quantidade fornecida negativa, por favor informe uma quantidade positiva.");
    	
    	// armazena qtdMax fornecida em this.qtdMax.
    	
    	this.qtdMax = qtdMax;
    }

    public void registreUmErro () throws Exception
    {
        // verifica se this.qtdErr ja é igual a this.qtdMax,
        // lançando excecao em caso positivo ou
        // incrementando this.qtdErr em caso negativo
    	
    	try 
    	{
    		for(this.qtdErr = 0; this.qtdErr < 0; this.qtdErr ++)
    		{
    			if(this.qtdErr ==this.qtdMax)
    			{
    				System.out.printf("Foram  x tentativas .... a palavra era %d", this.qtdErr);
    			}
    			
    			System.exit(this.qtdMax);
    		}
			
		} catch (Exception e) {
			
			System.out.println("Quantidade de tentativas informada, é negativa, favor avaliar!");
		}
    }

    public boolean isAtingidoMaximoDeErros()
    {
        // returna true se this.qtdErr for igual a this.qtdMax,
        // ou então false, caso contrario.
    	if(this.qtdErr == this.qtdMax)return true;
    	if(this.qtdErr != this.qtdMax)return false;
    }

    @Override
    public String toString ()
    {
        return this.qtdErr + "/" + this.qtdMax;
    }

    @Override
    public boolean equals (Object obj)
    {  
    	//******Entender melhor essa implementação*********
    	if(this == obj) return true;  // verificar se this e obj possuem o mesmo conteúdo, retornando
    	if(obj == null) return false; // true no caso afirmativo ou false no caso negativo
    	if(this.getClass() != obj.getClass()) return false;
    	
    	ControladorDeErros errorControl = (ControladorDeErros)obj;
    	
    		if(this.qtdErr != errorControl.qtdErr) return false;
    		if(this.qtdMax != errorControl.qtdMax) return false;
    		
    		return true;
    }

    public int hashCode ()
    {
        // calcular e retornar o hashcode de this
    	
    	int num = 29;
    	
    	num = (num * 11) + new Integer(this.qtdErr).hashCode();
    	num = (num * 11) + new Integer(this.qtdMax).hashCode();
    	
    	if(num < 0) num = -num;
    	
    	return num;
    }

    public ContadorDeErros (ControladorDeErros c) throws Exception // construtor de cópia
    {
        // copiar c.qtdMax e c.qtdErr, respectivamente em, this.qtdMax e this.qtdErr
    	
    	if(c == null)
    			throw new Exception ("Sem controlador");
    	this.qtdErr = c.qtdErr;
    	this.qtdMax = c.qtdMax;
    	
    }

    @Override
    public Object clone ()
    {
        // returnar uma cópia de this
    	
    	try 
    	{
    		c = new ControladorDeErros(this);
			
		} catch (Exception erroClone) {}
    	
    		return c;
    }
}
