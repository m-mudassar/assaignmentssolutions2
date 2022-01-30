// A 3x3 normal magic square is a 3x3 grid where the numbers on each row,
// each column, and both diagonals all add up to the same number, 
// and the square contains the numbers 1 to 9 exactly. 
// 4 9 2
// 3 5 7
// 8 1 6
// Implement a function which, given a two-dimensional 3 by 3 array of ints 
// returns a Boolean that tells us if the given square (represented by the array) 
// is a normal 3 by 3 magic square or not.
public class solution12 {
    public static void main(String[] args) {
        int[][] matrix = {
                { 4, 9, 2 },
                { 3, 5, 7 },
                { 8, 1, 6 }
        };

        System.out.println("Does the given 3*3 matrix magic? " + isMagic(matrix));
    }

    public static boolean isMagic(int[][] matrix){
        int firstDiagonalSum = matrix[0][0] + matrix[1][1] + matrix[2][2];
        int secondDiagonalSum = matrix[0][2] + matrix[1][1] + matrix[2][0];

        int firstRowSum = matrix[0][0] + matrix[0][1] + matrix[0][2];
        int secondRowSum = matrix[1][0] + matrix[1][1] + matrix[1][2];
        int thirdRowSum = matrix[2][0] + matrix[2][1] + matrix[2][2];

        int firstColumnSum = matrix[0][0] + matrix[1][0] + matrix[2][0];
        int secondColumnSum = matrix[0][1] + matrix[1][1] + matrix[2][1];
        int thirdColumnSum = matrix[0][2] + matrix[1][2] + matrix[2][2];

        if(firstDiagonalSum == secondDiagonalSum &&
        secondDiagonalSum == firstRowSum &&
        firstRowSum == secondRowSum &&
        secondRowSum == thirdRowSum &&
        thirdRowSum == firstColumnSum &&
        firstColumnSum == secondColumnSum &&
        secondColumnSum == thirdColumnSum){
            return true;
        }
        return false;
    }
}
