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
public class Grading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int scores;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Marks Scores");
        scores=input.nextInt();
        
        if(scores>100 || scores<0){
            System.out.print("Invalid Scores");
            System.exit(0);
        }
        
        if(scores>=90){
            System.out.print("This is Grade 'A'");
        }
        else if(scores>=80){
            System.out.print("This is Grade 'B'");
        }
          else if(scores>=70){
            System.out.print("This is Grade 'C'");
        }
          else if(scores>=60){
            System.out.print("This is Grade 'D'");
        }
          else if(scores>=50){
            System.out.print("This is Grade 'E'");
        }
           else if(scores>=40){
            System.out.print("This is Grade 'F'");
        }
         else{
            System.out.print("Carry you things and Go home");
        }
    }
    
}
