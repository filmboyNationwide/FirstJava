import java.util.Scanner;

class Maintwo {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter name, age and salary on the following lines");
        System.out.println("Enter name:");
        // String input
        String name = myObj.nextLine();

        // Numerical input
        System.out.println("Enter age:");
        int age = myObj.nextInt();
        System.out.println("Enter salary:");
        double salary = myObj.nextDouble();

        // Output input by user
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}