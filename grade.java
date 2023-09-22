import java.util.Scanner;

public class grade {
    public static void main(String[] args){
       int marks;
        Scanner sc = new Scanner(System.in);
         marks = sc.nextInt();
        
        if(marks >= 0 && marks <= 25){
            System.out.println("You are getting Grade F");
        }else if(marks <= 44){
            System.out.println("Grade E");
        }else if(marks <= 49){
            System.out.println("Grade D");
        }else if(marks <= 59 ){
            System.out.println("Grade C");
        }else if(marks <= 79){
            System.out.println("Grade B");
        }
        else if(marks <= 100){
            System.out.println("Grade A");
        } else{
            System.out.println("Invalid");
        }
        sc.close();
    }
}
