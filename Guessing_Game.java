/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apt3040a;

import java.util.Scanner;

/**
 *
 * @author Roggers Anguzu
 */
public class Guessing_Game {
    
    public static void main(String[] args) {
        // TODO code application logic here
        int answer=7;
        int i=0;
        Scanner input= new Scanner(System.in);
        System.out.print("*********GUESSING GAME**********");
        while(i<=10){
            System.out.print("Please Enter your Guessing Number in range of 1 to 10");
            int number=input.nextInt();
            if(number==answer){
                System.out.println("Congratulations, you are a winner!");
                break;
            }
            else{
                System.out.println("You have Lost");
                              i++;
            }
        }
    }
}
