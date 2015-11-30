package zjavaplayground;

import prompts.ChessBoard;



public class Main {
	public static void main(String args[]) throws Exception
	{
	      Foo in = new Foo();
	      in.setBool(false);
	        truifier(in);
	        System.out.println("in is " + in.isBool());
	    }

	    public static void truifier (Foo bool) {
	        if (bool.isBool() == false) {
	            bool.setBool(true);
	        }
	        System.out.println("bool is " + bool.isBool());
	    }

	}
	


