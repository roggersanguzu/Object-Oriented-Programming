/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_Arrays;

/**
 *
 * @author ubuntu
 */
public class Array_one {
    public static void main(String[] agrs){
        String[] cars={"Camarao","Tesla","Ferrari","Volkswagen"};
        System.out.println(cars[0] +" Is my best Car/Vehicle");
          System.out.println(cars[1] +" Is my Secongbest Car/Vehicle");
            System.out.println(cars[2] +" Is my third best Car/Vehicle");
            
            //Additional way of Dealing With Arrays.
        String[] vehicles=new String[4];
        vehicles[0]="Camaro";
        vehicles[1]="Corvette";
        vehicles[2]="Tesla";
        vehicles[3]="Ferrari";
        for(int i=0;i<=vehicles.length;i++){
            System.out.println(vehicles[i]);
        }
    }
    
}
