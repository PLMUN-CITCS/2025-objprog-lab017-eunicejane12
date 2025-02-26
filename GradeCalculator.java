import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        // Get the student's score from the user
        int score = getStudentScore();

        // Determine the grade based on the score
        String grade = calculateGrade(score);

        // Display the calculated grade
        System.out.println("Your Grade is: " + grade);
    }

    // Method to get the student's score from the user
    public static int getStudentScore() {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter their score
        System.out.print("Enter your score: ");
        int score = scanner.nextInt();

        // Optional: Validate if score is within a valid range (0-100)
        if (score < 0 || score > 100) {
            System.out.println("Invalid score! Please enter a number between 0 and 100.");
            return getStudentScore(); // Recursively ask again if the input is invalid
        }

        return score;
    }

    // Method to calculate the letter grade based on the score
    public static String calculateGrade(int score) {
        String grade;

        // Use if-else statements to determine the grade
        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        return grade;
    }
}
