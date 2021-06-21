package ch1;

public class Main 
{

	public static void main(String[] args) 
	{
		Main main = new Main();
		System.out.println(main.valueOf(true));

	}
	
	public static Boolean valueOf(boolean b)
	{
		return b ? Boolean.TRUE : Boolean.FALSE;
	}

}
