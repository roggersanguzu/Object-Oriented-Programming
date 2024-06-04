/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patterns;

/**
 *
 * @author ubuntu
 */
public class Pattern6 {
    public static void main(String[] args){
        for(int row=1;row<=9;row++){
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int row=1;row<=9;row++){
            for(int col=10;col>=row;col--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
