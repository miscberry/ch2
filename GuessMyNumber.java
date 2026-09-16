import java.util.Scanner;
import java.util.Random;

public class GuessMyNumber {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random random = new Random();
        int r = random.nextInt(100) + 1;
		
		System.out.print("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is?\nType a number: ");
		int n = in.nextInt();
		System.out.print("Your guess is: " + n + "\nThe number I was thinking of is: " + r + "\nYou were off by: " + Math.abs(n-r));
	}
}
