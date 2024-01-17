
import java.util.Scanner;
public class Pattern_2 {




    /*
    print PAttern Like

*******
******
*****
****
***
**
*



    */
        public static void main(String[] args) {

            Scanner s = new Scanner(System.in);
            int n = s.nextInt();

            int row =1;
            int nst = n;
            while (row<=n){
                int i =1;
                while (i<=nst){
                    System.out.print("*");
                    i=i+1;

                }
                nst = nst-1;
                System.out.println();
                row = row+1;
            }

        }


}
