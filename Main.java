import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String name = input.nextLine();

        System.out.print("Enter customer age: ");
        int age = input.nextInt();

        System.out.print("Enter meal price: ");
        double mealPrice = input.nextDouble();

        System.out.print("Enter number of drinks: ");
        int drinks = input.nextInt();

        System.out.print("Is the customer a student? ");
        boolean isStudent = input.nextBoolean();

        System.out.print("Enter service rating (1-5): ");
        int rating = input.nextInt();

        if (rating < 1 || rating > 5) {
            System.out.println("Invalid rating!");
        } else {

            double drinkPrice = 15.50;
            double drinksCost = drinks * drinkPrice;

            double subtotal = mealPrice + drinksCost;

            double discount = 0;

            if (isStudent) {
                discount = subtotal * 0.10;
            }

            if (age >= 60 && subtotal * 0.05 > discount) {
                discount = subtotal * 0.05;
            }

            double discountedTotal = subtotal - discount;

            double tip = 0;

            if (rating == 4 || rating == 5) {
                tip = discountedTotal * 0.10;
            }

            double finalBill = discountedTotal + tip;

            int wholeAmount = (int) finalBill;

            System.out.println("\n===== SMART RESTAURANT =====");
            System.out.println("Customer: " + name);
            System.out.println("Meal: $" + mealPrice);
            System.out.println("Drinks: $" + drinksCost);
            System.out.println("Discount: $" + discount);
            System.out.println("Tip: $" + tip);
            System.out.println("Final bill: $" + finalBill);
            System.out.println("Whole amount: $" + wholeAmount);
        }

        input.close();
    }
}
