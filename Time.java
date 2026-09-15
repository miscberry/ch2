public class Time {
	public static void main(String[] args) {
		int hours = 11;
		int minutes = 59;
		int seconds = ((hours * 60) + minutes) * 60;
		System.out.print("It has been " + seconds + " seconds since midnight.");

	}
}
