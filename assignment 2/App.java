// import the Scanner class
import java.util.Scanner;

public class App {

    // Scanner Object
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        // Method call
        //int product = multiply();
        //System.out.println("The product is: " + product);

        // Method call
        //int quotient = divide();
        //System.out.println("The quotient is: " + quotient);

        // Method call
        //int age = computeAge();
        //System.out.println("Your age is: " + age);

        // Method call
        //String crush = revealMyCrush();
        //System.out.println(crush);

        // Method call
        //double myGrade = getAverage();
        //System.out.println("My final grade is: " + myGrade + "%");

        MyOrder();
        
        // Close scanner
        scan.close();
    }

    static int multiply() {
        System.out.println("Please enter two numbers to multiply");
        System.out.print("Enter first number: ");
        int x = scan.nextInt();

        System.out.print("Enter second number: ");
        int y = scan.nextInt();
        return x + y;
    }

    static int divide() {
        System.out.println("Please enter two numbers to divide");
        System.out.print("Enter first number: ");
        int x = scan.nextInt();

        System.out.print("Enter second number: ");
        int y = scan.nextInt();
        return x - y;
    }

    static int computeAge() {
        System.out.println("Please enter current year and year of birth");
        System.out.print("Enter current year: ");
        int x = scan.nextInt();

        System.out.print("Enter the year of your birthday: ");
        int y = scan.nextInt();
        return x - y;
    }

    static String revealMyCrush() {
        System.out.println("This will reveal the name of your crush");
        System.out.print("Enter your name: ");

        String myName = scan.nextLine();

        System.out.print("Enter the name of your crush: ");

        String Crush = scan.nextLine();

        System.out.print("Enter the name of your second crush: ");

        String second = scan.nextLine();

        return myName + " loves " + Crush + " and " + second;
    }




    static void MyOrder() {
        
        System.out.print("Enter your first order: ");
        String myOrder1 = scan.nextLine();

        System.out.println("the price is: ");
        double x = scan.nextDouble();
        scan.nextLine();
        
        System.out.println("enter another order: ");
        String myOrder2 = scan.nextLine();

        System.out.println("the price is: ");
        double y = scan.nextDouble();
        scan.nextLine();

        System.out.println("enter another order: ");
        String myOrder3 = scan.nextLine();

        System.out.println("the price is: ");
        double z = scan.nextDouble();

        double total = x + y + z;
        System.out.println("your orders are " + myOrder1 + ", " + myOrder2 + ", and " + myOrder3 );
        System.out.println("your total is " + total );
    }
}
