import java.util.*;
public class Pages {

    public static void main(String[] args) {
        int age;

        System.out.print("Enter your age: ");
        Scanner scanner = new Scanner(System.in);

        age = scanner.nextInt();

        System.out.print(age + "-year olds should read at least " + (100-age) + " pages before giving up on a book.");

        System.out.print("\n\nCredit: Thanks to Jim Cohoon at The University of Virginia");

    }
}
