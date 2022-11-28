import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int flightDistance = askAndGetIntValue("Enter the distance in km: ");
        int customerAge = askAndGetIntValue("Enter your age: ");
        int tickedTypeNumber = askAndGetIntValue("Enter the ticket type ( 1 => One way, 2 => Round Trip) : ");

        if(flightDistance <= 0 || customerAge <= 0 || !(tickedTypeNumber == 1 || tickedTypeNumber==2)){
            System.out.println("You entered wrong data.");
        } else {
            double ticketPrice = calculateFlightTicketPrice(flightDistance, customerAge, tickedTypeNumber);
            System.out.println("Total price : " + ticketPrice + " TL");
        }
    }

    public static int askAndGetIntValue(String question) {
        System.out.print(question);
        return input.nextInt();
    }

    public static double calculateFlightTicketPrice(int flightDistance, int customerAge, int ticketTypeNumber) {
        double PRICE_PER_KM = 0.10,
                childDiscountRate = 0.5,
                youthDiscountRate = 0.1,
                elderDiscountRate = 0.3,
                roundTripDiscountRate = 0.2,
                ageDiscount = 0,
                ticketTypeDiscount,
                ticketPrice;

        double normalPrice = flightDistance * PRICE_PER_KM;

        if(customerAge <12 ) {
            ageDiscount = normalPrice * childDiscountRate;
        } else if(customerAge < 24 ) {
            ageDiscount = normalPrice * youthDiscountRate;
        } else if(customerAge >= 65) {
            ageDiscount = normalPrice * elderDiscountRate;
        }

        ticketPrice = normalPrice - ageDiscount;

        if(ticketTypeNumber == 2) {
            ticketTypeDiscount = ticketPrice * roundTripDiscountRate;
            ticketPrice -= ticketTypeDiscount;
            return 2 * ticketPrice;
        }

        return ticketPrice;
    }
}
