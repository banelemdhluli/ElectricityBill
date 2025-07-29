import java.util.Scanner;

public class ElectricityBill {

    //Declare units as a class level variable
    //Which makes it  accessible in both main()and myCalculation()
    static double units;
    private static  double myCalculation() {

        double rate;
        double surcharge;
        double totalBill;

    if (units <= 50) {
            rate = 2.5;
            surcharge = 5;
            return totalBill = (units * rate)+ surcharge;

        } else if (units <= 100){
            rate = 5;
            surcharge = 10;
            return  totalBill = (units * rate)+ surcharge;

        }else if (units <= 150){
               rate = 10;
               surcharge = 15;
               return totalBill = (units * rate)+ surcharge;
        }else{
             rate = 15;
             surcharge = 20;
        return totalBill = (units * rate)+ surcharge;
    }


    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // create a Scanner object

        String name;
        String city;


        // Infinite loop - Consumer name
        while (true) {
            System.out.print("Enter consumer name: ");
             name = input.nextLine();

            // Input Validation
            if (name.trim().isEmpty() || !name.matches("[a-zA-Z ]+")) {
                System.out.println("Only letters allowed");
                System.out.println();

            } else {
                break;
            }
        }

        // Infinite loop - City name
        while (true) {
            System.out.print("Enter city name: ");
             city = input.nextLine();

            // Input Validation
            if (city.trim().isEmpty() || !city.matches("[a-zA-Z ]+")) {
                System.out.println("Only letters allowed");
                System.out.println();

            } else {
                break;
            }
        }
        // Infinite Loop - Units input with try-catch
        while (true) {
            System.out.print("Enter units: ");
            String unitEntered = input.nextLine();

            // Try catch for number exception
            try {
                units = Integer.parseInt(unitEntered); // Convert string to int
                if (units < 0) {
                    System.out.println("Units cannot be negative");
                    System.out.println();
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input please enter a number");
                System.out.println();
            }
        }

        // Call calculation method and print total
        // Note that myCalculation() is now stored in variable total
        double total = myCalculation();

        System.out.println("\n--- Electricity Bill ---");
        System.out.println("Consumer Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Units: " + units);
        System.out.println("Total Bill: R" + total);
            }
        }






