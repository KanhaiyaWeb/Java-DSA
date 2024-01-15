import java.util.Scanner;


//we have Given the P,R,T as an integer find the Simple Intrest
public class SimpleIntrest {

    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);

        int p = a.nextInt();
        int r = a.nextInt();
        int t = a.nextInt();

        int si = (p*r*t)/100;


        System.out.println(si);

    }
}
