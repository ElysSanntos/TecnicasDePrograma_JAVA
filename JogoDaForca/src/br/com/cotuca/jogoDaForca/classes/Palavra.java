package br.com.cotuca.jogoDaForca.classes;

public class Palavra implements Comparable<Palavra>
{
    private String texto;

    public Palavra (String texto) throws Exception
    {
		/*verifica se o texto recebido é nulo ou então vazio,
		 ou seja, sem nenhum caractere, lançando exceção.
		*/
    	
    	if(texto == null || texto == "")
    		throw new Exception ("Texto inválido");
    	
    	//armazena o texto recebido em this.texto.
    	
    	this.texto = texto;
    }

    public int getQuantidade (char letra)
    {
        // percorre o String this.texto, conta e retorna
        // quantas letras existem nele iguais a letra fornecida
    	
    	for(int i = 0; i < this.getTamanho();i++)
    		if(letra == this.texto.charAt(i))
    			qtd++;
    	
    	return qtd;
    }

    public int getPosicaoDaIezimaOcorrencia (int i, char letra) throws Exception
    {
        // se i==0, retorna a posicao em que ocorre a primeira
        // aparicao de letra fornecida em this.texto;
        // se i==1, retorna a posicao em que ocorre a segunda
        // aparicao de letra fornecida em this.texto;
        // se i==2, retorna a posicao em que ocorre a terceira
        // aparicao de letra fornecida em this.texto;
        // e assim por diante.
        // lançar excecao caso nao encontre em this.texto
        // a Iézima aparição da letra fornecida.
    	
    	int j;
    	for(j = iezima; j < this.getTamanho(); j++)
    		if(letra == this.texto.charAt(j))
    		{
    			iezima = j +1;
    			break;
    		}
    	if(i == this.getQuantidade(letra) - 1)
    		iezima = 0;
    	
    	return j;
    	
    	
    }

    public int getTamanho ()
    {
        return this.texto.length();
    }

    @Override
    public String toString ()
    {
        return this.texto;
    }

    @Override
    public boolean equals (Object obj)
    {
        // verificar se this e obj possuem o mesmo conteúdo, retornando
        // true no caso afirmativo ou false no caso negativo
    	
    	if(this == obj) return false;
    	if(this.getClass()!= obj.getClass())return false;
    	
    	Palavra word = (Palavra)obj;
    	if(!this.texto.equals(word.texto)) return false;
    	return true;
    }

    @Override
    public int hashCode ()
    {
        // calcular e retornar o hashcode de this
    	int nro = 29;
    	if(this.texto != null)
    		nro = nro * 11 + this.texto.hashCode();
    	  if(nro < 0) nro = -nro;
    	  	return nro;
    }

    public int compareTo (Palavra palavra)
    {
        return this.texto.compareTo(palavra.texto);
    }
}
