
package udemy;
import java.util.*;
public class DayUsingSwitch {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int day =sc.nextInt();
        switch(day){
            case 1:System.out.println("MON");
            break;
            case 2:System.out.println("TUS");
            break;
            case 3:System.out.println("WED");
            break;
            case 4:System.out.println("Thur");
            break;
            case 5:System.out.println("Fri");
            break;
            case 6:System.out.println("Sat");
            break;
            case 7:System.out.println("Sun");
            break;  
            default :System.out.println("invalid");
            break;
        }
        
    }
}
