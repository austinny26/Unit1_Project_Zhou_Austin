import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Scanner setup and bill information entering
        Scanner s = new Scanner(System.in);
        System.out.println("Tip Calculator");
        System.out.println("----------------");
        System.out.println("Enter the bill($): ");
        String billString = s.nextLine();
        double bill = Double.parseDouble(billString);
        String billRounded = String.format("%.2f",bill);
        double billConverted = Double.parseDouble(billRounded);
        System.out.println("----------------");

        //Tip amount entering
        System.out.println("Enter how much tip (without percent): ");
        String tipString = s.nextLine();
        double tip = Double.parseDouble(tipString);
        String tipRounded = String.format("%.2f",tip);
        double tipConverted = Double.parseDouble(tipRounded);
        System.out.println("----------------");

        //Amount of people paying
        System.out.println("Enter how many people are paying: ");
        String amountOfPeople = s.nextLine();
        int amountOfPeopleConverted = Integer.parseInt(amountOfPeople);
        System.out.println("----------------");

        //Computer Calculations
        double tipInPercent = (tipConverted * 0.01);
        double finalTip = (tipInPercent * billConverted);
        double finalBillTotal = (finalTip + billConverted);
        double totalPaidPerPerson = (finalBillTotal / amountOfPeopleConverted);
        double tipPerPerson = (finalTip / amountOfPeopleConverted);

        //Final calculator output
        System.out.println("Your total bill is: $" + String.format("%.2f",finalBillTotal));
        System.out.println("---------------------------");
        System.out.println("The tip amount is: $" + String.format("%.2f",finalTip));
        System.out.println("---------------------------");

        //This part is to add to the output when there are more than 1 person paying.
        if (amountOfPeopleConverted > 1) {
            System.out.println("Each person will pay: $" + String.format("%.2f",totalPaidPerPerson));
            System.out.println("The tip per person is: $" + String.format("%.2f",tipPerPerson));
            System.out.println("---------------------------");
        }
        s.close();
    }
}