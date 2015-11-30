package prompts;

import java.util.HashMap;
import java.util.Map;

public class FiboIteratively {
	
	static Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	
	public static int Fibo(int x)
	{
		if (x<1) throw new IllegalArgumentException();
		
		if (map.containsKey(x))
		{
		  return map.get(x);

		}
		for (int i = 0; i < x + 1; i++)
		{
			if (map.containsKey(i))
			{
			  break;

			}
			if (x==1||x==2)
			{
				map.put(x, 1);
			}
			else
			{
				map.put(x, (map.get(x-1) + map.get(x-2)));
			}
			
		}
		return map.get(x);
			
	}

}
