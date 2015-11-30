package prompts;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Tetris {
	
	static final String[] TETRISBLOCKS = {"O", "I", "S", "Z", "L", "J", "T"}; 
	static List<String> bag = new ArrayList<String>();
	static Random r = new Random();
	
	public static String get50TetrisPieces()
	{
		String result = "";
		
		
		for (int i = 50; i >0 ; i--)
		{
			result += getNextPiece();
			
		}
		
		return result;
		
		
	}

	private static String getNextPiece() {
		
		if (bag.isEmpty())
		{
			//fill the bag
		    for (int i = 0; i < TETRISBLOCKS.length; i++)
		    {
		        bag.add(TETRISBLOCKS[i]);
		    }

		}
		
		
		return bag.remove(r.nextInt(bag.size()));
	}

}
