// 1. Get the first set of indices from an array satisfying the total :-
//     Algorithm :-
//         1. create a map. 
//         2. calculate x = total - current_element
//         3. check for value of x in the map
//         4. if present return the saved array with mapped value and the current index
//         5. else return the empty array

import java.util.HashMap;
import java.util.Map;

class FirstIndices {



    public static int[] getFirstIndices(int arr[], int total) {

        Map<Integer, Integer> map = new HashMap();

        for(int i = 0; i < arr.length; i++) {
            int temp = total - arr[i];

            if(map.containsKey(temp)) {
                return new int[]{map.get(temp), i};
            }

            map.put(arr[i], i);
        }


        return new int[]{};

    }

    public static void main(String[] strs) {

       int array[] = new int[]{2,3,4,5,6,7};

       int total = 7;

       int res[] = getFirstIndices(array, total);

       System.out.println("result: "+"("+res[0]+","+res[1]+")");


    }



}