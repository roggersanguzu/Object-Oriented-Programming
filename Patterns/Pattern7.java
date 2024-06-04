/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patterns;
import javax.swing.JOptionPane;

/**
 *
 * @author ubuntu
 */
public class Pattern7 {
    
    public static void  main(String[] args){   
        //int number=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the Number of Rows ro deal with: "));
        pattern7(7);
        
    }
    public static void pattern7(int n){
        for(int row=1;row<n;row++){
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
