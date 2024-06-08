/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_Arrays;

/**
 *
 * @author ubuntu
 */
public class T2D_Arrays {
    public static void main(String[] args){
        //This Section is made up of  2D arrays.
        //This is made up of a row and a column.
        
        String[][] cars=new String[3][3];
        cars[0][0]="Camero";
         cars[0][1]="Corvette";
          cars[0][2]="Silvarado";
           cars[1][0]="Mustang";
            cars[1][1]="Ranger";
             cars[1][2]="F-50";
              cars[2][0]="Ferrari";
               cars[2][1]="Volkswagen";
             cars[2][2]="Audi";
             for(int i=0;i<=cars.length;i++){
                 System.out.println();
                 for(int j=0;j<cars[i].length;j++){
                     System.out.print(cars[i][j]+" ");
                 }
             }
             
             
       // This is the Second Option or Way of Dealing with the arrays.
       String vehicle[][]={
           {"Camero","Corvette","Silvarado"},
           {"Mustang","Ranger","F-50"},
           {"Ferrari","Volkswagen","Audi"}
       };
       for(int x=0;x<=vehicle.length;x++){
           for(int y=0;y<=vehicle[x].length;y++){
               System.out.println(cars[x][y]);
           }
       }
    }
}
