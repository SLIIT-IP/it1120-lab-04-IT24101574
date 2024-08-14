import java.util.Scanner;

public class IT24101574Lab4Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

	int number;
	String result;
        
        System.out.print("Enter a number: ");
        number = scanner.nextInt();


        result = (number > 0) ? "The number is: Positive" : (number < 0) ? "The number is: Negative" : "The number is: Zero";

        System.out.println(result);
    }
}

