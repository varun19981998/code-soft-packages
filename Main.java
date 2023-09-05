// student grade calculator

import java.util.Scanner;

 class task2_codsoft {
    public static void main(String[] args) {
        int marks[] = new int[5];
        int j;
        float total = 0, avg;
        Scanner sor = new Scanner(System.in);

        for (j = 0; j < 5; j++) {
            System.out.println("Enter the marks of the Subjects" + (j + 1) + ":");
            marks[j] = sor.nextInt();
            total = total + marks[j];
        }
        sor.close();
        avg = total / 5;
        System.out.println("The Student Grade is: ");
        if (avg >= 80) {
            System.out.println("A");
        } else if (avg >= 60 && avg > 80) {
            System.out.println("B");
        } else if (avg >= 40 && avg > 60) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }

        System.out.println("The Total marks of the student are :\n" + total);
        System.out.println("The Avergae percentage of the student is :\n" + avg);
    }
}