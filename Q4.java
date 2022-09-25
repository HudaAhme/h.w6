import java.util.Scanner;

/**
 * Created by DELL on 24/09/2022.
 */
public class Q4 {
    public static void main(String[] args) {
        String name;
        Scanner input =new Scanner(System.in);
        System.out.println("enter the name");
        name=input.nextLine();


        StringBuilder m=new StringBuilder(name);
        m.reverse();
        String text=m.toString();

        System.out.println("original string   "+name);
        System.out.println("the string after  "+text);


    }
}
