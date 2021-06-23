package ch2_01;

public class Test 
{

	public static void main(String[] args) 
	{
		//Services.registerDefaultProvider(DEFAULT_PROVIDER);

	}
	
	private Provider DEFAULT_PROVIDER = new Provider() 
	{
		
		@Override
		public Service newService() 
		{
			return new Service() 
			{
				
			};
		}
	};

}
