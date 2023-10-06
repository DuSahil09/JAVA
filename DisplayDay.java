/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udemy;
import java.util.*;
/**
 *
 * @author Sahil786
 */
public class DisplayDay {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in); 
       System.out.println("Enter the number of the day");
       int Day = sc.nextInt();
       if(Day==1){
           System.out.println("Monday");
       }
       else  if(Day==2){
           System.out.println("Tuesday");
       }
       else  if(Day==3){
           System.out.println("Wendesday");
       }
       else  if(Day==4){
           System.out.println("Trusday");
       }
       else  if(Day==5){
           System.out.println("Friday");
       }
       else  if(Day==6){
           System.out.println("Saturday");
       }
       else  if(Day==7){
           System.out.println("Sunday");
       }
       else{
           System.out.println("Invalid");
       }
    }
}
