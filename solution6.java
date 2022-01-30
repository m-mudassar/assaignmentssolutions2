// You are given an n*n 2D matrix representing and image.
// Rotate the image by 180 degrees (anti-clockwise).
// but after sorting the n*n 2D array.

public class solution6 {
    public static void main(String[] args) {
        int[][] matrix = {
            {2 , 1, 3},
            {4 , 5, 6},
            {8 , 7, 9}
        };

        int length = matrix.length;
        int[][] rotatedMatrix90 = new int[length][length];
        int[][] rotatedMatrix180 = new int[length][length];

        // sorting the array first
        for(int k=0; k<length; k++){
            for(int i=0; i < matrix[k].length; i++){
                for(int j=0; j < matrix[k].length; j++){
                    if(matrix[k][i] < matrix[k][j]){
                        int temp = matrix[k][i];
                        matrix[k][i] = matrix[k][j];
                        matrix[k][j] = temp;
                    }
                }
            }
        }

        // rotating the matrix by 90 degrees
        for(int i = 0; i < length; i++){
            for(int j = 0; j < length; j++){
                rotatedMatrix90[i][j] = matrix[length - j - 1][i];
            }
        }

        // rotating the matrix by 180 degrees
        for(int i = 0; i < length; i++){
            for(int j = 0; j < length; j++){
                rotatedMatrix180[i][j] = rotatedMatrix90[length - j - 1][i];
            }
        }


        // printing the matrix without rotation
        System.out.println("\n==================== Before rotating 180 degrees ====================");
        for(int i = 0; i < length; i++){
            for(int j = 0; j < length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // printing the rotated matrix
        System.out.println("\n==================== After rotating 180 degrees ====================");
        for(int i = 0; i < length; i++){
            for(int j = 0; j < length; j++){
                System.out.print(rotatedMatrix180[i][j] + " ");
            }
            System.out.println();
        }
    }
}
