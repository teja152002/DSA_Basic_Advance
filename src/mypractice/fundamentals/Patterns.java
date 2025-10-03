package mypractice.fundamentals;

import java.util.Scanner;

public class Patterns {

    private static void square(int n){
        for(int i=0; i<n;i++) {
            for(int j =0;j<n;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void rightAngle(int n){
        for(int i=0; i<n;i++) {
            for(int j=0; j<n;j++){
                if(i>=j){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    private static void reverseRightAngle(int n){
        for(int i=0; i<n;i++) {
            for(int j=0; j<n;j++){
                if(i<=j){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    private static void numericRightAngle(int n){
        for(int i=0; i<n;i++) {
            for(int j=0; j<n;j++){
                if(i>=j){
                    System.out.print((j+1) + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    private static void mirrorRightAngle(int n){
        for(int i=0; i<n;i++) {
            for(int j=0; j<n;j++){
                if(i+j<=n-1){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    private static void triangle(int n){
        for(int i=0; i<n;i++) {
            for(int j=0; j<n;j++){
                if(i>=j){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        triangle(n);
    }
}
