import java.util.Scanner;
public class Students {
    public static String name;
    public static String status;
    public static String major;
    public static Double gpa;

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a students name: ");
        name = userInput.nextLine();

        System.out.println("Enter a status (freshman, sophomore, junior, senior): ");
        status = userInput.nextLine();

        System.out.println("Enter a major: ");
        major = userInput.nextLine();

        System.out.println("Enter a gpa: ");
        gpa = userInput.nextDouble();

        if (status.equals("freshman") && (gpa >= 3.5 || major.equals("computer science"))) {
            System.out.print(name + " qualifies for a $1000 scholarship");
        }
        else if (status.equals("sophomore") && (gpa >= 3.0 && major.equals("computer science"))) {
            System.out.print(name + " qualifies for a $1000 scholarship!");
        }
        else if (status.equals("junior") && gpa >= 3.5) {
            System.out.print(name + " qualifies for a $1000 scholarship!");
        }
        else if (status.equals("sophomore") && gpa == 4.0) {
            System.out.print(name + " qualifies for a $5000 scholarship!");
        }
        else if (status.equals("junior") && (gpa >= 3.0 && major.equals("computer science"))) {
            System.out.print(name + " qualifies for a $5000 scholarship!");
        }
        else if (status.equals("senior") && (gpa == 4.0 || major.equals("computer science"))) {
            System.out.print(name + " qualifies for a $10000 scholarship!");
        }
        else {
            System.out.println("I'm sorry " + name + ", you do not qualify for any scholarships at this time.");
        }
    }
}