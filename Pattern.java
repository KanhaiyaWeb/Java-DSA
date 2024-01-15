import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count = 1;
        while(count<=2){
            int j =1;
            while(j<=n){
                System.out.print("*");
                j++;
            }

            System.out.println();
            count++;
        }

    }
}
