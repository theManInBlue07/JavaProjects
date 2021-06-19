package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        MilesPerHour(1.5);
        MilesPerHour(10.25);
        MilesPerHour(-5.6);
        MilesPerHour(25.42);
        MilesPerHour(75.114);
        MilesPerHour(-99.2654789);

    }

    public static int MilesPerHour(double KilometerPerHour) {
        if (KilometerPerHour < 0) {
            return -1;
        }
        long toMilesPerHour = Math.round(KilometerPerHour / 1.609);
        // Math.round is used to conver t our answer to the next possible integer.
        System.out.println("The Distance in Miles per hour is ," + toMilesPerHour);
        return (int) toMilesPerHour;


    }
}