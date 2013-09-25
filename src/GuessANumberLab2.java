import java.util.Scanner;


public class GuessANumberLab2 {

	public static void main(String[] args)
	{
	
		int x = 0 + (int) ( Math.random() * 10 );
		Scanner input = new Scanner( System.in );

		//variables

		System.out.println("Guess a number from 0-9: ");

		int y = input.nextInt();

		if (x == y)
		{System.out.println("You are right!");}
		else {
			if (x < y )
			{System.out.println("Too high guess a lower number");}
			else {
				if (x > y)
				{System.out.println("Too low guess another number");}

		}
	}
}
}
