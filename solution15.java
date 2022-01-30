// Given a list of 100 values,
// write a program which should display the largest possible sum
// out of 100 values
public class solution15 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i<=100; i++){
            sum += i;   
        }
        System.out.println("The largest possible sum is: "+sum);
    }
}
