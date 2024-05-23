/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apt3040a;
import java.util.Scanner;
/**
 *
 * @author ~Roggers Anguzu
 */
public class Switchcases {
    
     public static void main(String[] args) {
         int scores;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Marks");
        scores=input.nextInt();
        scores=scores/10;
        switch(scores){
            case 10, 9 -> System.out.print("A");
            case 8 -> System.out.print("B");
            case 7 -> System.out.print("C");
            case 6 -> System.out.print("D");
            case 5, 4, 3, 2, 1 -> System.out.print("F");
        }
     }
}
