import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        boolean validInput = false;
        double measurement = 0;

        do {
            System.out.println("Hello - please input a meter measurement to convert.");
            if (scan.hasNextDouble()) {
                measurement = scan.nextDouble();
                if (measurement > 0) {
                   validInput = true;
                } else {
                    System.out.println("You have inputted an invalid response. Please try again.");
                    scan.nextLine();
                }
            } else {
                System.out.println("You have inputted an invalid response. Please try again.");
                scan.nextLine();
            }
        } while (!validInput);

        System.out.printf("Meters: %.2f \nMiles: %.2f \nFeet: %.2f \nInches: %.2f", measurement, measurement*0.00062137,measurement*3.28084, measurement*39.37008);

    }
}