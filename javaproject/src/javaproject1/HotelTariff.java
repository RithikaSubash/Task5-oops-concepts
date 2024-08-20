package javaproject1;
import java.util.Scanner;

public class HotelTariff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the month number (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter the room rent per day: ");
        float roomRentPerDay = scanner.nextFloat();

        System.out.print("Enter the number of days stayed: ");
        int numberOfDays = scanner.nextInt();

        float totalRent = roomRentPerDay * numberOfDays;

        boolean isPeakSeason;
        switch (month) {
            case 4: 
            case 5: 
            case 6: 
            case 11:
            case 12: 
                isPeakSeason = true;
                break;
            default:
                isPeakSeason = false;
                break;
        }

        if (isPeakSeason) {
            totalRent *= 1.20;
        }

        System.out.printf("Hotel tariff to be paid: %.2f%n", totalRent);

        scanner.close();
    }
}
