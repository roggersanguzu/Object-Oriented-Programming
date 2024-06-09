/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Oop_Part_Two;

/**
 *
 * @author ubuntu
 */
public class User_Program {
    public static void main(String[] args){
        User user=new User();
        user.firstName="";
        user.lastName="";
        user.Id=0;
        user.age=0;
        user.output();
        user.times(8);
        
        
        String infor =user.message();
        System.out.print(infor);
        
    }
}
