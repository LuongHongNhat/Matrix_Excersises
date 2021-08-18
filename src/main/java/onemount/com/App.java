package onemount.com;

import java.util.Scanner;

public class App
{
    public static int[][] inputMatrix() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Số dòng : ");
        int r = sc.nextInt();
        System.out.println("Số cột: ");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.format("a[%d][%d] =  ", i,j);
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }
    public static int inputNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x number : ");
        int x = sc.nextInt();
        return x;
    }
    public static int[][] generateMatrix(int r, int c, int min, int max) {

        int[][] arr = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = (int) Math.floor(Math.random() * (max - min) + min);
            }
        }
        return arr;
    }

    public static void main( String[] args )
    {
//        int[][] inputStr = inputMatrix();
        int[][] inputStr = generateMatrix(4,4,1,10);

        // Bai_1
        Exercises_18_08.printMatrix(inputStr);
//        int x = inputNumber();
//        System.out.println("Sum input matrix : " + Excersises.sumElements(inputStr));
//        System.out.println("=============");

//        System.out.println("Matrix contains x is : " + Excersises.findXInMatrix(inputStr, x));
//        System.out.println("=============");

//        System.out.println("Max value in matrix is : " + Exercises_18_08.findMaxInMatrix(inputStr));
//        System.out.println("=============");

//        System.out.println("Matrix contains prime value is : " + Exercises_18_08.isContainPrimeNumber(inputStr));
//        System.out.println("=============");

//        Bài 4 a
//        int row = inputNumber();
//        System.out.println("Sum elements by row are : " + Exercises_18_08.sumRowElements(inputStr, row));
//        System.out.println("=============");

//        int col = inputNumber();
//        System.out.println("Sum elements by col are : " + Exercises_18_08.sumColElements(inputStr, col));
//        System.out.println("=============");

//        Bài 4 b
//        System.out.println("Sum elements main cross are : " + Exercises_18_08.sumMainCross(inputStr));
//        System.out.println("=============");

//        System.out.println("Sum elements sub cross are : " + Exercises_18_08.sumSubCross(inputStr));
//        System.out.println("=============");

//        Bài 4 c
//        System.out.println("Sum ele a haft above main cross are : " + Exercises_18_08.sumAHaftAboveOfMainCross(inputStr));
//        System.out.println("=============");

//        System.out.println("Sum ele a haft below main cross are : " + Exercises_18_08.sumAHaftBelowOfMainCross(inputStr));
//        System.out.println("=============");

//        Bài 4 d
//        System.out.println("Sum ele a haft above sub cross are : " + Exercises_18_08.sumAHaftAboveOfSubCross(inputStr));
//        System.out.println("=============");

        System.out.println("Sum ele a haft below sub cross are : " + Exercises_18_08.sumAHaftBelowOfSubCross(inputStr));
        System.out.println("=============");

    }
}
