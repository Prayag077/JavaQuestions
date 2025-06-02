
import java.util.HashSet;



public class Arrays {
    public static void commonElementsBetw2Arrays(int [] arr1 , int [] arr2){

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> commonSet = new HashSet<>();


        for (int i : arr1) {
            set1.add(i);
        }

        for (int i  : arr2) {
            if (set1.contains(i)) {
                commonSet.add(i);
            }
        }
        System.out.println(commonSet);
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};


        System.out.println("\033[0;1m" + "Find common elements between two arrays"  + "\033[0;0m");
        commonElementsBetw2Arrays(array1, array2);
    }
}
