import java.util.*;

public class arrays {
    public static void main(String[] args){
        // An array in Java is a data structure used to store multiple values of the same data type in a single variable.
        // creations decleration allocation and intilization in arrays
        // arrays work on continous memory
           int  number[]  =  new int [3]; //allocation and creation of array object in memory;
       //  type  -name  - [size alloction stntax]
        int arr[]; // deceleration of array
        int arr2[]={10, 20, 30, 40, 50, 60};// initilization of array putting values in array
        //indexing is use to assign value to array and it is start from 0 to no of elemt required
        System.out.println(arr2[0]);  //  print element at index 0
        // index is from o to n-1;
        // itration of element in array can be doen by for loop
        for (int i=0;i<arr2.length;i++){  //  .length give length of array which is usually n-1 were n is no of element in arrays
            System.out.print(arr2[i]+" ");

        }
        System.out.println("Array Printed");
        // for each loop  for itration
       // The for-each loop is used to traverse each element of an array or collection one by one.
        int arr3[]= {1,2,3,4,5,6};
        for(int val:arr3){
            System.out.println(val);
        }
        // taking input in array
        int array[]= new int[5];
        Scanner sc  =  new Scanner(System.in);
        for(int i=0;i<array.length;i++){
            System.out.println("Enter element of array");
            array[i]= sc.nextInt();// input

        }
        for (int val : array){
            System.out.println(val+" "); //array output all element
        }
        // 2d arrays two dimensional arrays
        // initilization
        /// arr[row index][column index] its and array of arrays
        /// we can also intitilize arrays as int[][] arrayName;
       // int[][] arrays ;
        // memory allocation arr= new int[3][4]
      //  System.out.println("2d array ");
        // decleration
      //  int[][] arrays;
        //alloctaions
        // arrays = new int[3][4];
         //initilization
        int[][] arrays={
                {1,2,3},{4,5,6},{7,8,9}
                };
                 for (int r=0;r<arrays.length;r++){
                     for (int c=0;c<arrays[r].length;c++){
                         System.out.print(arrays[r][c]+" ");
                     }
                     System.out.println();

                 }
                  // for accesinng elements we us ebothb row and column index on that row
         // input in 2d arrays
        int [][] arra2 = new int[4][5];
                 Scanner input=new Scanner(System.in);
                 for(int i=0;i<arra2.length;i++){
                     for(int j =0;j< arra2[i].length;j++){
                         System.out.println("enter element of arra2 row"+i);
                          arra2[i][j]= input.nextInt();

                     }
                 }
                 // output
        for (int i=0;i<arra2.length;i++){
            for(int j=0;j<arra2[i].length;j++){
                System.out.print(arra2[i][j]+" ");
            }
            System.out.println();
        }
    }
}
