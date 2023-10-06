
package udemy;

import java.util.Scanner;


public class MenuDive {
     public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("====");
        System.out.println("ADD");
        System.out.println("Sub");
        System.out.println("Mul");
        System.out.println("Div");
        
        System.out.println("Enter the 2 numbers");
        int x=sc.nextInt();
        int y=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the option in word");
        String option=sc.nextLine();
        switch(option){
            case "ADD"->System.out.println("Sum is "+(x+y));
            case "SUB"->System.out.println("Sum is "+(x-y));
            case "MUL"->System.out.println("Sum is "+(x*y));
            case "DIV"->System.out.println("Sum is "+(x/y));
            default ->System.out.println("Invalid");
            
            
        }
     
     }
}
