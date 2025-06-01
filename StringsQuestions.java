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


  
  
  
  
    public static void main(String[] args) {

        String str = "shree radhe shree radhe radhe shree radhe";
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
        








    }
}
