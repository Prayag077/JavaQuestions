
import java.util.Scanner;

public class Basic {
    public static void oddEven (int a){
        if (a % 2 == 0) {
            System.out.println(a + " is an Even Nunber");
        } else {
            System.out.println(a + " is an Odd Number");
        }
    }

    public static void primeNumber(int a){
        if (a<=1) {
            System.out.println(a + " is not a Prime Number");
            return;
        }
        
        for (int i = 2; i <=Math.sqrt(a); i++) {
            if (a%i==0) {
                System.out.println(a + " is not a Prime Number");
                return;
            } 

            System.out.println(a + " is a Prime Number");
        }
    }

    public static void fibonacci(int a){
        int first = 0;
        int second = 1;

        for (int i = 0; i < a; i++) {
            System.out.println(first);
            int next = first + second;
            first = second;
            second = next;

        }
    }

    public static void swapTwoNumber(int a , int b){

        System.out.println("a before swapping : " + a);
        System.out.println("b before swapping : " + b);
        System.out.println();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a after swapping : " + a);
        System.out.println("b after swapping : " + b);
    }

    public static void factorial(int a){
        int result = 1;
        for (int i = 1; i <=a; i++) {
            result *=i;
        }
        System.out.println("Factorial of " + a + " is : " + result);
    }


    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            // System.out.print("\033[0;1m" +"Enter a Number \"a\" : " + "\033[0;0m");
            // int a = sc.nextInt();
            // System.out.println();
            // System.out.print("\033[0;1m" +"Enter a Number \"b\" : " + "\033[0;0m");
            // int b = sc.nextInt();
            int a = 5;
            int b = 6;
      

        System.out.println("\033[0;1m" +"Check " +  a + " is  Odd or Even" + "\033[0;0m");
        oddEven(a);
        System.out.println();

        System.out.println("\033[0;1m" +"Check if" + a + " is Prime Number" + "\033[0;0m");    
        primeNumber(a);
        System.out.println();
        

        System.out.println("\033[0;1m" +"Print Fibonacci Series to" + a + "digits" + "\033[0;0m"); 
        fibonacci(a);
        System.out.println();


        System.out.println("\033[0;1m" +"Swap a and b digits" + "\033[0;0m");
        swapTwoNumber(a, b);
        System.out.println();

        System.out.println("\033[0;1m" +"Factoiral of a" + "\033[0;0m");
        factorial(a);
        System.out.println();
          }
    }
}

