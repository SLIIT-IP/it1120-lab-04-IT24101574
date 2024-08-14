import java.util.Scanner;

public class IT24101574Lab4Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

	double examMarks, labMarks, examPercentage, labPercentage, finalMark;
       
        System.out.print("Enter exam marks (out of 100): ");
        examMarks = scanner.nextDouble();

        if (examMarks < 0 || examMarks > 100) {
            System.out.println("Invalid input for exam marks. Terminating program.");
	    System.exit(0); 
        }

        System.out.print("Enter lab submission marks (out of 100): ");
        labMarks = scanner.nextDouble();
       
        if (labMarks < 0 || labMarks > 100) {
            System.out.print("Invalid input for lab submission marks. Terminating the program.");
            System.exit(0);
        }


        System.out.print("Please enter the percentage given for the exam: ");
        examPercentage = scanner.nextDouble();

        System.out.print("Please enter the percentage given for the lab submission: ");
        labPercentage = scanner.nextDouble();

        if (examPercentage + labPercentage != 100) {
            System.out.println("Percentages must add up to 100. Terminating program.");
            System.exit(0);            
        }

    
        finalMark = (examMarks * examPercentage / 100) + (labMarks * labPercentage / 100);

       
        System.out.println("Final exam mark: " + finalMark);
    }
}
