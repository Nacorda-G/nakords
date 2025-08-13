
package AirFare;
import java.util.Scanner;

public class airFare {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
           
        float dfare;
       
        System.out.print("Distance (km): ");
        int dis = sc.nextInt();
        System.out.print("Class: ");
        int cls = sc.nextInt();
        
        switch(cls){
            case 1: 
               float cls1;
               cls1 = dis*250;
               dfare = cls1 - (cls1 * 0.10f);
               if(dis > 1000){
                   System.out.println("Total fare: " +dfare);
               }else{
                   System.out.println("Total fare: " +cls1);
               }
            break;
            case 2: 
               float cls2;
               cls2 = dis * 500;
               dfare = cls2 - (cls2 * 0.10f);
               if(dis > 1000){
                   System.out.println("Total fare: " +dfare);
               }else{
                   System.out.println("Total fare: " +cls2);
               }
            break;
        }
        
        
        
    }
}
