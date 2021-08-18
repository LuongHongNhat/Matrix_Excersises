package onemount.com;

import java.util.Scanner;

import static onemount.com.Excersises.*;

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
        int[][] inputStr = generateMatrix(3,4,1,10);

        // Bai_1
        Excersises.printMatrix(inputStr);
//        int x = inputNumber();
//        System.out.println("Sum input matrix : " + Excersises.sumElements(inputStr));
//        System.out.println("=============");

//        System.out.println("Matrix contains x is : " + Excersises.findXInMatrix(inputStr, x));
//        System.out.println("=============");

        System.out.println("Matrix contains x is : " + Excersises.isContainPrimeNumber(inputStr));
        System.out.println("=============");

//        System.out.println("Matrix contains x is : " + Excersises.findMaxInMatrix(inputStr));
//        System.out.println("=============");


    }
}
