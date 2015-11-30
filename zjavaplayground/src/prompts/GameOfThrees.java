package prompts;

public class GameOfThrees {
	public static void gameOfThrees(int i)
	{
		while (i!=1)
		{
			int action = 0;
			int current = i;
			if ((i+1)%3==0)
			{
				action = 1;
				i++;
			}
			else if ((i-1)%3==0)
			{
				action = -1;
				i--;
			}
			System.out.println(current + " " + action);
				i= i/3;
		}
	}

}
