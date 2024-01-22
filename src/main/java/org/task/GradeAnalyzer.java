package org.task;

import java.util.Arrays;
import java.util.Scanner;



    public class GradeAnalyzer {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the number of students: ");
            int numStudents = scanner.nextInt();

            int[] grades = gradesInput(scanner, numStudents);

            double average = calculateAverage(grades);
            int highest = findHighest(grades);
            int lowest = findLowest(grades);

            displayResults(grades, average, highest, lowest);

            scanner.close();
        }

        private static int[] gradesInput(Scanner scanner, int numStudents) {
            int[] grades = new int[numStudents];
            for (int i = 0; i < numStudents; i++) {
                System.out.print("Enter grade for student " + (i + 1) + ": ");
                grades[i] = scanner.nextInt();
            }
            return grades;
        }


        private static double calculateAverage(int[] grades) {
            int sum = 0;
            for (int grade : grades) {
                sum += grade;
            }
            return (double) sum / grades.length;
        }


        private static int findHighest(int[] grades) {
            int highest = grades[0];
            for (int grade : grades) {
                if (grade > highest) {
                    highest = grade;
                }
            }
            return highest;
        }


        private static int findLowest(int[] grades) {
            int lowest = grades[0];
            for (int grade : grades) {
                if (grade < lowest) {
                    lowest = grade;
                }
            }
            return lowest;
        }

        private static void displayResults(int[] grades, double average, int highest, int lowest) {
            System.out.println("\nGrade Analysis:");
            System.out.println("Grades: " + Arrays.toString(grades));
            System.out.println("Average: " + average);
            System.out.println("Highest Score: " + highest);
            System.out.println("Lowest Score: " + lowest);
        }
    }

