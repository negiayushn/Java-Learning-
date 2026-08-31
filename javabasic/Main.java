```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!" + "hello ayush");
        System.out.print("hakuna batata ");// removing ln for restricting code to jump to next line
        System.out.println(3);
        System.out.println(4 + 3);
        // MY name is ayush   comment out using slash

        // variable in java
        // declare variable
        int age;
        age = 187;
        int Age = 68;
        System.out.println(age);
        System.out.println(Age);

        // reserved keyword
        // like --- abstract assert boolean break byte case catch char class const*
        // continue default do double else enum extends final finally float for etc
        // reserved keyword can't be used as variable name

        // for constant we use upper case
        int Day_In_Year = 365;
        System.out.print(Day_In_Year);

        // for multiple words use like this
        int marryChristmasInDecember = 25;
        System.out.println(marryChristmasInDecember);

        // Data Types in java
        /*
        Primitive data type                  Non-primitive data type
        Non-numeric    Numeric               String, array, etc.
        boolean char   - integer - byte,
                       short, long, int
                       - floating point --
                       float and double
        */

        byte num = 127;// + - max range
        short num2 = 3276;
        float num3 = 13.9989f;// 6 to 7 digits precision
        char characterassing = 'j';
        char charrrr = 'k';
        double num4 = 8.123456789876543;// near 15 digits range
        System.out.println(num);
        System.out.print('a' + 9);

        // small data type to large comes under implicit data type conversion
        // for explicit data type casting
        long value = 1234467;
        int value2 = (int) value;
        System.out.println(value2);

        char name = 'a';
        int nummm = (int) name;
        System.out.println(nummm);

        // operators in java to perform operations in java
        // Arithmetic, logical, bitwise, relational, assignment, unary, increment/decrement operators

        // +, -, *, /, % are used for addition, subtraction, multiplication,
        // division, and remainder of two numbers when divided
        int a = 5;
        int b = 5;
        int c = a * b - a / b % a;
        System.out.println(c);

        // relational operators are used for comparison between two values
        // ==, !=, >, <, >=, <=
        int a1 = 9;
        int b2 = 10;
        int c1 = 0;

        if (a1 == b2) {
            c1 = 1;
        }

        if (a1 != b2) {
            c1 = 99;
        }

        if (a1 >= b2) {
            c1 = 111;
        }

        if (a1 <= b2) {
            c1 = 89;
        }

        if (a1 < b2) {
            c1 = 1998;
        }

        System.out.println(c1);

        // logical operators
        // && AND operator: if both values are true, returns true
        // || OR operator: if any one value is true, returns true
        // ! NOT operator: reverses the boolean value

        // assignment operators =, +=, -=, *=, /=, %=
        int s = 10;
        s += 10;
        s -= 12;
        System.out.println(s);

        // unary operators
        // unary +, unary -, increment, decrement, logical NOT
        // +a, -b
        // increment -- pre-increment and post-increment
        // ++a, a++: in pre-increment, the value changes first and then is used;
        // in post-increment, the value is used first and then changed
        // similar for post-decrement and pre-decrement: --a, a--

        int g = 10;
        --g;
        System.out.println(g);
        g++;
        System.out.println(g);

        // input output in java
        // sc is the variable name for Scanner; it can be changed to something else like input
        // for input, we use the Scanner class

        Scanner sc = new Scanner(System.in);
        // new Scanner(System.in) creates a new Scanner connected to input from the keyboard
        System.out.println("enter num1");
        int firstnum = sc.nextInt();

        System.out.println("enter num2");
        int secNum = sc.nextInt();

        System.out.println(firstnum + secNum);

        // Scanner = class
        // sc = variable/reference name
        // new Scanner(System.in) = creates Scanner connected to input
        // System.in = keyboard input stream

        /*
        | Method             | Reads                                      |
        |--------------------|--------------------------------------------|
        | sc.next()          | One word / string for one word only        |
        | sc.nextLine()      | Complete line / also for string if multiple words |
        | sc.nextInt()       | Integer                                    |
        | sc.nextDouble()    | Decimal number                             |
        | sc.nextLong()      | Long integer                               |
        | sc.nextFloat()     | Float                                      |
        | sc.nextBoolean()   | true / false                               |
        */

        // We can request garbage collection once an object is eligible for it
        // using System.gc();
    }
}
```
