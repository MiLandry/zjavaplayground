package prompts;

import java.util.HashSet;
import java.util.Set;



public class RuthAaron {
	
	public static void isRuthAaronPair(int x, int y)
	{
		Set<Integer> xPrimes = PrimeFactors.GetPrimeFactors(x);
		Set<Integer> yPrimes = PrimeFactors.GetPrimeFactors(y);
		
		int xFactorSum = 0;
		int yFactorSum = 0;
		
		for (Integer i: xPrimes)
		{
			xFactorSum += i;
		}
		for (Integer j: yPrimes)
		{
			yFactorSum += j;
		}
		String validness = (xFactorSum==yFactorSum)?"Valid":"NOT VALID";
		String result = String.format("(%s,%s) %s", x, y, validness);
		System.out.println(result);
		
		
		
	}

}
