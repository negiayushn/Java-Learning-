import java.util.*;
public class Conditionals{
    public static void main(String[] args){
        System.out.println("Java conditionals concepts ");
        // six conditionals in java `
//        if statement
//        if else statement
//        if else if ladder
//        nested if
//        terneary operator
//        switch statement
      int num = 10;
      int num2 = 12;
      // if else conditions in if else we can use it as ladderr
      if(num <=num2){
          System.out.println("num is smaller ");
          }
      else{
          System.out.println("num2 is big");
      }

        // if conditions
        int number  = 100;
        int number2 = 1200;
               if(num <=num2){
            System.out.println("num is smaller ");
        }

          //if else if ladder
   int day = 34;
     if (day == 1){
         System.out.println("day not found ");

     }
    else if ( day== 20){
        System.out.println("day not foumd ");

     }
    else if (day==34){
        System.out.println("day found is "+ day );
     }

        //if else nested
        char gender = 'M';
         int age = 13;
         if(gender=='M'){
             System.out.println("gender is male ");
             if(age<=18){
                 System.out.println("under age");

             }

         }
         else {
             System.out.println("gender is not confirmed ");
         }
         // ternary operator
         // (condition)? "true value": "false value"
        int solno= 18;
         String status= (solno<=20)?"not regular ":"Regular";
         System.out.println(status);

         /* switch statement
         switch(expression){
        case value1:
             code
        break;
        case value2:
         code
        break;
           using break is necessary to avoid checking all conditions if the value needed is match or found
        case value3:
         code
        break;*/
           System.out.println("ender day");
           Scanner input = new Scanner(System.in);
           int dayofweek  = input.nextInt();
           switch(dayofweek){
               case 1:
                   System.out.println("Monday");
                   break;
               case 2:
                   System.out.println("Tuesday");
                   break;
               case 3:
                   System.out.println("Wensday");
                   break;

               case 4:
                   System.out.println("Thursday");
                   break;
               case 5:
                   System.out.println("Friday");
                   break;
               case 6:
                   System.out.println("Saturday");
                   break;
               case 7:
                   System.out.println("Sunday");
                   break;
               default: System.out.println("invalid day ");

           }



    }

    }
