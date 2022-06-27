import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] students = new String[10];

        try (Scanner input = new Scanner(System.in)) {
            for (int i = 0; i < 10; i++) {
                System.out.println("Enter student's name:");
                String name = input.nextLine();
                students[i] = name;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        for (String student : students) {
            System.out.println("You have entered the following names:");
            System.out.println("=> " + student);
        }
    }
}
