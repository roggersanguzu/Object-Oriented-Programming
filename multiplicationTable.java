/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_Prog_Work;

import java.util.Scanner;

/**
 *
 * @author ~CyberCodex
 */
public class multiplicationTable {
     public static void main(String[] args) {
       int row,col;
       int ncol,nrow;
       Scanner input=new Scanner(System.in);
       System.out.println("Enter the Number of Rows and Columns for the table");
       nrow=input.nextInt();
       ncol=input.nextInt();
       for(row=1;row<=nrow;row++){
           for(col=1;col<=ncol;col++){
               System.out.print(col*row + "\t");
           }
           System.out.println();
       }
    }
    
}

