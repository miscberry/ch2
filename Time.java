public class Time {

    public static void main(String[] args) {
        int hour = 14;
        int minute = 30;
        int second = 45;

        int secondsSinceMidnight = hour * 3600 + minute * 60 + second;
        System.out.println("Seconds since midnight: " + secondsSinceMidnight);

        int secondsInDay = 24 * 3600;
        int secondsRemaining = secondsInDay - secondsSinceMidnight;
        System.out.println("Seconds remaining in the day: " + secondsRemaining);

        double percentPassed = secondsSinceMidnight * 100.0 / secondsInDay;
        System.out.println("Percent of the day that has passed: " + percentPassed);

        int endHour = 15;
        int endMinute = 12;
        int endSecond = 5;

        int endSeconds = endHour * 3600 + endMinute * 60 + endSecond;
        int elapsed = endSeconds - secondsSinceMidnight;
        System.out.println("Seconds spent on this exercise: " + elapsed);
    }
}
