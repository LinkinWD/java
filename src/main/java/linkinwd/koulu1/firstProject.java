/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

        
package linkinwd.koulu1;

/**
 *
 * @author yaram
 */
import java.util.Scanner;
public class firstProject {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("******************************************");
        System.out.println("Tervetuloa luomaan uutta tiliä pankillemme");
        System.out.println("******************************************");
        System.out.println("Saisinko etunimesi?");
        String etuNimi = input.nextLine();
        System.out.println("Saisinko sukunimesi?");
        String sukuNimi = input.nextLine();
        System.out.println("Minkä ikäinen olet??");
        int ika = Integer.valueOf(input.nextLine());
        System.out.println("Saisinko sähköpostiosoitteesi?");
        String sahkoPosti= input.nextLine();
        
        
    }
        
            
}