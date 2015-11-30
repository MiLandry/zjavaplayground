package prompts;

import java.security.InvalidParameterException;
import java.util.Random;

public class ConsonantsVowels {
	/*
	 * You were hired to create words for a new language.
	 *  However, your boss wants these words to 
	 *  follow a strict pattern of consonants and vowels.
	 *   You are bad at creating words by yourself, 
	 *   so you decide it would be best to randomly
	 *    generate them.
Your task is to create a program that generates
 a random word given a pattern of consonants 
 (c) and vowels (v).

CcvV > ytie
	 */
	
	static final String consonants = "bcdfghjklmnpqrstvwxyz";
	static final String vowels = "aeiou";
	
	public static String wordGenerator(String input)
	{
		String result = "";
		for( int i = 0; i<= input.length()-1; i++)
		{
			String character = Character.toString(input.charAt(i)).toLowerCase();
		  //dostuff with Character.toString(str.charAt(i))
			if (character.equals("c"))
			{
				result += randomCharacterFromString(consonants);	
			}
			else if (character.equals("v"))
			{
				result += randomCharacterFromString(vowels);
			}
			else
			{
				throw new InvalidParameterException("invalid input");
			}
		}
		
		return result;
	
	}

	/**
	 * Returns a random character from the given string
	 * @param str
	 * @return
	 */
	private static String randomCharacterFromString(String str) {
		Random r = new Random();
		int l = str.length();
		int x = r.nextInt(l);
		return str.substring(x, x + 1);
	}


}
