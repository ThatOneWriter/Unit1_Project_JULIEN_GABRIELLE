import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);

        System.out.println("-----------------------------------------------------------------");
        System.out.println("| Note! Do not use any symbols when inputting data! (no $ or %) |");
        System.out.println("-----------------------------------------------------------------");
        System.out.println();

        System.out.print("Enter your Bill($): ");
        String total_bill = s.nextLine();
        double bill = Double.parseDouble(total_bill);

        System.out.print("Tip Percent: ");
        String tip_percent = s.nextLine();
        double tip = Integer.parseInt(tip_percent);

        System.out.print("Number of People: ");
        String people = s.nextLine();
        int number = Integer.parseInt(people);
        System.out.println();

        double tip_amount = (tip/100) * bill;
        double bill_cost = bill + tip_amount;
        double tip_per_person = tip_amount/number;
        double bill_per_person = bill_cost/number;


        System.out.println("-----------------------------");
        System.out.println("| Total Tip Amount: $" + tip_amount + "|");
        System.out.println("-----------------------------");
        System.out.println("| Total Bill Cost: $" + bill_cost + "|");
        System.out.println("-----------------------------");
        System.out.println("| Tip per person: $" + tip_per_person + "|");
        System.out.println("-----------------------------");
        System.out.println("| Total bill per person: $" + bill_per_person + "|");
        System.out.println("-----------------------------");
    }
}
