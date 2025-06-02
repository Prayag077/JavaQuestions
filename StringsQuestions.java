
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StringsQuestions {
  
    public static void reverseString(String str){

        System.out.println("Before reverse : "  + str);

        String nstr = " ";
        
        for (int i = 0; i < str.length(); i++) {
            nstr = str.charAt(i) + nstr;
        }

        System.out.println("afrer reverse : "  + nstr);
    }

    public static void reverseEachWord(String str){

        String nstr = " ";
        for (String words : str.split(" ")) {
            String revWord = " " ;
            for (char c : words.toCharArray()) {
                revWord = c + revWord;
            }
            nstr = nstr + revWord;
        }
        System.out.println(nstr);
    }

    public static void findDuplicateCharacter(String str){

        HashMap<Character,Integer> dupeChar = new HashMap<>();
        
        for (char c : str.toCharArray()) {
            if (dupeChar.containsKey(c)) {
                dupeChar.put(c,dupeChar.get(c)+1 );
            } else {
                dupeChar.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> en : dupeChar.entrySet()) {
            if (en.getValue()>1) {
                System.out.println(en.getKey() + " : " + en.getValue());
            }
            
        }
        System.out.println();
        Set<Character> set = dupeChar.keySet();
    //ANOTHER WAY
        for (char c : set) {
            if (dupeChar.get(c)>1 ) {
                System.out.println(c + " : " + dupeChar.get(c));
            }
        }
    }

    public static void OccuranceOfEachChar(String str){

        HashMap<String,Integer> count = new HashMap<>();

        for (String s : str.split(" ")) {
            if (count.containsKey(s)) {
                count.put(s, count.get(s)+1);
            } else {
                count.put(s, 1);
            }
        }
        System.out.println(count.toString());   
    }

    public static void countNumberOfWOrds(String str){

        int words = str.split(" ").length;

        System.out.println("number of words in give String : " + words);
    }

    public static void permutation(String str , String prefix){
        if (str.length()==0) {
            System.out.println(prefix);
        }
        for (int i = 0; i < str.length(); i++) {
            String rem = str.substring(0,i) + str.substring(i+1);
            permutation(rem,prefix + str.charAt(i));
        }
    }

    public static void palindrome(String str){

        int first= 0;
        int last = str.length()-1;

        while (first < last) {
            if (str.charAt(first) !=str.charAt(last)) {
                System.out.println(str + " : Not a Palindrome");
                return;
            }
            first++;
            last--;
        }
        System.out.println(str + "is a Palindrome");
    }

    public static void anograms (String str1 , String str2){
        if (str1.length() != str2.length()) {
            System.out.println(str1 + " and " + str2 + " Not Anograms");
            return;
        }


        int [] arr = new int[126];
        for (int i = 0; i < str1.length(); i++) {
            
            arr[str1.charAt(i)]++;
            arr[str2.charAt(i)]--;
        }

        for (int i : arr) {
            if (i !=0) {
                System.out.println(str1 + " and " + str2 +" Not Anograms");
                return;
            }
        }
        System.out.println(str1 + " and " + str2 + " are Anograms");    
    }


    public static void countVowelsAndConsonants(String str){

        str = str.toLowerCase();

        int vowels = 0;
        int consonants = 0;

        for (char c : str.toCharArray()) {
            if (c == 'a' ||c == 'e' ||c == 'i' ||c == 'o' ||c == 'u') {
                vowels++;
            } else {
                consonants++;
            }
        }

        System.out.println("vowels : " + vowels  + " in " + str);
        System.out.println("consonants : " +  consonants);
    }

    public static void uniqueChar(String str){

        boolean [] unique = new boolean[126];

        for (char c : str.toCharArray()) {
            if (!unique[c]) {
                System.out.print(c);
                unique[c] = true;
            }
        }
        System.out.println();
    }


    public static void printEvenIndex(String str){

        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                System.out.print(str.charAt(i));
            }
        }
    }

    public static void removeSpace(String str){

        StringBuilder nstr = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (c !=' ') {
                nstr.append(c);
            }
        }
        System.out.println(nstr.toString());
    }

    public static void eachLetterTwice(String str){

        StringBuilder nstr = new StringBuilder();

        for (char c : str.toCharArray()) {
                nstr.append(c).append(c);
            
        }
        System.out.println(nstr.toString());
    }

    public static void swapTwoString(String str1 , String str2){

        System.out.println("Str 1 Before Swapping : " + str1);
        System.out.println("Str 2 Before Swapping : " + str2);
        System.out.println();
        str1 = str1 + str2;
        str2= str1.substring(0,str1.length() - str2.length());
        str1 = str1.substring(str2.length());

        System.out.println("Str 1 After Swapping : " + str1);
        System.out.println("Str 2 After Swapping : " + str2);
    }

    public static void countChar(String str){

        int count = 1;
        StringBuilder nstr = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            
            if ( i+1 < str.length() && str.charAt(i) == str.charAt(i+1)) {
                count++;
            } else {
                nstr.append(str.charAt(i)).append(count);
                count = 1;
            }
        }
        System.out.println(nstr.toString());
    }

    public static void upperLower(String str){

        StringBuilder lower = new StringBuilder();
        StringBuilder upper = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (Character.isLowerCase(c)) {
                lower.append(c);
            } else {
                upper.append(c);
            }
        }

        System.out.println("Lower case : " + lower);
        System.out.println("Upper case : " + upper);
    }

    public static void digitLetters(String str){

        StringBuilder digit = new StringBuilder();
        StringBuilder letter = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                digit.append(c);
            } else {
                letter.append(c);
            }
        }

        System.out.println("Lower case : " + digit);
        System.out.println("Upper case : " + letter);
    }

    public static void digitLettersInSameLine(String str){

        StringBuilder digit = new StringBuilder();
        StringBuilder letter = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                digit.append(c);
            } else {
                letter.append(c);
            }
        }

        System.out.println("RESULT : " + digit.append(letter));
        
    }


    public static void format(String str){

        System.out.println("BEFORE FORMAT : "+ str);
        long number = Long.parseLong(str);
        
            String format = String.format("%011d", number);

            System.out.println("AFTER FORMAT : " +format);
    }

    public static void longestWithoutRepeatingChar(String str){
        int start = 0;
        int end = 0;
        int minIndex = 0;

        HashSet<Character> set = new HashSet<>();
        

        for (int i = 0; i < str.length(); i++) {
            
            while (end < str.length()) {
                char c = str.charAt(end);
                if (!set.contains(c)) {
                    set.add(c);
                    minIndex = Math.max(minIndex, end - start + 1);
                    end++;
                } else {
                    set.remove(str.charAt(start));
                    start++;
                } 
            }
        }
        System.out.println("MIN INDEX : " +minIndex);
    }




  
  
  
  
    public static void main(String[] args) {

        String str = "shree radhe shree radhe shree radhe shree radhe radhe shree radhe";
        String str1 = "MALAYALAM";
        String str2 = "MALYAAMLA";
        String str3 = "RADHE radhe";

        System.out.println("String : " + str);
        System.out.println();

        System.out.println("\033[0;1m" +"Reverse a String" + "\033[0;0m");
        reverseString(str);
        System.out.println();

        System.out.println("\033[0;1m" +"Reverse Each word of a String" + "\033[0;0m");
        reverseEachWord(str);
        System.out.println();

        System.out.println("\033[0;1m" +"Find Duplicate Character in a String" + "\033[0;0m");
        findDuplicateCharacter(str);
        System.out.println();

        System.out.println("\033[0;1m" +"Occurance of Each Char" + "\033[0;0m");
        OccuranceOfEachChar(str);
        System.out.println();

        System.out.println("\033[0;1m" +"Count Number of Words in given String" + "\033[0;0m");
        countNumberOfWOrds(str);
        System.out.println();


        System.out.println("\033[0;1m" +"Permutations of a given String" + "\033[0;0m");
        permutation("ABC", " ");
        System.out.println();
       
        System.out.println("\033[0;1m" +"Check is the String is Plaindrome" + "\033[0;0m");
        palindrome(str1);
        palindrome(str);
        System.out.println();

        System.out.println("\033[0;1m" +"Check if two Strings are Anograms" + "\033[0;0m");
        anograms(str1, str2);
        anograms(str2, str);
        System.out.println();

        System.out.println("\033[0;1m" +"Count Vowels and Consonants in a given string " + "\033[0;0m");
        countVowelsAndConsonants(str);
        countVowelsAndConsonants(str1);
        countVowelsAndConsonants(str2);
        System.out.println();

        System.out.println("\033[0;1m" +" print unqiue characters  " + "\033[0;0m");
        uniqueChar(str);
        uniqueChar(str1);
        uniqueChar(str2);
        System.out.println();

        System.out.println("\033[0;1m" +" Print Even Index Char " + "\033[0;0m");
        printEvenIndex(str);
        System.out.println();
        System.out.println();

        System.out.println("\033[0;1m" +" Remove space from a given string " + "\033[0;0m");
        removeSpace(str);
        System.out.println();

        System.out.println("\033[0;1m" +" Print each Letter Twice " + "\033[0;0m");
        eachLetterTwice(str);
        System.out.println();

        System.out.println("\033[0;1m" +" Swap 2 string without using third variable " + "\033[0;0m");
        swapTwoString(str, str1);
        System.out.println();

        System.out.println("\033[0;1m" +" count duble character in a row " + "\033[0;0m");
        countChar(str);
        System.out.println();

        System.out.println("\033[0;1m" +" extract lower and upper case " + "\033[0;0m");
        upperLower(str3);
        System.out.println();

        System.out.println("\033[0;1m" +" extract digits and letters " + "\033[0;0m");
        digitLetters("FJAIJ0F93J9JF4N9N2F9");
        System.out.println();

        System.out.println("\033[0;1m" +"move all letters in the end"+ "\033[0;0m");
        digitLettersInSameLine("FJAIJF93J9JF4N9N2F9");
        System.out.println();

        System.out.println("\033[0;1m" +"format String number"+ "\033[0;0m");
        format("3240012");
        System.out.println();


        System.out.println("\033[0;1m" +"find longest without repeating character"+ "\033[0;0m");
        longestWithoutRepeatingChar(str);
        System.out.println();



        


















        








    }
}
