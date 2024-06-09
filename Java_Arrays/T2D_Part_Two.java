/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_Arrays;

/**
 *
 * @author ubuntu
 */
public class T2D_Part_Two {
    public static void main(String[] args){
        //This is Option One  int [][]grades=new int [5][5];
        int grades[][]={
            {6,7,4},
            {9,3,2},
            {5,2,9}
        };
        for(int row=0;row<grades.length;row++){
            for(int col=0;col<grades[row].length;col++){
                System.out.print(grades[row][col] +"     ");
            }
            System.out.println(" ");
        }
    }
    
}
