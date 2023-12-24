// public: This is an access modifier. In Java, public means that the method main can be accessed by any other class.
// static: This keyword indicates that the method belongs to the class itself, not to instances of the class. In the context of the main method, it is required because it is called by the Java Virtual Machine (JVM) to run the program, and the JVM doesn't create an instance of the class.
// void: This is the return type of the main method. void means that the method does not return any value.
// main: This is the name of the method. In Java, the main method is the entry point for a Java program. When you run a Java program, the JVM starts executing the code from the main method.
// (String[] args): These are the parameters that the main method takes. String[] args is an array of strings that can be used to pass command-line arguments to the program. The args parameter is not used in the example I provided earlier.


public class DayTwo {
    public static void main(String[] args) {
        
        String StrExam = "String ";
        int IntExamp = 225555; 
        Boolean BoolenExamp = true;

        System.out.println("This is " + StrExam );
        System.out.println("This is number" + IntExamp);
        System.out.println("This is Boolen" + BoolenExamp);

    }
}
