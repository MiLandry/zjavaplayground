package prompts;

import java.util.HashSet;
import java.util.Set;


public class PrimeFactors {
	

  /**returns the prime factors of the input as a set.  1 is not included.
 * @param an integer
 * @return a HashSet contain the prime factors of the input.
 */
public static Set<Integer> GetPrimeFactors(int n) {

	Set<Integer> factors = new HashSet<Integer>();
    for (int i = 2; i <= n / i; i++) {
      while (n % i == 0) {
        factors.add(i);
        n /= i;
      }
    }
    if (n > 1) {
      factors.add(n);
    }
    return factors;
  }
  
  
}