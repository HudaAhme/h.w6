import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by DELL on 25/09/2022.
 */
public class Q3
{
    public static void main(String[] args) {

        String name;
        System.out.println("enter the name");
      Scanner input =new Scanner(System.in);
        name=input.nextLine();

        for (int i = 0; i <name.length() ; i++) {
            char resalt=name.charAt(i);
            System.out.println(resalt);

        }

    }
}
