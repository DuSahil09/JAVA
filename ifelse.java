import java.util.Scanner;

public class ifelse {
       public static void main(String args[]){
        int age;
        try (Scanner sc = new Scanner(System.in)) {
            age = sc.nextInt();
        }
        if(age >= 18){
            System.out.println("You are an adult!");
        }else{
            System.out.println("You are not an adult!");
        }
       }
}