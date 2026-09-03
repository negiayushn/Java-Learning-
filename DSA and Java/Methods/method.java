import java.sql.SQLOutput;
import java.util.Scanner;

public class method {
    /// method decleration
   static  void  printTable( int num){
        for(int i=1;i<=10;i++){
            int table= num*i;
            System.out.println(table);

        }

    }
    static int returnChar(int a , int b){
          int q =a;
          int y =b;
          int h= q+y;
          return (h);

    } // method overloading using same name but difrent signature of function or different parameters
    static int returnChar(int a , int b , int c){
        int q =a;
        int y =b;
        int p = c;
        int h= q+y+p;
        return (h);

    }
    static void greet() {
        System.out.println("Inside greet method");
    }
    static void greetUser(){
       System.out.println("WelcomeUserXyz");
    }
    public static void main(String[]args ){
        System.out.println("Methods in java");
   // methods able us to reuse a particular block of code
        // basic syntax of methods
        // returnType methodName (parameters){ methodBody  }
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER NUMBER");
        int number= input.nextInt();
        printTable(number);// method call  // parametric method
        System.out.println("Table of "+ number+" is printed");
      // parameters vs no parameter
//        Parameters are variables that receive arguments passed to a method.
         greetUser(); // non parameteric methods
       // void vs non void methods
         // non void function return values to  program
        int a = 90;
        int   b =78;
        int c= returnChar(a,b);
        System.out.println(c);

        //  Execution flow and arguments
               System.out.println("Start");
                greet();
                System.out.println("End");
              /*    main()
                   ↓
               Print "Start"
                    ↓
                call greet()
                     ↓
                 Enter greet()
                        ↓
             Print "Inside greet method"
                          ↓
                 greet() finishes
                       ↓
                   Return to main()
                          ↓
                   Print "End"
                       ↓
                 main() finishes*/



        // method signature - A method signature is the combination of:
        // Method signature = method name + parameter types (number and order included).
        // 1 - Method name
        //  2 - Number, type, and order of parameters
        // method call stack  The method call stack is a memory structure Java uses to keep track of which methods are currently running and where they should return after finishing.
        //
        //Think of it like a stack of plates:
        //
        //Last method called → first method to finish.  he stack frame conceptually contains:
        //
        //Stack
        //┌─────────────────────────┐
        //│ add() Stack Frame       │
        //│                         │
        //│ Parameter: a = 10       │
        //│ Parameter: b = 20       │
        //│ Local variable: result  │
        //│ Temporary/intermediate  │
        //│ Return information      │
        //└─────────────────────────┘
//     scoping in java  Scope means:
//
//The part of a program where a variable, method, or other identifier can be accessed.
//        1. Local Variable Scope
//
//        A variable declared inside a method can only be used inside that method.
//        2. Block Scope
//
//        A variable declared inside { } generally exists only within that block.

        if (true) {

            int x = 10;

            System.out.println(x); //
        }
        // System.out.println(x);     // not accesible value outside {}
//        4. Instance Variable Scope
//
//        A variable declared inside a class but outside methods is an instance variable.
//
//        class Student {
//
//            int marks = 80;
//
//            void display() {
//                System.out.println(marks);
//            }
//
//            void changeMarks() {
//                marks = 90;
//            }
//        }
//
//        marks belongs to the object and can be accessed by the instance methods of that class.

//        Call by value means:
//
//        When you pass an argument to a method, Java passes a copy of the value to the method.
//
//                Java is always pass-by-value. This is important because Java does not have true "call by reference."

    }
}
