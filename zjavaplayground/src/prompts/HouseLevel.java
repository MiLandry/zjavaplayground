package prompts;

public class HouseLevel {
	String picture;
	
	public HouseLevel(String bluePrint)
	{
		this.picture = getPictureFromBluePrint(bluePrint);
	}
	
	private String getPictureFromBluePrint(String bluePrint) {
		int blockCount = bluePrint.length();
		String topLine = "+";
		String middleLine = "|";
//		String bottomLine = "+";
		
		for (int i = 0; i < blockCount; i++)
		{
			topLine += "---+";
			middleLine += "   |";
		}
		
		return topLine + "\n" + middleLine + "\n" + topLine;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}


}
