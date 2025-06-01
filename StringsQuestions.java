import java.util.HashMap;
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

        Set<Character> set = dupeChar.keySet();

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

  
  
  
  
    public static void main(String[] args) {

        String str = "shree radhe shree radhe shree radhe shree radhe radhe shree radhe";
        String str1 = "MALAYALAM";
        String str2 = "MALYAAMLA";

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
        //gitCheck









        








    }
}
