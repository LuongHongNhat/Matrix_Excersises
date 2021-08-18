package onemount.com;

public class Excersises {

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
        int max = 0;
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

}
