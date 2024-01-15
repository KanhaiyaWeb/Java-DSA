import java.util.Scanner;

public class Print_first_N_naturalNo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
//Using While Loop
        int Count =1;
        while (Count<=N){

            System.out.println(Count);
            Count++;

        }

        // USing For Loop

        for (int i =1; i<=N; i++){
            System.out.println(i);
        }

    }
}


