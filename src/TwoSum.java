public class TwoSum {

    public static void main (String[] args){

//the input is hardcoded, as this problem is from LeetCode, where your solutions is restricted to a single method
int[] numbers = {2,7,11,15};

int target = 9;


int[] result = twoSum(numbers, target);

//for testing purposes we need to know what our programme does
        System.out.println(result[0] + ", " + result[1]);

    }


  static int[] twoSum(int[] nums, int target) {
//the array we need to return will always contain two elements, so we can create it before the main algorithm
     int[] result = new int[2];


     // for each number we'll test if there's a complimentary piece to add and get the target sum
      for (int i = 0; i < nums.length; i++) {

          //this variable gives us a way to test if the exact second number exists in the nums array
          int secondNumber = target - nums[i];

          //if we've found the two numbers and have added their indexes to the result array,
          // we want to break the outer loop, or else it will continue and eventually reverse the positions of the two indexes in the result array
          if (result[0] !=0 || result[1] != 0) break;

          //this second for loop tests against the desired complimentary piece in the secondNumber variable
          for (int j = 0; j <nums.length ; j++) {

              //a simple way to say we cannot use the same number twice
              if (j != i){
                  //if we have a winner, add both indexes to the result array
                  if(nums[j] == secondNumber) {

                      result[0] = i;
                      result[1] = j;
     //after both indexes have been added, break the inner loop, we do not need to continue and spit out reversed positions of the indexes we return
                       break;
                  }

              }

          }

      }

      return result;

    }



}





