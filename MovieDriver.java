
	/*
	 * Class: CMSC203 CNR 46622 
	 * Instructor: Prof.Grigoriy A. Grinberg
	 * Description: (this lab introduce writing driver class for
	 * 				 a given file called Movie.java)
	 * Due: 07/03/2022
	 * Platform/compiler: Eclipse IDE
	 * I pledge that I have completed the programming assignment independently.
	   I have not copied the code from a student or any source.
	   I have not given my code to any student.
	   Print your Name here: ABAYNEH MENGISTU
	*/

	import java.util.Scanner;

	public class MovieDriver
	{

		public static void main(String[] args)
		
		{

			String input = null;
			do
			{
		
			Scanner keyboard = new Scanner(System.in);
			Movie movie = new Movie();
			System.out.println("Enter the title of the movie: ");
			String dTitle = keyboard.nextLine();
			movie.setTitle(dTitle);
			
			System.out.println("Enter the movie's rating: ");
			String dRating = keyboard.nextLine();
			movie.setRating(dRating);
			
			System.out.println("Enter the number of ticket sold (unnamed) theater: ");
			int dSoldTickets = keyboard.nextInt();
			movie.setSoldTickets(dSoldTickets);
			
			System.out.println( movie.toString());
			System.out.println("Do you want to enter another? ( y or n)");
			Scanner scan = new Scanner(System.in);
			input = scan.nextLine();
			}
			while (input.equalsIgnoreCase("y"));
			{

			System.out.println("Goodbye");
			}
		}
	}

	



