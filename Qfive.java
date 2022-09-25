import java.util.Scanner;

/**
 * Created by DELL on 25/09/2022.
 */
public class Qfive {
    public static void main(String[] args) {

        String word;
        Scanner input=new Scanner(System.in);
        System.out.println("enter the word");
        word=input.nextLine();

        if (word.contains("a")||word.contains("e")||word.contains("i")||word.contains("u")||word.contains("o"))
        {
            System.out.println("the vowel");
        }else
            System.out.println("the word null is vowel");
    }
}
