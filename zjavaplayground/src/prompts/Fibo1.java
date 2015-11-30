package prompts;

import java.util.HashMap;
import java.util.Map;

public class Fibo1 {
	
	static Map<Integer, Integer> map = 
			new HashMap<Integer, Integer>();
	
	public static int fibo(int x)
	{
		if (x < 1) throw new IllegalArgumentException();
		if (x==1)
			{
			map.put(1, 1);
			return 1;
			}
		if (x==2)
		{
		map.put(2, 1);
		return 1;
		}
	
		int result = fibo(x-1) + fibo(x-2); 
		map.put(x, result);
		return result;
			
	}

}
