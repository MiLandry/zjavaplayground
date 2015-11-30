package prompts;

import java.util.HashMap;
import java.util.Map;

public class Fibo {
	
	private static Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	static
	{
		map.put(1, 1);
		map.put(2, 1);
	}
	
	public static int fibo(int input)
	{
		if (map.containsKey(input))
		{
		  return map.get(input);
		}
		
		for (int i = 3; i < input + 1; i++)
		{
			if (map.containsKey(i))
			{
			  break;
			}
			map.put(i, map.get(i-1) + map.get(i-2));
		}
		return map.get(input);
	}
}
