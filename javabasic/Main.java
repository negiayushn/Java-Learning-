import java.util.*;

public class Main {
 public static  void main(String[] args) {
      System.out.println("Hello, World!"+"hello ayush");
    System.out.print("hakuna batata ");// removing ln for restricting code to jumto next line 
    System.out.println(3);
    System.out.println(4+3);
   // MY name is ayush   comment out using slash 

   // variable in java
   // declare variable 
   int age;
   age= 187;
   int Age=68;
   System.out.println(age);
   System.out.println(Age);
   // reserved keyword 
  // like --- abstract assert bolean break byte case catch char class const* continue default do double els eenum extends final finally float for etc 
  // resrevr keywor dcant be use as variable name
   // for constant we use upper case 
   int Day_In_Year= 365;
   System.out.print(Day_In_Year);
   // for multiple wors use like this
   int marryChristmasInDecember = 25;
    System.out.println(marryChristmasInDecember);

    // Data Types in java 
    /* primitive data type                      NOn- primitive data type 
    non numeric     numeric                          string array etc 
      bollean char    - integer - byte short, long int 
                    -floating point -- float and double 
    */
    byte num = 127;// + - max range 
    short num2 = 3276; 
    float num3 = 13.9989f;// 6 to 7 dig presecision ;
    char characterassing= 'j';
     char charrrr = 'k';
    double num4  =8.123456789876543;// near 15 range 
    System.out.println(num);
    System.out.print('a'+9);

     // small data type to large comers under implict data type 
       // for explict data casting 
       long value=1234467;
       int value2=(int)value;
       System.out.println(value2);
       char name= 'a';
       int nummm = (int)name;  
       System.out.println(nummm);
       
       // operators in java to perform operations in java 
       // Arthmetic , logical , bitwise , Relationla assignment unaray inc/dec operator 
       // +, -, *, /, % use for addition subtraction ,multiplication division and reminder of two number whrn devide ;
       int a=5;
        int b=5;
         int c= a*b-a/b%a;
         System.out.println(c);
         // realtional are use for comparision in twon values 
          // ==,!=,>,<,>=,<=
          int a1= 9;
          int b2=10;
          int c1=0;
           if(a1==b2){
               c1=1;
           };
           if(a1!=b2){
               c1=99;
           };
           if(a1>=b2){
               c1=111;
           };
           if(a1<=b2){
               c1=89;
           };
           if(a1<b2){
               c1=1998;
           };
           System.out.println(c1);
       ///  logical operator 
       // && and operator if both value true return true 
       // || or operator if any one value is true 
       // ! reverse the boolean vavlue  
       



       // assingment operators  = ,+= ,-= ,*= ,/= ,%=
       int s= 10;
        s +=10;
         s -=12;
        System.out.println(s);

    // uranary operators 
     // uranary +, uranary -,increment,decrement, logical not ;
     //  +a ,-b ----   increment -- pre increment and post increment    
         //                        ++a ,a++ in pre increment value change first then use and in post value is used first then change 
         // similare for post decrement and pre decrement --a ,a--
        int g= 10;
        --g;
        System.out.println(g);
        g++;
        System.out.println(g);

        // input output in java 
        // sc is varibale name for scanner it can be change like input etc 
        //for input we use scanner class
        Scanner sc = new Scanner(System.in);  //new Scanner(System.in) this create new scanner which connect tro input from keyboad in the progreamm 
        System.out.println("enetr num1");
        int firstnum = sc.nextInt();
          System.out.println("enetr num2");
        int secNum = sc.nextInt();
        System.out.println(firstnum+ secNum);
     //   Scanner = class
// sc = variable/reference name
// new Scanner(System.in) = creates Scanner connected to input
// System.in = keyboard input stream
// | Method             | Reads            |
// | ------------------ | ---------------- |
// | `sc.next()`        | One word / string for one words only        |
// | `sc.nextLine()`    | Complete line  / also for string if multiplke words   |
// | `sc.nextInt()`     | Integer          |
// | `sc.nextDouble()`  | Decimal number   |
// | `sc.nextLong()`    | Long integer     |
// | `sc.nextFloat()`   | Float            |
// | `sc.nextBoolean()` | `true` / `false` |
// we can request garbage collectoion oince an opbject is elegible for this using System.gc();
    }
}