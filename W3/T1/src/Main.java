import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//size
        int n = scanner.nextInt();
        int[] arr = new int[n];

//elements
        for (int i = 0; i<n; i++) {
            arr[i] = scanner.nextInt();
        }

        int target = scanner.nextInt();
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                if (i < 5) {
                    continue;
                }
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println(index);
        }
    }
}