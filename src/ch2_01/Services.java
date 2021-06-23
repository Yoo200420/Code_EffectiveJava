package ch2_01;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Services 
{
	private Services(){}
	
	private static final Map<String, Provider> providers
	= new ConcurrentHashMap<String, Provider>();
	
	public static final String DEFAULT_PROVIDER_NAME = "<def>";
	
	public static void registerDefaultProvider(Provider provider) 
	{
		registerProvider(DEFAULT_PROVIDER_NAME, provider);
	}
	
	public static void registerProvider(String name, Provider provider) 
	{
		providers.put(name, provider);
	}
	
	public static Service newIntance()
	{
		return newIntance(DEFAULT_PROVIDER_NAME);
	}
	
	public static Service newIntance(String name)
	{
		Provider provider = providers.get(name);
		if(provider==null) throw new IllegalArgumentException("No Provider in Map:"+name);
		
		return provider.newService();
	}

}
