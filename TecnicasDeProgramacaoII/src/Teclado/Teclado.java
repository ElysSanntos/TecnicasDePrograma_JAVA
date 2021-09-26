package Teclado;

import java.io.*;

public class Teclado 
{
	private static BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
	public static String getUmString()
	{
		String ret = null;
		try 
		{
			ret = teclado.readLine();
		} catch (IOException erro) {}//Sei que n�o terei erro 
		
		 return ret;
	}
		//
	
	public static byte getUmByte() throws Exception
	{
		byte ret = (byte)0;
		
		try 
		{
			ret = Byte.parseByte(teclado.readLine());
			
		} catch (IOException erro) {}//Sei que n�o vai dar erro
		  catch(NumberFormatException erro)
		{
			  throw new Exception("Byte inv�lido!");
		}
		return ret;
	}
	public static short getUmShort() throws Exception
	{
		short ret=(short)0;
		try 
		{
			ret = Short.parseShort(teclado.readLine());
			
		} catch (IOException erro) {}//Sei que n�o vai dar erro
		  catch(NumberFormatException erro)
		{
			  throw new Exception("Short inv�lido!");
		}
		return ret;
	}
	public static int getUmInt() throws Exception
	{
		int ret = 0;
		try 
		{
			ret = Integer.parseInt(teclado.readLine());
		} catch (IOException erro) {}//Sei que n�o dar� erro
		catch(NumberFormatException erro)
		{
			throw new Exception ("Int inv�lido!");
		}
		return ret;
	}
	public static long getUmLong() throws Exception
	{
		long ret = 0L;
		
		try 
		{
			ret = Long.parseLong(teclado.readLine());
		} catch (IOException erro) {}//Sei que n�o dar� erro
		  catch(NumberFormatException erro)
		{
			  throw new Exception("Long Inv�lido!");
		}
		return ret;
	}
	
	public static float getUmFloat() throws Exception
	{
		float ret = 0.0F;
		try 
		{
			ret = Float.parseFloat(teclado.readLine());
			
		} catch (IOException erro) {}//Sei que n�o dar� erro
		  catch(NumberFormatException erro)
		{
			  throw new Exception("Float inv�lido!");
		}
		return ret;
	}
	
	public static double getUmDouble() throws Exception
	{
		double ret = 0.0;
		
		try 
		{
			ret = Double.parseDouble(teclado.readLine());
			
		} catch (IOException erro) {}//Sei que n�o dar� erro
		  catch(NumberFormatException erro)
		{
			  throw new Exception("Double Inv�lido!");
		}
		
		return ret;
	}
	
	public static char getUmChar() throws Exception
	{
		char ret = ' ';
		
		try 
		{
			
			String str = teclado.readLine();
			
			if (str ==null)
				throw new Exception("Char inv�lido!");
			if (str.length() !=1)
				throw new Exception ("Char inv�lido!");
			
			ret = str.charAt(0);
			
		} catch (IOException erro) {}//Sei que n�o dar� erro
		
		return ret;
	}
	
	public static boolean getUmBoolean () throws Exception
	{
		boolean ret = false;
		
		try 
		{
			String str = teclado.readLine();
			
			if (str ==null)
				throw new Exception("Boolean inv�lido!");
			if(!str.equals("true") && !str.equals("False"))
				throw new Exception("Boolean inv�lido");
			
			return ret = Boolean.parseBoolean(str);
		} catch (Exception e) {}//N�o dar� erro
		
		return ret;
	}
	 
	
}
