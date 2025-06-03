
public class CWH_Practice_1 {

    public static void sumNumber(int a , int b ){
        System.out.println(a + b);
    }

    public static void caculateCGPA(float a,float b,float c){

        float percent = (a+b+c)/30;
        System.out.println(percent + " CGPA");

    }

    public static void sayHello(String name){
        System.out.println("Hello, " + name + " have a good day!!");
    }

    public static void kilometerToMiles(float km){
        double miles = km * .6;
        System.out.println(miles + " miles");
    }

    

    


    public static void main(String[] args) {

        //Question 1
        int a = 5 ;
        int b = 8 ;
        
        sumNumber(a, b);
        System.out.println();


         //Question 2
        float chemistry = 65;
        float physcis = 54;
        float maths = 99;

        caculateCGPA(chemistry, physcis, maths);
        System.out.println();

         //Question 3
        // System.out.print("Enter Your Name : ");
        // try(Scanner sc = new Scanner(System.in)){
        //     String name = sc.nextLine();

        //     sayHello(name);
        // }
        sayHello("rahdhe radhe");
        System.out.println();


         //Question 4
        kilometerToMiles(a);
        System.out.println();

         //Question 5
        // System.out.println("inter your number : ");

        // Scanner sc = new Scanner(System.in);
        // System.out.println(sc.hasNextInt());





        //Chapter 2 Practice Set!!

        //Question 1

        //what will be the result of following expression

        float c = 7/4 * 9/2;   //precedance and asocivity
        float d = 7/4.0f * 9/2.0f;
        System.out.println(c);
        System.out.println(d);
        System.out.println();

        //Question 2

        //wirte a java program to incrypt a grade by adding 8 to it decrypt to it to show the correct grade

        char grade = 'B';
        grade += 8;
        System.out.println(grade);
        grade -=8;
        System.out.println(grade);
        System.out.println();


        //Question 3

        //Use a comperison operator to find out whether a given number is greater than a number or not 
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println();

        //Question 4

        //write the following expression in a java program 

        int v = 5;
        int u = 3;
        int acel = 3;
        int s = 4;
        int ans = (v*v - u*u)/(2*acel*s);
        System.out.println(ans);
        System.out.println();

        //Question 5 

        //find the value of following expression
           
            int ans1 = 7*49/7 + 35/7;
            System.out.println(ans1);
        
    }

}