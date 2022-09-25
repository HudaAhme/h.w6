/**
 * Created by DELL on 25/09/2022.
 */
public class Q1 {
    public static void main(String[] args) {

        double balance=1000;
        double year=balance*12;
        for (int y=0;y<=10000;y++)
        {
            year=y+y;
            System.out.println(balance);
        }

    }
}
