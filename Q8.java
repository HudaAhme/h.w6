/**
 * Created by DELL on 25/09/2022.
 */
public class Q8 {
    public static void main(String[] args) {

        int i,j,count=0;
        for (i=2;1<=50;i++)
        {
            int flag=0;
            for ( j = 2; j <i ; j++) {
                if (i % j == 0) {
                    flag = 1;
                }
            }
            if (flag==0)
            {
                System.out.println(j+"\t");
                count++;

                if (count%1==0)
                {
                    System.out.println();
                }
            }
        }


    }
}
