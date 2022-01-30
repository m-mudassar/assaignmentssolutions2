// Given an input n,
// count the total number of digit 1
// appearing in all non-negative integers less than or equal to n.
// Given n = 13,
// Return 6, because digit 1 occurred in the following numbers: 1, 10, 11, 12, 13.

public class solution4 {
    public static void main(String[] args) {
        System.out.println("Returned value is: " + findOne(new int[] { 1, 10, 11, 12, 13 }));
    }

    public static int findOne(int arr[]) {
        // variable for keeping track of appearance of 1
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            // getting a value from index
            int n = arr[i];
            // converting that element to a string
            String tempString = String.valueOf(n);
            for (int j = 0; j < tempString.length(); j++) {
                // getting single character from the element string 
                // and checking it if it is 1 or not
                if (tempString.charAt(j) == '1') {
                    count++;
                }
            }
        }
        return count;
    }
}