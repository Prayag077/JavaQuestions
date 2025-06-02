

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;



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

    public static void firstAndLastElementOfAnArrayList(ArrayList<String> list){

        if (!list.isEmpty()) {
            System.out.println("First Element : " +list.get(0));
            System.out.println("Last Element : "+ list.get(list.size()-1));
        } else {
            System.out.println("list is empty");
        }
    }

    public static void printArr(int []arr){

        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void bubbleSort(int [] arr){

        for (int i = 0; i < arr.length-1; i++) {

            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;

                }
            }
        }
        printArr(arr);
    }

    public static void selectionSort(int [] arr){

        for (int i = 0; i < arr.length -1; i++) {
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[minIndex]>arr[j]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        printArr(arr);
    }

    public static void insertionSort(int [] arr){

        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i-1;
            while (current < arr[j] ) {
                arr[j+1] = arr[j];
            }
            arr[j+1] = current;
        }
        printArr(arr);
    }

    public static void removeDuplicates(int [] arr){

        HashSet<Integer> unique = new HashSet<>();
        
        for (int i : arr) {
            unique.add(i);
        }

        int [] result = new int [unique.size()];
        int count = 0;
        for (int i : unique) {
            result[count] = i;
            count++;
        }

        printArr(result);
    }

    public static void removeDuplicatesFromAnArrayList(ArrayList <Integer> list){

        HashSet<Integer> result = new HashSet<>(list);

        ArrayList <Integer> uniqueList = new ArrayList<>(result);

        System.out.println(uniqueList);
    }

    public static void missingNumber(int [] arr){
        int n = arr.length+1;
        int totalSum = n*(n+1)/2;
        int sum = 0;

        for (int i : arr) {
            sum +=i;
        }
        System.out.print("Missing Number :  ");
        System.out.println(totalSum - sum);
    }

    public static void smallestAndLargestElement(int [] arr){

        int smallest = arr[0];
        int largest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (smallest > arr[i]) {
                smallest = arr[i];
            }
            if (largest< arr[i]) {
                largest = arr[i];
            }
        }
        System.out.println("Smallest : " + smallest);
        System.out.println("Largest : " + largest);

    }

    public static void serchElement(int [] arr , Integer target){
        int count = 0;
        for (int i  :arr) {
            
            count++;
            if (i == target) {
                System.out.println( "index : "+count);
                
                return;
            }
        }
        System.out.println("value in not in the array");
    }

    public static void sumOnlyIntegers(String [] arr){

        int sum = 0;

        for (String i : arr) {
            try {
                sum += Integer.parseInt(i);
            } catch (NumberFormatException e) {
            }
        }
    
        System.out.println("sum : " + sum);
    }

    public static void minAndMax (int []arr){

        int min = arr[0];
        int max = arr[0];

        if (arr.length==0) {
            throw new IllegalArgumentException("\"Array must not be empty");
        }
            
            for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
            if (max< arr[i]) {
                max = arr[i];
            }
        
        System.out.println("Smallest : " + min);
        System.out.println("Largest : " + max);
        }
    }

    public static void countOddEven(int [] arr){

        int odd = 0;
        int even = 0;
        for (int i  : arr) {
            if (i%2==0) {
                odd++;
            } else {
                even++;
            }
        }

        System.out.println("odd count : " + odd);
        System.out.println("even count : " + even);
    }

    public static void findNonRepeatedElements(int [] arr){

        HashMap<Integer,Integer> countNum = new HashMap<>();

        for (int i : arr) {
            countNum.put(i, countNum.getOrDefault(i, 0)+1);
            }

            for (Map.Entry<Integer, Integer> en : countNum.entrySet()) {
                if (en.getValue()==1) {
                    System.out.print(en.getKey() + " ");
                }
                
            }
            System.out.println();
        }


    public static void reverseAnArray(int [] arr){
        int first = 0;
        int last = arr.length-1;

        while (first < last) {
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;

            first++;
            last--;
        }

        printArr(arr);
    }   

        

        
    



    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5,4,6,22,77,23};
        int[] array2 = {4, 5, 6, 7, 8};

        
        ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add("Apple");
            arrayList.add("Banana");
            arrayList.add("Cherry");
            arrayList.add("Date");
            arrayList.add("Elderberry");


        System.out.println("\033[0;1m" + "Find common elements between two arrays"  + "\033[0;0m");
        commonElementsBetw2Arrays(array1, array2);
        System.out.println();

        System.out.println("\033[0;1m" + "Find first and last element of Arraylist"  + "\033[0;0m");
        firstAndLastElementOfAnArrayList(arrayList);
        System.out.println();

        System.out.println("\033[0;1m" + "Bubble Sort"  + "\033[0;0m");
        bubbleSort(array1);
        System.out.println();
        

        System.out.println("\033[0;1m" + "Selection Sort"  + "\033[0;0m");
        selectionSort(array1);
        System.out.println();
        

        System.out.println("\033[0;1m" + "Insertion Sort"  + "\033[0;0m");
        insertionSort(array1);
        System.out.println();
        

        System.out.println("\033[0;1m" + "Remove duplicates from an Array"  + "\033[0;0m");
        removeDuplicates(array1);
        System.out.println();
        


        System.out.println("\033[0;1m" + "Remove duplicates from an ArrayList"  + "\033[0;0m");

        ArrayList<Integer> list = new ArrayList<>();
                list.add(5);
                list.add(2);
                list.add(9);
                list.add(1);
                list.add(6);
                list.add(2);
                list.add(5);

        removeDuplicatesFromAnArrayList(list);
        System.out.println();


        System.out.println("\033[0;1m" + "Find the missing number in an Array"  + "\033[0;0m");
        int[] array = {1, 2, 4, 5, 6}; 

        missingNumber(array);
        System.out.println();


        System.out.println("\033[0;1m" + "Find the largest and smallest element in an Array"  + "\033[0;0m");
        smallestAndLargestElement(array1);
        System.out.println();

        System.out.println("\033[0;1m" +"Search element in an Array"+ "\033[0;1m");
        serchElement(array1, 77);
        System.out.println();


        System.out.println( "\033[0;1m" +"Array consists of integers and special characters,sum only integers" + "\033[0;1m");
        String[] arrayStr = {"5", "2", "9", "a", "1", "6", "#", "3"};
        sumOnlyIntegers(arrayStr);
        System.out.println();

        System.out.println("\033[0;1m" + "Find Minimum and Maximum from an Array" + "\033[0;1m" );
        minAndMax(array1);
        System.out.println();


        System.out.println("\033[0;1m" + "Java program to count Odd and Even number from given array" + "\033[0;1m" );
        countOddEven(array1);
        System.out.println();

        System.out.println("\033[0;1m" + "Java program – input array was given [ 1,1,2,2,3,4,5,5,6,6], Output [3,4]" + "\033[0;1m");
        int [] arr4 = {1,1,2,2,3,4,5,5,6,6};
        findNonRepeatedElements(arr4);

        System.out.println("\033[0;1m" + "Reverse an Array" + "\033[0;1m");
        reverseAnArray(arr4);
    }
}
