// Given a string containing just the characters '(' and ')',
// find the length of the largest and shortest valid(well-formed) parenthesis substring.
// For "(()", the longest valid parenthesis substring is "()", which has length = 2.
// Another example is ")()())", where the longest valid parenthesis substring is "()()", which has length = 4.

public class solution7 {
    public static void main(String[] args) {
        String str = ")()())";
        int longestValid = 0;
        for (int i=0; i<str.length(); i++){
            for(int j = i+1; j<str.length(); j++){
                if(str.charAt(i) == '(' && str.charAt(j) == ')'){
                    longestValid += 2;
                    // break the inner loop
                    // so that it won't loop through 
                    // the rest of the string
                    break;
                }
            }
        }

        System.out.println("Longest valid parenthesis substring is: " + longestValid);
    }
}
