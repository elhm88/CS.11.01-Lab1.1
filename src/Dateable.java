import java.util.*;

public class Dateable {

    public static void main(String[] args) {
        int age;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");

        age = scanner.nextInt();

        System.out.print(age + "-years olds should date somebody who is at least " + ((age/2)+7) + " years old.");

        System.out.print("\n\nCredit: Thanks to Jim Cohoon at The University of Virginia");

    }
}
