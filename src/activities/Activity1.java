
package activities;
import java.util.Scanner;

public class Activity1 {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String name;
        int subjects;
        float ave = 0;
        
        
        System.out.print("Enter students name: ");
        name = sc.nextLine();
        
        System.out.print("Enter number of subjects: ");
        subjects = sc.nextInt();
        
            for(int x = 0; x < subjects; x++){
                float grade;
                
                System.out.print("Enter grade for Sub: " +(x + 1)+ ":");
                    grade = sc.nextFloat();
                    ave += grade / subjects;
            }
           
        System.out.println("Average: "+ave);
       
        if (ave <=100 && ave >= 75){
            System.out.println("Remarks: Passed");
        }else{
            System.out.println("Remarks: Failed");
        }
        
        
    }
}
    

