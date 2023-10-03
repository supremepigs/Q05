package asdf;
import java.util.Scanner;

public class favoritedayofweek {
	public favoritedayofweek() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("What is your favorite day of the week? ");
		String favoriteDay = scanner.nextLine();
		
		System.out.println("Your favorite day of the week is: " + favoriteDay);
		System.out.println("Have a great " + favoriteDay + "!");
		
		scanner.close();
	}

}
