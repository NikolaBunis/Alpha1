//if you need to iterate with recursion(lol), remember to ad an index and call the function below with index + 1 or - 1

public class RecursiveArray6lookup {

    public static void main( String[] args){


        int[] nums = {2,3,4,5,8,9,6};
        System.out.println(array6(nums, 0));

    }

    static boolean array6(int[] nums, int index) {

//this is especially added for the test case "array6([], 0) → false" from CodingBat, where the array has no values in it
        //I can't even initialise it like that in this IDE format
        if(nums.length == 0){
            return false;

        }


        if (index == nums.length-1){

if(nums[index] !=6){

    return false;
}

else{ return true;}

        }


        if (nums[index] == 6){

return true;

       }

       else if (nums[index] != 6){


            return array6(nums, index +1);

        }



return false;



    }




}
    /*Given an array of ints, compute recursively if the array contains a 6. We'll use the convention of considering only the part of the array that begins at the given index. In this way, a recursive call can pass index+1 to move down the array. The initial call will pass in index as 0.

        array6([1, 6, 4], 0) → true
        array6([1, 4], 0) → false
        array6([6], 0) → true*/