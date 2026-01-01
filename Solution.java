import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
        public static int[] twoSum(int[] nums, int target) {

            Map<Integer, Integer> map = new HashMap<>();
            for (int i=0; i<nums.length;i++){
               int complement =  target - nums[i]; //9-2=7, 9-7=2
              //  System.out.println(complement);
                if(map.containsKey(complement)){
                    System.out.println(map.get(complement)); //0
                    return new int[]{map.get(complement),i}; //[0,1]
                }
                map.put(nums[i],i); //[2,0],
            }

       return new int []{};
        }

    public static int[] twoSum2(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }
        // In case there is no solution, return an empty array
        return new int[] {};

    }
    public static void main(String[] args) {
            int [] nums2 = {2,7,11,15};
            int target = 9;

       int[] result =  twoSum2(nums2,target);
        System.out.println(Arrays.toString(result));
        /*Input: nums = [2,7,11,15], target = 9
        Output: [0,1]*/
    }
    }

