/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patterns;

/**
 *
 * @author Rojers
 */
public class Pattern2 {
    public static void main(String[] args){
        /*
        Consider that you have rows and Columns
        Outer for loop==Number of rows==number of times Outer loop Runs
        */
        for(int row=0;row<=9;row++){
            //For Every Row, I am Running the Column
            for(int col=0;col<=row;col++){
                System.out.print("* ");
            }
            //Have added this line for each Column
            System.out.println(" ");
        }
    }
    
}
