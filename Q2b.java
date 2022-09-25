import java.util.Scanner;

/**
 * Created by DELL on 24/09/2022.
 */
public class Q2b {
    public static void main(String[] args) {
        int a,b,sum=0;
        Scanner input=new Scanner(System.in);
        System.out.println("enter first odd number  ");
        a=input.nextInt();
        System.out.println("enter seconed odd number  ");
        b=input.nextInt();

        for (int i=0;i<5;i++)
        {
            if (a%2==1&&b%2==1)
            {
               sum=a+b;

            }
        }
        System.out.println(sum);


    }
}
