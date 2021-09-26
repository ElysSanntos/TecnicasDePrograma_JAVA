package Teclado;

public class MainTeclado {
	
	public static void main(String[] args)
	{
		char opcao;
		do
		{
			try 
			{
				System.out.println();
				System.out.println("(a) Digitar um String");
				System.out.println("(b) Digitar um Byte");
				System.out.println("(c) Digitar um short");
				System.out.println("(d) Digitar um int");
				System.out.println("(e) Digitar um long");
				System.out.println("(e) Digitar um float");
				System.out.println("(f) Digitar um double");
				System.out.println("(g) Digitar um char");
				System.out.println("(h) Digitar um boolean");
				System.out.println("(j) Sair");
				System.out.println("Sua opção? ");
				opcao = Character.toLowerCase(Teclado.getUmChar());
						
				
			} catch (Exception e) 
			{
				opcao = 'z';
			}
			
			try 
			{
				switch (opcao)
				{
					case 'a':
						System.out.println("Digite o valor para uma String: ");
						String str = Teclado.getUmString();
						System.out.println("Foi digitado: "+str);
						break;
						
					case 'b':
						System.out.println("Digite o valor para uma byte: ");
						byte b = Teclado.getUmByte();
						System.out.println("Foi digitado: "+b);
						break;
						
					case 'c':
						System.out.println("Digite o valor para uma short: ");
						short s = Teclado.getUmShort();
						System.out.println("Foi digitado: "+s);
						break;
						
					case 'd':
						System.out.println("Digite o valor para uma int: ");
						int inteiro = Teclado.getUmShort();
						System.out.println("Foi digitado: "+inteiro);
						break;
						
					case 'e':
						System.out.println("Digite o valor para uma long: ");
						long l = Teclado.getUmLong();
						System.out.println("Foi digitado: "+l);
						break;
						
					case 'f':
						System.out.println("Digite o valor para uma float: ");
						float f = Teclado.getUmFloat();
						System.out.println("Foi digitado: "+f);
						break;
						
					case 'g':
						System.out.println("Digite o valor para uma double: ");
						double d = Teclado.getUmShort();
						System.out.println("Foi digitado: "+d);
						break;
						
					case 'h':
						System.out.println("Digite o valor para uma char: ");
						char c  = Teclado.getUmChar();
						System.out.println("Foi digitado: "+c);
						break;
						
					case 'i':
						System.out.println("Digite o valor para uma boolean: ");
						boolean boo = Teclado.getUmBoolean();
						System.out.println("Foi digitado: "+boo);
						break;
						
					case 'j':
						break;
						
					default:
						System.err.println("Opção inválida! Tente novamente.....\n");
						
						
				}
			} catch (Exception erro) 
			{
				System.err.println(erro.getMessage());
			}
		}
		while(opcao!='j');
	}

}
