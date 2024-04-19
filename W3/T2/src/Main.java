import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    ///sum method
    public static int sum(int[] arr) {
        int sum=0;
        for (int i=0; i<arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    //average method
    public static double avg(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        return (double)sum(arr)/arr.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//size
        int n=scanner.nextInt();
        int[] arr=new int[n];

//elements
        for (int i = 0; i<n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(sum(arr));
        System.out.println(avg(arr));
    }


}