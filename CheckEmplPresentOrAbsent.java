package Com.Demo.Day9;

import java.util.Scanner;

public class CheckEmplPresentOrAbsent {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value");
        int IS_FULL_TIME=1;
        int empCheck= sc.nextInt();
        if(empCheck==IS_FULL_TIME){
            System.out.println("Employee is present");
        }
        else{
            System.out.println("Employee is absent");
        }
        System.out.println();
    }
}
