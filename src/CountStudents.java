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
    }
}
