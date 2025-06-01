
class Pattern {

    public static void solidRectangle(int a, int b){
      System.out.println("\033[0;1m" +"SOLID RECTANGLE" + "\033[0;0m");

      for (int i = 0; i < b; i++) {
          for (int j = 0; j < a; j++) {
              System.out.print("x ");
          }
          System.out.println();
      }
     }

     public static void hollowRectangle(int a, int b){
      System.out.println("\033[0;1m" +"HOLLOW RECTANGLE" + "\033[0;0m");

      for (int i = 0; i < b; i++) {
          for (int j = 0; j < a; j++) {
               if (j==0|| i == 0 || j == a-1|| i== b-1) {
                  System.out.print("x ");
               } else {
                  System.out.print("  ");
               }
          }
          System.out.println();
      }
     }

     public static void halfPyramid(int a){
      System.out.println("\033[0;1m" +"HALF PYRAMID" + "\033[0;0m");

      for (int i = 0; i < a; i++) {
          for (int j = 0; j < i+1; j++) {
               System.out.print("x ");
          }
          System.out.println();
      }
     }

     public static void invertedHalfPyramid(int a){
      System.out.println("\033[0;1m" +"INVERTED PYRAMID" + "\033[0;0m");
      for (int i = 0; i < a; i++) {
          for (int j = 0; j < a-i; j++) {
               System.out.print("x ");
          }
          System.out.println();
      }
     }

     public static void invertedRotatedHalfPyramid(int a){
      System.out.println("\033[0;1m" +"INVERTED ROTATED PYRAMID" + "\033[0;0m");
         for (int i = 1; i <=a; i++) {
          for (int j = 1; j <=a-i+1; j++) {
               System.out.print("  ");
          }

          for (int j = 1; j <=i; j++) {
              System.out.print("x ");
          }
          System.out.println();
      }
     }

     public static void halfPyramidWithNumbers(int a){
      System.out.println("\033[0;1m" +"HALF PYRAMID WITH NUMBERS" + "\033[0;0m");

      for (int i = 1; i <=a; i++) {
          for (int j = 1; j <=i; j++) {
               System.out.print(j + " ");
          }
          System.out.println();
      }
     }

     public static void invertedPyramidWithNumbers(int a){
      System.out.println("\033[0;1m" +"INVERTED PYRAMID WITH NUMBRES" + "\033[0;0m");

      for (int i = 1; i <=a; i++) {
          for (int j = 1; j <=a-i+1; j++) {
               System.out.print(j + " ");
          }
          System.out.println();
      }
     }

     public static void floydsTraingle (int a ){
      System.out.println("\033[0;1m" +"FLOYD'S TRAINGLE" + "\033[0;0m");
      int count = 1; 
      for (int i = 1; i <=a; i++) {
          for (int j = 1; j <=i; j++) {
               System.out.print(count++ + " ");
          }
          System.out.println();
      }
     }

     public static void zeroOneTraingle (int a){
      System.out.println("\033[0;1m" +"ZERO ONE TRAINGLE" + "\033[0;0m");
      for (int i = 1; i <=a; i++) {
          for (int j = 1; j <=i; j++) {
               if ((i+j)%2==0) {
                  System.out.print(1 + " ");
               } else {
                  System.out.print(0 + " ");
               }
          } 
          
          System.out.println();
      } 
     }

    
     public static void butterfly(int a ){
      
      System.out.println("\033[0;1m" +"BUTTERFLY" + "\033[0;0m");
      for (int i = 1; i <=a; i++) {
          for (int j = 1; j <=i; j++) {
               System.out.print("x ");
          } 

          for (int j = 1; j <=(a-i)*2; j++) {
              System.out.print("  ");
          }

          for (int j = 1; j <=i; j++) {
              System.out.print("x ");
          }
          
          System.out.println();
      }

      for (int i = a; i >=1; i--) {
          for (int j = 1; j <=i; j++) {
               System.out.print("x ");
          } 

          for (int j = 1; j <=(a-i)*2; j++) {
              System.out.print("  ");
          }

          for (int j = 1; j <=i; j++) {
              System.out.print("x ");
          }
          
          System.out.println();
      }
     }


     public static void solidRohmbus(int a){
      System.out.println("\033[0;1m" +"SOLID RHOMBUS" + "\033[0;0m");
      for (int i = 1; i <=a; i++) {
          for (int j = 1; j < a-i+1; j++) {
              System.out.print("  ");
          }

          for (int j = 1; j <=a; j++) {
              System.out.print("x ");
          }
          System.out.println();
      }
     }

     public static void numberPyramid(int a){
      System.out.println("\033[0;1m" +"NUMBER PYRAMID" + "\033[0;0m");

      for (int i = 1; i <=a; i++) {
          for (int j = 1; j < a-i+1; j++) {
              System.out.print("  ");
          }

          for (int j = 1; j <=i; j++) {
              System.out.print(i + "   ");
          }
          System.out.println();
      }
     }
     

     public static void palindromicPattern(int a){
      System.out.println("\033[0;1m" +"PALINDROMIC PATTERN" + "\033[0;0m");
      for (int i = 1; i <=a; i++) {
          for (int j = 1; j < a-i+1; j++) {
              System.out.print("  ");
          }

          for (int j = i; j >=1; j--) {
              System.out.print(j + " ");
          }

          for (int j = 2; j <= i; j++) {
              System.out.print(j + " ");
          }
          System.out.println();
      }
     }

     public static void diamondPattern(int a){
      System.out.println("\033[0;1m" +"DIAMOND PATTERN" + "\033[0;0m");
      for (int i = 1; i <=a; i++) {
          for (int j = 1; j < a-i+1; j++) {
              System.out.print("  ");
          }

          for (int j = 1; j<=2*i-1 ; j++) {
              System.out.print("x ");
          }

          System.out.println();
      }
      for (int i = a; i >=1; i--) {
          for (int j = 1; j < a-i+1; j++) {
              System.out.print("  ");
          }

          for (int j = 1; j<=2*i-1 ; j++) {
              System.out.print("x ");
          }

          System.out.println();
      }
     }
     public static void main(String[] args) {

    int a = 5 , b =6;

        //PATTERN QUESTIONS 
      System.out.println("\033[0;4m" +"PATTERN QUESTIONS" + "\033[0;0m");
      solidRectangle(a, b);
      System.out.println();
      
      hollowRectangle(a, b);
      System.out.println();

      halfPyramid(a);
      System.out.println();

      invertedHalfPyramid(a);
      System.out.println();

      invertedRotatedHalfPyramid(a);
      System.out.println();

      halfPyramidWithNumbers(a);
      System.out.println();

      invertedPyramidWithNumbers(a);
      System.out.println();

      floydsTraingle(a);
      System.out.println();

      zeroOneTraingle(a);
      System.out.println();

      System.out.println("\033[0;4m" +"PATTERN ADVANCED QUESTIONS" + "\033[0;0m");

      butterfly(a);
      System.out.println();

      solidRohmbus(a);
      System.out.println();

      numberPyramid(a);
      System.out.println();

      palindromicPattern(a);
      System.out.println();

      diamondPattern(a);
      System.out.println();
        //checking git hub is working or not second time
      
     }

   
}