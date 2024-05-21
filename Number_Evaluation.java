/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package roggers;

import java.util.Scanner;

/**
 *
 * @author ranguzu
 */
public class Number_Evaluation {
    //This is the Section for Verifying an Even and an Odd Number.

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a Number:");
        n=input.nextInt();
        if(n%2==0){
            System.out.print(n+ " is an Even Number");
        }else{
            System.out.print(n+ " I is an Odd Number");
        }
    }
    
}
