import java.util.Scanner;

public class CountStudents {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter number of students: ");
            size = sc.nextInt();
            if (size > 30)
                System.out.println("Number should not exceed 30");
        } while (size > 30);

        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter mark of student " + (i + 1) + " : ");
            array[i] = sc.nextInt();
            i++;
        }

        int count = 0;
        System.out.println("List of mark: ");
        for (int j = 0; j < array.length; j++) {
            System.out.println("Mark of student " + (j + 1) + " is: " + array[j]);
            if (array[j] >= 5 && array[j] <= 10)
                count++;
        }
        System.out.println("We have " + count + " students pass the exam");
    }
}
