/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udemy;
import java.util.*;

public class Protocol {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the URL: ");
        String url = sc.nextLine();
        String protocol = url.substring(0, url.indexOf(":"));

        if (protocol.equals("https")) {
            System.out.println("Hypertext Transfer Protocol");
        } else if (protocol.contains("ftp")) {
            System.out.println("File Transfer Protocol");
        }

        String ext = url.substring(url.lastIndexOf(".") + 1);

        if (ext.equals("com")) {
            System.out.println("Commercial");
        } else if (ext.equals("org")) {
            System.out.println("Organization");
        }
    }
}

