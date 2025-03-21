//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

//Find the first unique in String str = "13451234";

//Algorithm :-
//1. create a hashmap
//2. store the repeated letter numbers in it
//3. retrieve each element from the map and check for repeatition
//4. return the single repeated character

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {
    public static void main(String[] args) {

        String str = "13451234";

        HashMap<Character, Integer> map = new HashMap<>();

        for(Character c:str.toCharArray()) {
            map.put(c, (map.getOrDefault(c, 0)) + 1);
        }


        for(Map.Entry<Character, Integer> e: map.entrySet()) {
            if(e.getValue() == 1) {
                System.out.println("first unique character is:"+e.getKey());
                break;
            }
        }



    }
}