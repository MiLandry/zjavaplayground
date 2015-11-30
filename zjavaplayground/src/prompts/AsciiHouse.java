package prompts;

public class AsciiHouse {
	
	public static void PrintAsciiHouse(int numberOfLines, String bluePrint)
	{
		String[] levels = bluePrint.split("\n");
	    for (int i = 0; i < levels.length; i++)
	    {
	    	HouseLevel hl = new HouseLevel(levels[i]);
	    	System.out.println(hl.getPicture());
	    }

	}

}
