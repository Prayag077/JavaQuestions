
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

     public static void reverseNumber(int a){
        
        int result = 0;

        while (a > 0) {
            int digit = a % 10;
            result = result*10 + digit;
            a = a / 10;
        }
        System.out.println("Reverse Number : " + result );
     }

     public static void armstrong(int a){

        int original = a;
        int digits = String.valueOf(a).length();
        int sum = 0;

        while (a > 0) { 
            int digit = a % 10;
            sum += Math.pow(digit, digits);
            a = a / 10; 
        }

        if (original == sum) {
            System.out.println(original +  " : armstrong Number");
        } else {
            System.out.println(original +  " : not an armstrong Number");
        }
    }

    public static void numberOfDigits(int a ){
        int digits = String.valueOf(a).length();
        System.out.println("no. of digits in " + a + " : "+digits);
    }

    public static void palindrome(int a){

        int original = a;
        int rev = 0;

        while (a > 0) {
            int digit = a % 10;
            rev = rev*10 + digit;
            a = a / 10;
        }

        if (original==rev) {
            System.out.println(original + " : Palindrome");
        } else {
            System.out.println(original + " : not a Palindrome");
        }        
    }


    public static void CalculateSum(int a){
        int original = a;
        int result = 0;
        while (a > 0) {
            int digit = a % 10;
            result+= digit;
            a = a / 10;
        }
        System.out.println("sum of digits of " + original + " : " + result  );
    }

    public static void leapYearCheck(int a){
        if ((a % 4 == 0 && a % 100 !=0) || a % 400 == 0 ) {
            System.out.println(a + " is a Leap Year");
        } else {
            System.out.println(a + " is not a Leap Year");
        }

    }
    public static void main(String[] args) {
        // try(Scanner sc = new Scanner(System.in)){
            // System.out.print("\033[0;1m" +"Enter a Number \"a\" : " + "\033[0;0m");
            // int a = sc.nextInt();
            // System.out.println();
            // System.out.print("\033[0;1m" +"Enter a Number \"b\" : " + "\033[0;0m");
            // int b = sc.nextInt();
            int a = 5;
            int b = 6;
            int c = 12345;
            int d = 153;
            int e = 123321;
      

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


        System.out.println("\033[0;1m" +"Reverse Number  c" + "\033[0;0m");
        reverseNumber(c);
        System.out.println();

         System.out.println("\033[0;1m" +"check id \"d\" is armstrong number" + "\033[0;0m");
         armstrong(d);
         armstrong(c);
        System.out.println();

         System.out.println("\033[0;1m" +"find number of digits" + "\033[0;0m");
        numberOfDigits(d);
        numberOfDigits(c);
        System.out.println();

        System.out.println("\033[0;1m" +"Check Palindrome" + "\033[0;0m");
        palindrome(e);
        palindrome(d);
        System.out.println();


        System.out.println("\033[0;1m" +"Calculate Sum" + "\033[0;0m");
        CalculateSum(e);
        CalculateSum(d);
        System.out.println();

        System.out.println("\033[0;1m" + "Leap Year Check"  + "\033[0;0m");
        leapYearCheck(2020);
        leapYearCheck(2014);
        leapYearCheck(2025);
       }

       

    }


