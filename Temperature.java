import java.util.Scanner;

public class Temperature {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Celsius temperature: ");
		double fah = in.nextDouble();
		fah = fah * 1.8 + 32;
		System.out.println("It is " + (fah - fah%1) + " degrees Fahrenheit.");
	}
}    
