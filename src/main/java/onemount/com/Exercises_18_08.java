package onemount.com;

public class Exercises_18_08 {

    public static void printMatrix(int[][] inputMatrix) {
        for (int i = 0, r = inputMatrix.length; i < r ; i++) {
            for (int j = 0, c = inputMatrix[0].length; j < c; j++) {
                System.out.format("%5d " , inputMatrix[i][j]);
            }
            System.out.println();
        }
    }

    public static int sumElements(int[][] inputMatrix) {
        int sum = 0;
        for (int i = 0, r = inputMatrix.length; i < r ; i++) {
            for (int j = 0, c = inputMatrix[0].length; j < c; j++) {
                sum += inputMatrix[i][j];
            }
        }
        return sum;
    }
    public static boolean findXInMatrix(int[][] inputMatrix, int x) {

        for (int i = 0, r = inputMatrix.length; i < r ; i++) {
            for (int j = 0, c = inputMatrix[0].length; j < c; j++) {
                if(inputMatrix[i][j] == x){
                    return true;
                }
            }
        }
        return false;
    }

    public static int findMaxInMatrix(int[][] inputMatrix) {
        int max = inputMatrix[0][0];
        for (int i = 0, r = inputMatrix.length; i < r ; i++) {
            for (int j = 0, c = inputMatrix[0].length; j < c; j++) {
                if(inputMatrix[i][j] > max){
                    max = inputMatrix[i][j];
                }
            }
        }
        return max;
    }

    public static boolean isContainPrimeNumber(int[][] inputMatrix) {
       for (int i = 0, r = inputMatrix.length; i < r ; i++) {
            for (int j = 0, c = inputMatrix[0].length; j < c; j++) {
                if(checkNguyenTo(inputMatrix[i][j]) == false){
                    return false;
                }
            }
        }
        return true;
    }

    public static  boolean checkNguyenTo(int n) {
        if(n<=2){
            return true;
        }else {
            for(int i =2;i<=Math.sqrt(n);i++){
                if(n % i == 0)
                    return false;
            }
        }
        return true;
    }

    public static int sumRowElements(int[][] inputMatrix, int row) {
        int sum = 0;
        if(row > inputMatrix.length - 1 || row < 0){
            sum = -1;
        }else{
            for (int j = 0, c = inputMatrix[0].length; j < c; j++) {
                sum += inputMatrix[row][j];
            }
        }
        return sum;
    }

    public static int sumColElements(int[][] inputMatrix, int col) {
        int sum = 0;
        int temp = inputMatrix[0].length;
        int temp1 = inputMatrix.length;
        if(col > inputMatrix[0].length - 1 || col < 0){
            sum = -1;
        }else {
            for (int i = 0, r = inputMatrix.length; i < r; i++) {
                sum += inputMatrix[i][col];
            }
        }
        return sum;
    }

    public static int sumMainCross(int[][] inputMatrix) {
        int sum = 0;
        for (int i = 0; i < inputMatrix.length; i++) {
            for (int j = 0; j < inputMatrix[0].length; j++) {
                if (i == j)
                    sum = sum + inputMatrix[i][j];
            }
        }
        return sum;
    }
    public static int sumSubCross(int[][] inputMatrix) {
        int sum = 0;
        for (int i = 0; i < inputMatrix.length; i++) {
            for (int j = 0; j < inputMatrix[0].length; j++) {
                if (i == inputMatrix[0].length - 1 - j)
                    sum = sum + inputMatrix[i][j];
            }
        }
        return sum;
    }

    public static int sumAHaftAboveOfMainCross(int[][] inputMatrix) {
        int sum = 0;
        for (int i = 0; i < inputMatrix.length; i++) {
            for (int j = 0; j < inputMatrix[0].length; j++) {
                if (i < j)
                    sum = sum + inputMatrix[i][j];
            }
        }
        return sum;
    }
    public static int sumAHaftBelowOfMainCross(int[][] inputMatrix) {
        int sum = 0;
        for (int i = 0; i < inputMatrix.length; i++) {
            for (int j = 0; j < inputMatrix[0].length; j++) {
                if (i > j)
                    sum = sum + inputMatrix[i][j];
            }
        }
        return sum;
    }

    public static int sumAHaftAboveOfSubCross(int[][] inputMatrix) {
        int sum = 0;
        for (int i = 0; i < inputMatrix.length; i++) {
            for (int j = 0; j < inputMatrix[0].length; j++) {
                if (i < inputMatrix[0].length - 1 - j)
                    sum = sum + inputMatrix[i][j];
            }
        }
        return sum;
    }
    public static int sumAHaftBelowOfSubCross(int[][] inputMatrix) {
        int sum = 0;
        for (int i = 0; i < inputMatrix.length; i++) {
            for (int j = 0; j < inputMatrix[0].length; j++) {
                if (i > inputMatrix[0].length - 1 - j)
                    sum = sum + inputMatrix[i][j];
            }
        }
        return sum;
    }


}
