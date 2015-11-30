package prompts;

public class GameOfThreesFast {
	public static void gameOfThrees (int i)
	{
		while (i !=1)
		{
			int current = i;
			int action = 0;
			if ((i + 1)%3==0)
			{
				action ++;
				i ++;
			}
			else if ((i - 1) % 3 == 0)
			{
				action --;
				i--;
			}
			System.out.println(current);
			i = i/3;
			
		}
		System.out.println(i);
	}

}
