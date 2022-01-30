// A palindromic number reads the same both ways. 
// The largest palindrome made from the product of two 2-digit numbers
// is 9009 = 91 × 99.
// Find the largest palindromic number made from the product of 
// two 3-digit numbers.

public class solution16 {
    public static void main(String[] args) {
        int number = 0;
        int largestPalindrome = 0;

        for(int i=100; i<1000; i++){
            for(int j=100; j<1000; j++){
                number = i*j;
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(number));
                String orignal = stringBuilder.toString();
                String reversed = stringBuilder.reverse().toString();

                // if the number is a palindrome
                if(orignal.equals(reversed)){
                    // finding the largest palindrome
                    if(number > largestPalindrome){
                        largestPalindrome = number;
                    }
                }
            }
        }
        System.out.println("Largest palindrome from the product of 3-digit numbers is: " + largestPalindrome);
    }
}
