import java.util.Scanner;

//
//Find the greatest no out of 3

public class FindMax {

    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);
        int a = n.nextInt();
        int b = n.nextInt();
        int c = n.nextInt();

        if (a>b && a>c) {
            System.out.println(a + " " + "is greater");
        }
        else if (b>c) {


            System.out.println(b + " " + "is greater");
        }
        else {

                System.out.println(c + " " + "is greater");
        }

    }
}
