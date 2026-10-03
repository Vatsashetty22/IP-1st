import java.util.Scanner;

public class ElectricityBillCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String name = sc.nextLine();

        System.out.print("Enter units consumed: ");
        int units = sc.nextInt();

        double bill = 0;

        // Calculate bill based on units consumed
        if (units <= 100) {
            bill = units * 1.50;
        } 
        else if (units <= 200) {
            bill = (100 * 1.50) + ((units - 100) * 2.50);
        } 
        else if (units <= 500) {
            bill = (100 * 1.50) + (100 * 2.50) 
                    + ((units - 200) * 4.00);
        } 
        else {
            bill = (100 * 1.50) + (100 * 2.50) 
                    + (300 * 4.00) 
                    + ((units - 500) * 6.00);
        }

        // Fixed charge
        double fixedCharge = 50;

        // Total bill
        double totalBill = bill + fixedCharge;

        System.out.println("\n----- ELECTRICITY BILL -----");
        System.out.println("Customer Name : " + name);
        System.out.println("Units Consumed: " + units);
        System.out.println("Energy Charge : Rs. " + bill);
        System.out.println("Fixed Charge  : Rs. " + fixedCharge);
        System.out.println("Total Bill    : Rs. " + totalBill);

        sc.close();
    }
}