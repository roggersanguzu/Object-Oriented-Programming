/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apt3040a;

import java.util.Scanner;

/**
 *
 * @author Roggers Anguzu
 */
public class APT3040A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String login="rogers12345";
        String password;
        Scanner input=new Scanner(System.in);
        System.out.println("*************USER VERIFICATION***********");
        System.out.println("Please Student Enter your Username: ");
        String name=input.nextLine();
        
        System.out.println("Please Enter your Password: ");
        password=input.nextLine();
       
        if(password==login){
            System.out.println("Dear " +name+ " Your Login is SuccessFull");
        }
        else{
            System.out.println("Login has Failed");
        }
    }
    
}
