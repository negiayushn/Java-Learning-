public class loops {
    public static void main(String[] args){
        System.out.println("loops concepts");
       // lops are used to repeat a sequence or part of code to
        // perform same task repedly reducing code size and helping optmizing code
        // for ( int i=1; i<=6; i++){   statement of program to run in loop and its output}
        int a=0;
         for (int i=0;i<10;i++){  // by changing conditions in loop  we can decide how the outcome apperars
             // and how many time we have to repeat code
             a++;
             System.out.println(a);
         }
   // nested for loops
        // for ( int i=0;i<10;i++){
        //code statement
        //   seconf loop {
          //  statement }
        //   }
     for (int i=0;i<10;i++){ // rows
         for (int j=1;j<i;j++){  // columns
             System.out.print('*');

         }
         System.out.println();  // use to move to next line
     }
   // for every single looping value of outer loop the inner loop run completly every time

        // break and continue keyword
        // break is use to terminate loop imeditely and leave current loop it is used
        for (int i=0;i<10;i++){
            if(i==5){
                break;
            }
            System.out.println(i);
        }

        //continue statement skip the  particular itration part and moove to next  itration of loop



        for( int i=0;i<10;i++){
            if(i==6){
                continue;
            }
            System.out.println(i);

        }
        // while loop  similar as for loop but differnce is the initalization is done before the loop start
        //and the itration is doen inside the loop
        int i=11;
        while(i<20){

            if (i==15){
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
   // do while loop
//        do{
//            // code to execute  increment / decerment
//        } while(condition);
        int p = 99;
        do {
            System.out.println(i);
            i++;
        } while(i<120);

    }
}
