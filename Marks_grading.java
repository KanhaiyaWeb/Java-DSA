import java.util.Scanner;

public class Marks_grading {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int Marks = a.nextInt();

        if(Marks>90 && Marks <100){
            System.out.println("o");
        }else if (Marks<=90 &&Marks>80){
            System.out.println("A+");
        }else if (Marks>70 && Marks<=80){
            System.out.println("A");
        } else if (Marks>50 && Marks<=70) {
            System.out.println("P");

        }else {
            System.out.println("Fail");
        }

    }

}
