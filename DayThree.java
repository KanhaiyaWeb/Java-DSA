//   How Java Code Execuutes

// .java file(Human Readable)  -> compiler(Entire file) -> .class file (byte code)  -> Interceptor (Line by line ) -> machine code 



// public -> This Mean this is access from any where 

// class -> This is a group of somethings 

// main -> This is reseerved key  , this is the entry point of the java program 

// static ->  if we want to run without the object of any class then static is the key 

// void -> return types of the function 

// Staring[] args - this is command line arguments 



// class name should be name of the file - 
// if you want to name your class other then file name then keep it as private - not public

// eg : 

// short cut for public static void main(String[] args) - psvm

import java.util.Scanner;

class DayDemo {

    public static void main(String[] args) {
        
        System.out.println("This is test");

    }
    

}


// what is package? 

// Package is nothing just a folder 


// System - it is a class it contains a variable "out" 
// println - it is a method 

// import java.util.Scanner;

public class DayThree {

    public static void main(String[] args) {

    System.out.println("This is the system Out");
    // Scanner input = new Scanner(System.in);


    }
    
}


class PrimitiveClass{

    public static void main(String[] args) {
        
        int rollNumber = 14;

        System.out.println(rollNumber);

        //  What is primitative data type 
        // Primitive data Type means which you can not break further into another data type is called primitive data type 


        // boolean check = true;              1 bit  Stores true or false values

        // byte a = 1;          1 byte  Stores whole numbers from -128 to 127

        // short b = 1;        2 bytes  Stores whole numbers from -32,768 to 32,767

        // char letter = 's';           2 bytes  Stores a single character/letter or ASCII values

        // int rollno = 64;             4 bytes  Stores whole numbers from -2,147,483,648 to 2,147,483,647

        // float marks = 98.67f;        4 bytes  Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits

        // double largeDecimalNumbers = 4534534534.454353;      8 bytes  Stores fractional numbers. Sufficient for storing 15 decimal digits

        // long largeIntergerValues = 4245345346356354345L;     8 bytes  Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807


        //  char starts which the single quote and syring starts with the double quote 

        // eg : 

        char letter = 'a';
        float marks = 98.65f;

        double largedecimalNumber = 458147474477.258541;

        long longIntegerValue = 41854442140101L;

        boolean check = true;
        boolean chk = false;

    }

}


class TakesInput{

public static void main(String[] args) {
    Scanner Test = new Scanner(System.in);
    System.out.println("Please enter your input here");
    int rollno = 20;
    System.out.println("Your Roll no is " + rollno);

    int a = 10 ;
    int b = 5;

    System.out.println(  a+b);
}
}






