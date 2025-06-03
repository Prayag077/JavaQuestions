public class Sorting {


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



    //QUICK SORT

    public static int partition(int [] arr ,int low ,int high){
        int pivot = arr[high];
        int i = low -1;

        for (int j = low; j < high; j++) {
            if (pivot > arr[j]) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] =temp;

        return i;

    }

    public static void quicSort(int [] arr , int low , int high){

        

        if (low<high) {
        
            int pidx  = partition(arr, low, high);

            quicSort(arr, low,pidx-1 );
            quicSort(arr, pidx+1 , high);
        }
        
    }


    //MERGE SORT
    public static void conqure(int arr[] , int si ,int mid ,int ei){

        int merged [] = new int [ei -si+1];
        int idx1 = si;
        int idx2 = mid+1;
        int x = 0;

        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] < arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }

        while (idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }

        while (idx2 <= ei) {
            merged[x++] = arr[idx2++];
        }

        for (int i = 0, j = si; i < merged.length; i++ , j++) {
            arr[j] = merged[i];
        }
    }    

    public static void divide(int arr [] , int si , int ei){

        if (si >= ei) {
            return;
        }

        int mid = si + (ei -si)/2;

        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        conqure(arr, si , mid ,ei);
    }
    
    
    

    

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5,4,6,22,77,23};

        System.out.println("\033[0;1m" + "Bubble Sort"  + "\033[0;0m");
        bubbleSort(array1);
        System.out.println();
        

        System.out.println("\033[0;1m" + "Selection Sort"  + "\033[0;0m");
        selectionSort(array1);
        System.out.println();
        

        System.out.println("\033[0;1m" + "Insertion Sort"  + "\033[0;0m");
        insertionSort(array1);
        System.out.println();

        System.out.println("\033[0;1m" + "Quick Sort"  + "\033[0;0m");
        int n = array1.length;
        quicSort(array1, 0, n-1);
        printArr(array1);
        System.out.println();


        System.out.println("\033[0;1m" + "Merge Sort"  + "\033[0;0m");
        divide(array1, 0, array1.length-1);
        printArr(array1);

        
        


    }

    


}
