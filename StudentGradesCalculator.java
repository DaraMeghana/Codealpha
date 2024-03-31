import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentGradesCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();

        System.out.println("Enter the number of students:");
        int numStudents = scanner.nextInt();

        // Input grades
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter grade for student " + (i + 1) + ":");
            int grade = scanner.nextInt();
            grades.add(grade);
        }

        // Calculate average
        double average = calculateAverage(grades);
        System.out.println("Average grade: " + average);

        // Find highest grade
        int highestGrade = findHighestGrade(grades);
        System.out.println("Highest grade: " + highestGrade);

        // Find lowest grade
        int lowestGrade = findLowestGrade(grades);
        System.out.println("Lowest grade: " + lowestGrade);
    }

    // Method to calculate average grade
    public static double calculateAverage(ArrayList<Integer> grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }

    // Method to find highest grade
    public static int findHighestGrade(ArrayList<Integer> grades) {
        return Collections.max(grades);
    }

    // Method to find lowest grade
    public static int findLowestGrade(ArrayList<Integer> grades) {
        return Collections.min(grades);
    }
}