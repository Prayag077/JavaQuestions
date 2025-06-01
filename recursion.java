package questions;

import java.util.HashSet;

public class recursion {
    
     //RECURSION QUESTIONS 


     public static void numberInReverseOrder(int a){
      if (a == 0) {
         return;
      }
      System.out.println(a);
      numberInReverseOrder(a-1);
     }

     public static void numberInorder(int a){
      if (a == 0) {
         return;
      }

      numberInorder(a-1);
      System.out.println(a);
     }

     public static int sumOfNaturalNumbers(int a ){
      if (a==0) {
         return 0;
      }
      return a + sumOfNaturalNumbers(a-1);
     }

     public static int recuriveFactorial(int a ){
      if (a==0) {
         return 1;
      }
      return a * recuriveFactorial(a-1);
     }

     
     public static void recursiveFibonacci(int a , int first ,int second){
      if (a == 0) {
         return;
      }
      System.out.println(first);
      int next = first + second;
      recursiveFibonacci(a-1 ,second, next);
     }

     public static int recursivePower(int a, int b){
      if (b==0) {
         return 1;
      }
      return a * recursivePower(a, b-1);
     }


     public static int recursivePowerLog(int a, int b){
      if (b==0) {
         return 1;
      }
      if (b%2==0) {
         return recursivePowerLog(a, b/2) * recursivePowerLog(a, b/2);
      } else {
          return recursivePowerLog(a, b/2) * recursivePowerLog(a, b/2) * a;
      }
     }

     public static void towerOfHanoi(int n ,String src , String helper , String desti){
      if (n==1) {
         System.out.println("transfer disc"+ n  + " from " + src  + " to " +  desti);
         return;
      }

      towerOfHanoi(n-1, src,desti,helper);
      System.out.println("transfer disc"+ n  + " from " + src  + " to " +  desti);

      towerOfHanoi(n-1 ,helper,src, desti);
     }
   

     public static void recursiveReverseString(String str, int idx,String nstr){
        if (idx == str.length()) {
            System.out.println(nstr);
            return;
        }

        nstr = str.charAt(idx) + nstr;
        recursiveReverseString(str, idx+1,nstr);
     }

