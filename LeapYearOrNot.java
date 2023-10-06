
package udemy;

import java.util.Scanner;
public class LeapYearOrNot {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("It is a Leap Year");
                }
                else{
                    System.out.println("Not a leap Year");
                }
            }
            else{
                System.out.println("It is a Leap Year");
            }
            
        }
        else{
            System.out.println("Not a leap Year");
        }
        
    }
}
