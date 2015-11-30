package prompts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Typoglycemia {
	public static String scramble (String input)
	{
		String result ="";
		String[] array = input.split(" ");
	    for (int i = 0; i < array.length; i++)
	    {
	        String token = array[i];
	        
	        if (isWord(token) && token.length()>2)
	        {
	        	StringBuilder sb = new StringBuilder(token.substring(0, 1));
	        	String lastChar = token.substring(token.length()- 1);
	        	String middle = token.substring(1, token.length()-1);
	        	middle = scrambleWord(middle);
	        	sb.append(middle);
	        	sb.append(lastChar);
	        	token = sb.toString();
	        }
	        result += token + " ";

	    }
	    
	    return result.substring(0, result.length()-1);
	    
	    
		
	}

	private static boolean isWord(String token) {
		String re = "[a-zA-Z]+";
		if (token.matches(re)) return true;
		return false;
	}

	private static String scrambleWord(String word){
		List<Character> l = new ArrayList<>();
		for(char c :  word.toCharArray()) //for each char of the word selectioned, put it in a list
		    l.add(c); 
		Collections.shuffle(l); //shuffle the list

		StringBuilder sb = new StringBuilder(); //now rebuild the word
		for(char c : l)
		  sb.append(c);


		word = sb.toString();
		return word;
        
    }


}


