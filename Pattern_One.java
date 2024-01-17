import java.util.Scanner;

/*
print PAttern Like

        *
        **
        ***
        ****

*/
public class Pattern_One {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int row =1;
        int nst = 1;
        while (row<=n){
            int i =1;
            while (i<=nst){
                System.out.print("*");
                i=i+1;

            }
            nst = nst+1;
            System.out.println();
            row = row+1;
        }

    }
}
