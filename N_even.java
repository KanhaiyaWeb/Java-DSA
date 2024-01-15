import java.util.Scanner;


//we have Given the N as an integer find the N is even or odd

public class N_even {

    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);
        int a = n.nextInt();

        if(a%2==0){
            System.out.print(a +" "+ " is Even");
        }
        else{
            System.out.print( a+" " + "Not a even No ");
        }

    }
}
