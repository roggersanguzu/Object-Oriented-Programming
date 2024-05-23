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
public class ShapeDetermining {
    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);

    
        System.out.println("*********SHAPE DETERMING**********");
        System.out.println("How many Edges is the Shape having");

    
        int edges = input.nextInt();

        // Check the number of edges and determine the shape
        if (edges == 1) {
            System.out.println("This is a circle");
        } else if (edges == 2) {
            System.out.println("This is an 'L' Shape");
        } else if (edges == 3) {
            System.out.println("This is a triangle");
        } else if (edges == 4) {
            System.out.println("Are all the sides Equal?: ");
            System.out.println("\n1.Yes.\n2.No.");

            int answer = input.nextInt();
            if (answer == 1) {
                System.out.print("This is a square");
            } else {
                System.out.println("This is a rectangle");
            }
        } else {
            System.out.print("No Information Provided about your Shape");
        }

        input.close();
    }
}
