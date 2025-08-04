
package activities;

import java.util.Scanner;

public class Activity2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter employee name: ");
        String ename = sc.nextLine();
        System.out.print("Enter hourly rate: ");
        float hrate = sc.nextFloat();
        System.out.print("Enter total hours worked: ");
        float hrs = sc.nextFloat();
        
        System.out.println("------------Wage Summary--------------");
        System.out.println("Employee: " +ename);
        System.out.println("Hourly Rate: ₱" +hrate);
        System.out.println("Hours Worked: " +hrs);
        System.out.println("Gross Weekly Wage: ₱" +(hrs*hrate));
        System.out.printf("SSS Contribution(10%%): ₱%.2f\n", (hrs*hrate)*0.1);
        System.out.println("--------------------------------------");
        System.out.printf("Net Weekly Wage: ₱%.2f\n\n", ((hrs*hrate)-((hrs*hrate)*0.1)));
        
        
    }
}
