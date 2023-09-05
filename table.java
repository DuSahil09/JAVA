import java.util.*;
public class table {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Input number :");
            int n = sc.nextInt();
            System.out.printf("The table of %d \n",n);
            for(int i =1; i<=10;i++){ 
            //   System.out.println(n*i); 
            System.out.printf("%d * %d = %d \n", n ,i, n*i);
            }
        }
    }
}
