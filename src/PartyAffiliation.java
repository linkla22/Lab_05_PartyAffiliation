import java.util.Scanner;

public class PartyAffiliation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your party affiliation D for Democrat, R for Republican, or I for Independent:  ");



        char choice = scanner.next().charAt(0);
        scanner.close();


        if (choice == 'D') {
            System.out.println("You get a Democratic Donkey.");
        } else if (choice == 'R') {
            System.out.println("You get a Republican Elephant.");
        } else if (choice == 'I') {
            System.out.println("You get an Independent Person.");
        } else {
            System.out.println("Invalid input, please select one of the 3 issued.");
        }
    }
}

