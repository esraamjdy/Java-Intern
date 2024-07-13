//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        File file=new File("Lincoln.txt");
        int cnt=0;

        try(Scanner s=new Scanner(file)) {
            while(s.hasNext()) {
                s.next();
                cnt++;
            }
        }
        catch(FileNotFoundException e){
            System.out.println("File not found: "+file.getAbsolutePath());
        }
        System.out.println("Number of words in the file is: "+cnt);
    }
}