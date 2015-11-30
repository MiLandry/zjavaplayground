package prompts;

import java.util.HashMap;
import java.util.Map;

public class ChessBoard {
	private String FENrepresentation;
	
	//a hashmap mapping characters to chesspieces
	static Map<Character, ChessPiece> map = new HashMap<Character, ChessPiece>();
	static
	{
		map.put('K',ChessPiece.WHITEKING);
		map.put('Q',ChessPiece.WHITEQUEEN);
		map.put('S',ChessPiece.WHITEROOK);
		map.put('B',ChessPiece.WHITEBISHOP);
		map.put('N',ChessPiece.WHITEKNIGHT);
		map.put('P',ChessPiece.WHITEPAWN);
		
		map.put('k',ChessPiece.BLACKKING);
		map.put('q',ChessPiece.BLACKQUEEN);
		map.put('s',ChessPiece.BLACKROOK);
		map.put('b',ChessPiece.BLACKBISHOP);
		map.put('n',ChessPiece.BLACKKNIGHT);
		map.put('p',ChessPiece.BLACKPAWN);		
	
	}
	

	public String getFENrepresentation() {
		return FENrepresentation;
	}

	public void setFENrepresentation(String fENrepresentation) {
		FENrepresentation = fENrepresentation;
	}

	public ChessBoard() {
		super();
		FENrepresentation = "snbqkbns/pppppppp/8/8/8/8/PPPPPPPP/SNBQKBNS";
	}
	
	public void draw()
	{
		StringBuilder output = new StringBuilder();
		
		for( int i = 0; i<= FENrepresentation.length()-1; i++)
		{
		  char c = FENrepresentation.charAt(i);
		  
		  if (c=='/') output.append("\n");
//		  else if (char is number) add blanks
		  else if (Character.isDigit(c))
		  {
			  int spaces = Character.getNumericValue(c);
			  for (int j = 0; j < spaces; j++)
			  {
				  output.append('\u0020'); 
			  }
		  }
		  else
		  {
			  output.append(map.get(c).getUnicodeChar());
		  }
		}
		System.out.println(output);		  
	}
	
	
	public enum ChessPiece {
		WHITEKING('\u2654'),
		WHITEQUEEN('\u2655'),
		WHITEROOK('\u2656'),
		WHITEBISHOP('\u2657'),
		WHITEKNIGHT('\u2658'),
		WHITEPAWN('\u2659'),
		
		BLACKKING('\u265A'),
		BLACKQUEEN('\u265B'),
		BLACKROOK('\u265C'),
		BLACKBISHOP('\u265D'),
		BLACKKNIGHT('\u265E'),
		BLACKPAWN('\u265F');
		
		private char unicodeChar;
		
		private ChessPiece(char unicodeChar)
		{
			this.unicodeChar = unicodeChar;
		}

		public char getUnicodeChar() {
			return unicodeChar;
		}
		
	}
	
	public static boolean isInteger(String s) {
	    return isInteger(s,10); //because base 10
	}

	public static boolean isInteger(String s, int radix) {
	    if(s.isEmpty()) return false;
	    for(int i = 0; i < s.length(); i++) {
	        if(i == 0 && s.charAt(i) == '-') {
	            if(s.length() == 1) return false;
	            else continue;
	        }
	        if(Character.digit(s.charAt(i),radix) < 0) return false;
	    }
	    return true;
	}

}
