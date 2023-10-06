
package udemy;

import java.util.Scanner;

public class Website {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the domain : ");
        String domain = sc.nextLine();
        String ext = domain.substring(domain.lastIndexOf(".") + 1);
        switch (ext) {
            case "com" -> System.out.println("Commercial");
            case "org" -> System.out.println("Organisation");
            case "gov" -> System.out.println("Government");
            default -> System.out.println("Unknown or Invalid Domain");
        }
    }
}

