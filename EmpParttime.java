package Com.Demo.Day9;

import java.util.Scanner;

public class EmpParttime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the values");
        int ITS_PART_TIME=1;
        int ITS_FULL_TIME=2;
        int EMP_RATE_PERHOUR=20;
        int empwage=0;
        int empHrs=0;
        int empcheck=sc.nextInt();
        if(empcheck==ITS_PART_TIME){
            empHrs=4;
        } else if (empcheck==ITS_FULL_TIME) {
            empHrs=8;

        }
        else {
            empHrs=0;
        }
        empwage=empHrs*EMP_RATE_PERHOUR;
        System.out.println("Emp wages"+empwage);

    }
}
