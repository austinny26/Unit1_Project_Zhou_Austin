import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scanner setup and bill information entering
        Scanner s = new Scanner(System.in);
        System.out.println("Tip Calculator");
        System.out.println("----------------");
        System.out.println("Enter the bill($): ");
        String bill = s.nextLine();
        double billConverted = Double.parseDouble(bill);
        System.out.println("----------------");
        //Tip amount entering
        System.out.println("Enter how much tip (without percent): ");
        String tip = s.nextLine();
        double tipConverted = Double.parseDouble(tip);
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
        System.out.println("Your total bill is: $" + finalBillTotal);
        System.out.println("---------------------------");
        System.out.println("The tip amount is: $" + finalTip);
        System.out.println("---------------------------");
        //This part is to add to the output when there are more than 1 person paying.
        if (amountOfPeopleConverted > 1) {
            System.out.println("Each person will pay: $" + totalPaidPerPerson);
            System.out.println("The tip per person is: $" + tipPerPerson);
            System.out.println("---------------------------");
        }
        s.close();
    }
}