package course.me;

public class Arrays {

    public static void main(String[] args) {

        int[] arr = {5,22,44,67,8,87,56,43,2};
    //1. Reverse order of an array of unordered integers.
        System.out.println(java.util.Arrays.toString(java.util.Arrays.stream(new Arrays().reverseAnArrayWithExtraSpace(arr)).toArray()));
        System.out.println(java.util.Arrays.toString(java.util.Arrays.stream(new Arrays().reverseAnArrayWithNoExtraSpace(arr)).toArray()));


//        int[][] matrix1 = {{10,11,12},{13,14,15},{16,17,18}};
//        int[][] matrix2 = {{10,11,12},{13,14,15},{16,17,18}};
        int[][] matrix1 = {{10,11,12,13},{14,15,16,17},{18,19,20,21},{22,23,24,25}};
        int[][] matrix2 = {{10,11,12,13},{14,15,16,17},{18,19,20,21},{22,23,24,25}};
        int[][] matrix3 = {{10,11,12,13},{14,15,16,17},{18,19,20,21},{22,23,24,25}};
//        int[][] matrix1 = {{10,11,12,13,14},{15,16,17,18,19},{20,21,22,23,24},{25,26,27,28,29},{30,31,32,33,34}};
//        int[][] matrix2 = {{10,11,12,13,14},{15,16,17,18,19},{20,21,22,23,24},{25,26,27,28,29},{30,31,32,33,34}};
    //2. Rotate an (n x n) matrix 90 degrees right in place.

        System.out.println("***Initial Matrix***");
        java.util.Arrays.stream(matrix1).forEach(a -> {
            java.util.Arrays.stream(a).forEach(n -> {
                System.out.print(n + " ");
            });
            System.out.println();
        });

        int[][] rotatedMatrixWithExtraSpace = new Arrays().rotateAnMatrix90DegreesRightInPlaceWithExtraSpace(matrix1);
        System.out.println("***Rotated Matrix Using Extra Space***");
        java.util.Arrays.stream(rotatedMatrixWithExtraSpace).forEach(a -> {
            java.util.Arrays.stream(a).forEach(n -> {
                System.out.print(n + " ");
            });
            System.out.println();
        });

        int[][] rotatedMatrixWithNoExtraSpace = new Arrays().rotateAnMatrix90DegreesRightInPlaceWithNoExtraSpace(matrix2);
        System.out.println("***Rotated Matrix Without using Extra Space***");
        java.util.Arrays.stream(rotatedMatrixWithNoExtraSpace).forEach(a -> {
            java.util.Arrays.stream(a).forEach(n -> {
                System.out.print(n + " ");
            });
            System.out.println();
        });

        int[][] rotatedMatrixWithNoExtraSpace2 = new Arrays().rotateAnMatrix90DegreesRightInPlaceWithNoExtraSpace2(matrix3);
        System.out.println("***Rotated Matrix Without using Extra Space***");
        java.util.Arrays.stream(rotatedMatrixWithNoExtraSpace2).forEach(a -> {
            java.util.Arrays.stream(a).forEach(n -> {
                System.out.print(n + " ");
            });
            System.out.println();
        });

    }

    public int[][] rotateAnMatrix90DegreesRightInPlaceWithExtraSpace(int[][] matrix) {
        int[][] copyOfMatrix = java.util.Arrays.stream(matrix).map(int[]::clone).toArray(int[][]::new);
        for (int i = 0 ; i < matrix.length ; i++) {
            for (int j = 0 ; j < matrix[i].length ; j++) {
                matrix[i][matrix[i].length-(j+1)] = copyOfMatrix[j][i];
            }
        }
        return matrix;
    }

    public int[][] rotateAnMatrix90DegreesRightInPlaceWithNoExtraSpace(int[][] matrix) {
        for(int i = 0; i < matrix.length/2; i++) {
            for(int j = i ; j < matrix.length-1-i ; j++) {
                int coord1 = matrix[i][j];
                int coord2 = matrix[j][matrix.length-1-i];
                int coord3 = matrix[matrix.length-1-i][matrix.length-1-j];
                int coord4 = matrix[matrix.length-1-j][i];

                matrix[i][j] = coord4;
                matrix[j][matrix.length-1-i] = coord1;
                matrix[matrix.length-1-i][matrix.length-1-j] = coord2;
                matrix[matrix.length-1-j][i] = coord3;
            }
        }
        return matrix;
    }

    public int[][] rotateAnMatrix90DegreesRightInPlaceWithNoExtraSpace2(int[][] matrix) {
        for(int i = 0; i < matrix.length/2; i++) {
            for(int j = i ; j < matrix.length-1-i ; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[matrix.length-1-j][i];
                matrix[matrix.length-1-j][i] = matrix[matrix.length-1-i][matrix.length-1-j];
                matrix[matrix.length-1-i][matrix.length-1-j] = matrix[j][matrix.length-1-i];
                matrix[j][matrix.length-1-i] = temp;
            }
        }
        return matrix;
    }

    public int[] reverseAnArrayWithExtraSpace(int[] arr) {
        int[] newArr = java.util.Arrays.stream(arr).toArray();
        for (int i = 0 ; i < arr.length ; i++) {
            newArr[i] = arr[arr.length - (i+1)];
        }
        return newArr;
    }

    public int[] reverseAnArrayWithNoExtraSpace(int[] arr) {
        for (int i = 0, k = arr.length-1 ; i < arr.length / 2; i++, k--) {
            int temp = arr[i];
            arr[i] = arr[k];
            arr[k] = temp;
        }
        return arr;
    }

}

