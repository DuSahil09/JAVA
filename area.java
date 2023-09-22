import java.util.Scanner;

public class area {
    public static void main(String args[]){
        // Write your code here
        int choice;
        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();
        
       
        double area = 0;
        switch(choice){
            case 1:
            int r = sc.nextInt();
            area = (Math.PI*r*r);
            break;
            case 2:
             int l = sc.nextInt();
        int b = sc.nextInt();
            area = (l*b);
        }
        System.out.println("Area : "+area);
        sc.close();
    }
}