        public static int first = -1;
        public static int last = -1;
     public static void recursiveFirstandLastOccurance(String str,int idx,char c){
        if (str.length()== idx) {
            System.out.println("First Occurance : " + first);
            System.out.println("Last Occurance : " + last);
            return;
        }
        if (str.charAt(idx) == c) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }
        recursiveFirstandLastOccurance(str, idx+1,c);
     }

     public static void recursiveSortedarryCheckStrictlyInc(int [] arr, int idx){
        if (idx == arr.length-1) {
            System.out.println("sorted");
            return;
        }

        if (arr[idx]>= arr[idx+1]) {
            System.out.println("not sorted");
            return;
        }
        recursiveSortedarryCheckStrictlyInc(arr,idx +1);
     }

    
     public static void recursiveWayToMoveAllXToTheEnd(String str,int idx , int count,String nstr){
        if (idx == str.length()) {
            for (int i = 0; i < count; i++) {
                nstr += 'x';
            }
            System.out.println(nstr);
            return;
        }

        if (str.charAt(idx)=='x') {
           count++;
        } else {
            nstr = nstr + str.charAt(idx);
        }
        recursiveWayToMoveAllXToTheEnd(str, idx+1, count, nstr);
     }

     static boolean [] map = new boolean[256];
     
     public static void recursiveRemoveDuplicates(String str ,int idx, String nstr ){
        if (idx == str.length()) {
            System.out.println(nstr);
            return;
        }
        if (!map[str.charAt(idx)]) {
            nstr +=str.charAt(idx);
            map[str.charAt(idx)] = true;
        }
        recursiveRemoveDuplicates(str , idx+1 ,nstr);
        
     }
     public static void subsequences(String str, int idx, String nstr){
        if (idx == str.length()) {
            System.out.println(nstr);
            return;
        }
        char c = str.charAt(idx);
        subsequences(str, idx+1, nstr + c);

        subsequences(str, idx+1, nstr);
     }

     public static void uniqueSubsequences(String str, int idx, String nstr,HashSet<String> set){
        if (idx == str.length()) {
            if (set.contains(nstr)) {
                return;
            } else {
                System.out.println(nstr);
                set.add(nstr);
                return;
            }
        }
        char c = str.charAt(idx);
        uniqueSubsequences(str, idx+1, nstr + c, set);

        uniqueSubsequences(str, idx+1, nstr,set);
     }

     public static void permutation(String str, String prefix){
        if (str.length() == 0) {
            System.out.println(prefix);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
           String rem = str.substring(0,i) + str.substring(i+1);
           permutation(rem, prefix + str.charAt(i)); 
        }
     }

     public static void main(String[] args) {
      int a = 5 , b =6;

      String str = "radhe radhe";
      String str1 = "radhe";
      String str2 = "ABC";

      int[] arr1 = {1,2,3,4,5,6,7,8};
      int[] arr2 = {1,2,3,3,4,5,6,7,8};
      int[] arr3 = {1,3,2,4,5,6,7,8};

      String strX = "raxxdxxhexxx radxxhexx ";


       //RECURSION QUESTIONS
      System.out.println("\033[0;1m" +"Recursive function to print number in desending order" + "\033[0;0m");
      numberInReverseOrder(a);
      System.out.println();


      System.out.println("\033[0;1m" +"Recursive function to print number in ascending  order" + "\033[0;0m");
      numberInorder(a);
      System.out.println();

      System.out.println("\033[0;1m" +"Recursive function to print sum of \"n\" Natural Numbers " + "\033[0;0m");
      System.out.println(sumOfNaturalNumbers(a));
      System.out.println();

      System.out.println("\033[0;1m" +"Recursive function to print factorial of the number \"n\" " + "\033[0;0m");
      System.out.println(recuriveFactorial(a));
      System.out.println();

      System.out.println("\033[0;1m" +"Recursive fibonacci till  \"nth \" term " + "\033[0;0m");
      int firstt = 0;
      int second =1;
      recursiveFibonacci(a, firstt, second);
      System.out.println();


      System.out.println("\033[0;1m" +"Recursive print \"a\" to the pwoer \"b\" " + "\033[0;0m");
      System.out.println(recursivePower(a, b));
      System.out.println();

      System.out.println("\033[0;1m" +"Recursive print \"a\" to the pwoer \"b\" [stach height = log b] " + "\033[0;0m");
      System.out.println(recursivePowerLog(a , b));
      System.out.println();

      System.out.println("\033[0;1m" +"tower of Hanoi" + "\033[0;0m");
     towerOfHanoi(a, "S", "H", "D");
      System.out.println();

      System.out.println("\033[0;1m" +"Recursive Reverse String " + "\033[0;0m");
      recursiveReverseString(str, 0, " ");
      System.out.println();


      System.out.println("\033[0;1m" +"Recursive first and last Occurance in String " + "\033[0;0m");
      recursiveFirstandLastOccurance(str, 0, 'r');
        System.out.println();

      System.out.println("\033[0;1m" +"Recursive way to check if an array is sorted " + "\033[0;0m");   

      recursiveSortedarryCheckStrictlyInc(arr1, 0);
      recursiveSortedarryCheckStrictlyInc(arr2, 0);
      recursiveSortedarryCheckStrictlyInc(arr3, 0);
      System.out.println();

      System.out.println("\033[0;1m" +"Recursive way to move all \"x\" to the end of the string" + "\033[0;0m");  
      recursiveWayToMoveAllXToTheEnd(strX, 0, 0, " ");
      System.out.println();


    System.out.println("\033[0;1m" +"Recursive way to remove duplicates from a string" + "\033[0;0m"); 
      recursiveRemoveDuplicates(str, 0, " ");
      System.out.println();


    System.out.println("\033[0;1m" +"Recursive way to print susequences" + "\033[0;0m"); 
    subsequences(str2, 0, " ");
    System.out.println();

    System.out.println("\033[0;1m" +"Recursive way to print Unique Susequences" + "\033[0;0m"); 
    HashSet<String> set = new HashSet<>();
    uniqueSubsequences(str1, 0, " ", set); 

    System.out.println("\033[0;1m" +"Recursive way to print permutations of a String" + "\033[0;0m"); 
    permutation(str2, " ");
    System.out.println();

    System.out.println();
     }

   
}
