import java.util.Scanner;

public class eligibility {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if( age >= 18 && age <=55){
            System.out.println("Eligible for job");
        }else if(age >= 55 && age <=57){
            System.out.println("Eligible for job, But retirement soon");
        }else if(age >= 57){
            System.out.println("Retirement Time");
        }else{
            System.out.println("Invalid input");
        }
        sc.close();
    }
}
