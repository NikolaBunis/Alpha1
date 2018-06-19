//this one required a little more grinding, but it's still easy, because there's a condition to check neighbouring elements
// it would have been much harder to go through the entire array for each number and check if there's an element equal to the number times ten
//I'm getting used to thinking recursively, only my bottoms seem a bit too complicated


public class RecursiveArray220times10Lookup {


    public static void main (String[] args){

        int [] nums = {3, 5, 9, 11, 45, 3982, 5, 50};

        System.out.println(array220(nums, 0));


    }

    static boolean array220(int[] nums, int index) {

        if (nums.length < 2){

            return false;
        }


if (nums.length == 2){
            if (nums[1] == nums[0] * 10){
                return true;
            }
            else{return false;}

}

if (index == nums.length-1){
            if(nums[nums.length - 1] != nums[nums.length-2]* 10){
                return false;
            }
            else{ return true;}
}

if (nums[index +1] == nums[index] * 10){
            return true;
}

else{ return array220(nums, index + 1);}



    }




}

    /*Given an array of ints, compute recursively if the array contains somewhere a value followed in the array by that value times 10. We'll use the convention of considering only the part of the array that begins at the given index. In this way, a recursive call can pass index+1 to move down the array. The initial call will pass in index as 0.

        array220([1, 2, 20], 0) → true
        array220([3, 30], 0) → true
        array220([3], 0) → false*/