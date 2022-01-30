
// Given an array, Rotate (shift left) an array of n elements to the right by k steps.
// For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] 
// is rotated to [5,6,7,1,2,3,4].
// After rotating the array add in into another array 
// and display array index with minumum value 
// if the sum of all the indexes having odd values is greater than 
// sum of all the indexes having even values 
// otherwise write all odd values in the text file 
// and create linked list of all odd values using pointers.
import java.io.File;
import java.io.FileWriter;
import java.util.LinkedList;

public class solution5 {
    public static void main(String[] args) {
        File file = new File("/oddNumbers.txt");
        int[] arr = { 1, 5, 6, 7, 3, 2, 4 };
        int k = 3;
        int n = arr.length;
        int[] arr2 = new int[n];
        int[] oddValues = new int[n];
        int[] sumValues = new int[n];
        int sumOdd = 0;
        int sumEven = 0;
        int minValue = 2147483647;
        LinkedList<Integer> oddList = new LinkedList<>();

        // shifting elements by k
        for (int i = 0; i < n; i++) {
            if (i + k < n) {
                arr2[i + k] = arr[i];
            } else {
                arr2[i + k - n] = arr[i];
            }
        }

        // finding the minimum value index
        for (int i = 0; i < n; i++) {
            // if element < minimum value
            // element = minimum
            // In this way we will find all minimum elements
            
            if (arr[i] < minValue){
                minValue = arr[i];
            }
        }

        // finding sum of all odd indexes and even indexes
        for (int i = 0; i < n; i++) {
            if (arr2[i] % 2 == 0) {
                sumValues[i] = arr2[i];
                sumEven += i;
            } else{
                oddValues[i] = arr2[i];
                sumOdd += i;
            }
        }

        // if sum of all odd indexes is greater than sum of all even indexes
        if(sumOdd > sumEven){
            for(int i=0; i<n; i++){
                if(arr2[i] == minValue){
                    System.out.println("Index containing minimum value is: " + i);
                }
            }
        } else{
            try {
                // writing all odd values in the text file
                FileWriter fileWriter = new FileWriter(file);
                for(int i=0; i<n; i++){
                    if(oddValues[i] != 0){
                        oddList.add(oddValues[i]);
                        fileWriter.write(oddValues[i] + " ");
                    }
                }

                fileWriter.close();
                // creating linked list of all odd values
                LinkedList<Integer> oddList2 = new LinkedList<>();
                for(int i=0; i<n; i++){
                    if(oddValues[i] != 0){
                        oddList2.add(oddValues[i]);
                    }
                }
                // printing all odd values
                System.out.println("All odd values are: " + oddList);
                System.out.println("All odd values are: " + oddList2);
            } catch (Exception e) {
                System.out.println("Exception occured: " + e);
            }
        }

    }
}
