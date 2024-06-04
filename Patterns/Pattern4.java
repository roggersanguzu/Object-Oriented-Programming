/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patterns;

/**
 *
 * @author ubuntu
 */
public class Pattern4 {
    public static void main(String[] args){
        for(int row=1;row<=5;row++){
            for(int col=5;col>=row;col--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
