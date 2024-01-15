/*
Print the factorial of N
What is Factorial = factorial of n is the product positive no eg N =3 then factorial of 3 is 3*2*1 = 6
*/

public class N_factorial {


    public static void main(String[] args) {
        int n = 10;
        int fact= 1;
        for(int i =1; i<=n; i++ ){

            fact *=i;
        }
        System.out.println(fact);
    }
}
