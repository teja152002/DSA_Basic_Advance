package mypractice.oops;

import java.util.Scanner;

public class AgeValidator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age to validate : ");
        int age = sc.nextInt();
        if(age >= 21){
            System.out.println("Eligible to get job");
        } else {
            try{
               throw new AgeInvalidException("Not Eligible!");
            } catch (AgeInvalidException e){
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
    }
}
