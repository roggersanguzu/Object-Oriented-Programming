package Arrays_Part2;

import java.util.ArrayList;

/**
 * @author Roggers Anguzu
 */
public class Third {
    public static void main(String[] args){
        ArrayList<Integer> friends = new ArrayList<>();
        friends.add(0, 90);
        friends.add(1, 100);
        friends.add(2, 110);
        friends.add(3, 120);
        friends.add(4, 130);

        
        System.out.println(friends.get(0)); 
        System.out.println(friends.get(1)); 

       
        friends.remove(0); 

       
        System.out.print(friends.get(0)); 

        
        for(int i = 0; i < friends.size(); i++){ 
            System.out.println(friends.get(i));
        }
    }
}
