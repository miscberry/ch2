import java.util.Scanner;

public class ConvertTime {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Hours: ");
		int h = in.nextInt();
		System.out.print("Minutes: ");
		int m = in.nextInt();
		System.out.print("Seconds: ");
		int s = in.nextInt();
		System.out.println(((h*60)+m)*60+s + " seconds = " + h + " hours, " + m + " minutes, and " + s + " seconds");
	}
}    
