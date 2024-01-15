/*import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        fun(67);
        fun("karthik");
        
    }
    static void fun(int a){
        System.out.println(a);
       
    }
    static void fun(String b){
        System.err.println(b);
    }
}*/
// import java.util.Scanner;

// public class Test {
//     public static void main(String[] args) {
//         Scanner mySum = new Scanner(System.in);

//         System.out.println("Enter a number:");
//         int x = mySum.nextInt();

//         System.out.println("Enter another number:");
//         int y = mySum.nextInt();

//         int result = addSum(x, y);
//         System.out.println("Sum: " + result);

//         mySum.close();
//     }

//     static int addSum(int a, int b) {
//         return a + b;
//     }
// }

// public class Test{
//     public static void main(String[] args) {
//         int sum=myNum(0);
//         System.out.println(sum);
        
//     }
//     public static int myNum(int n){
//         if (n>0){
//             return n + myNum(n-1);
//         }
//         else{
//         return 0;

//     }
//     }
// }

// public class Test{
// public static void main(String[] agrs){
// int sub=mySub(10);
// System.out.println("the value:"+sub);
// }
// public static int mySub(int a){
// if(a>0){
// return a+mySub(a-1);
// }
// else{
// return 0;
// }
// }
// }

// public class Test {

//     public static void main(String[] args) {
//         int sum=mySum(10,20);
//         System.out.println("the value:"+ sum);
        
//     }
//     public static int mySum(int start,int end){
//         if (end > start){
//             return end+mySum(start, end-1);
//         }
//         else{
//             return end;
//             }
//         }
//     }
public class Test{
    public static void main(String[] args) {
        int fun=myFun(5);
        if(fun!=0){
        System.out.println("the value:"+fun);
        }
        
    }

public static int myFun(int n){
 
    try{
        int num=2/0;
        return num;
    }catch(Exception e){
     
        System.out.println("Error:"+e);
        return 0;

    }
}
}



 