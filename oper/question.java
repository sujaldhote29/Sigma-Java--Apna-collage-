import java.util.Scanner;

public class question {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Given information
        int totalStudents = 90;

        double percentageIA = 50.0;
        int boysWithGradeIA = 20;

        // Calculate the total number of students with grade 'A'
        int totalGradeA = (int) ((percentageIA / 100) * totalStudents);

        // Calculate the total number of girls with grade 'A'
        int girlsWithGradeA = totalGradeA - boysWithGradeIA;

        // Display the result
        System.out.println("Total number of girls with grade 'A': " + girlsWithGradeA);

        scanner.close();
    }
}
