import java.util.Scanner;

public class Pattern_3 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int row =1;
        int nst = n;
        while (row<=n){
            int i =n-1;
            while (i<=nst){
                System.out.print("*");
                i=0;

            }
            nst = nst-1;
            System.out.println();
            row = row+1;
        }

    }

}
