import java.util.HashMap;

public class TwoSumHashMap {

    public static void main (String[] args){


//the input is hardcoded, as this problem is from LeetCode, where your solutions is restricted to a single method
        int[] numbers = {2,7,11,15};

        int target = 9;


        int[] result = twoSumHashMap(numbers, target);

//for testing purposes we need to know what our programme does
        System.out.println(result[0] + ", " + result[1]);

    }


    static int[] twoSumHashMap(int[] nums, int target){

        //initialise the HashMap
        HashMap<Integer, Integer> map = new HashMap<>();

//iterate the input array
        for (int i = 0; i < nums.length; i++) {
//set the complimentary piece value for each new element
            int complimentaryPiece = target - nums[i];
//traverse the map for a complimentary piece while adding each element to it
            if(map.containsKey(complimentaryPiece)){
//if the complementary piece is found, add its index and the current index to an array and return it
                int[] result = new int[]{map.get(complimentaryPiece), i};

                return result;

            }
//add the current element to the map
            map.put(nums[i], i);

        }
//this method throws an exception at the end, as it will find the two numbers and their indexes within the single iterative for loop
        throw new IllegalArgumentException("No two sum solution");
    }




}
