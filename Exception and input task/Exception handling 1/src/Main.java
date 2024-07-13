//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a= 0, b=0;
        boolean valid= false;

        while (!valid) {
            try {
                System.out.print("Enter the first integer: ");
                a =scanner.nextInt();
                valid=true;
            }
            catch(InputMismatchException e){
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next();
            }
        }

        valid= false;
        while (!valid) {
            try{
                System.out.print("Enter the second integer: ");
                b=scanner.nextInt();
                valid= true;
            }
            catch(InputMismatchException e){
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next();
            }
        }
        int sum=a+b;
        System.out.println("The sum is: "+ sum);
    }
}
