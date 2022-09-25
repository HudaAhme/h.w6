import java.util.Scanner;

/**
 * Created by DELL on 24/09/2022.
 */
public class Q2c {
    public static void main(String[] args) {

        int num,sum=0;
        Scanner input=new Scanner(System.in);

        for (int i = 0; i <3 ; i++) {
            System.out.println("enter number ");
            num=input.nextInt();
            if (num%2==1)
            {
                System.out.println(sum =num+num);

            }
            else
                System.out.println("its a odd");

        }

    }
}
