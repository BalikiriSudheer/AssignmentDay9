package Com.Demo.Day9;

import java.util.Scanner;

public class CalEmpWage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value");
        int IS_FULL_TIME=1;
        int EMP_RATE_PER_HOUR=20;
        int empHrs=0;
        int empwages=0;
        int empcheck= sc.nextInt();
        if(empcheck==IS_FULL_TIME){
            empHrs=8;
        }
        else {
            empHrs=0;
        }
        empwages=empHrs* EMP_RATE_PER_HOUR;
        System.out.println("Employee wages is"+empwages);
        System.out.println();
    }
}
