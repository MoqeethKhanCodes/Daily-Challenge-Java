import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] nums = {3,2,10,4};
        int[] total = twoSum1(nums,6);


        int[] totalS = twoSum2(nums, 6);
    }
    public static int[] twoSum(int[] nums, int target) {


        for (int i = 0; i <= nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{nums[i] , nums[j]};
                }
            }
        }
        return nums;

    }

    public static int[] twoSum1(int[] nums, int target) {

        Map<Integer, Integer> deductionMap = new HashMap<>();
        for (int i = 0; i <= nums.length; i++) {
            if(deductionMap.get(nums[i]) != null) {
                return new int[]{i, deductionMap.get(nums[i])};
            }
            deductionMap.put(target - nums[i],i);

        }
        return nums;

    }

    public static int[] twoSum2(int []nums, int target) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int moreNeeded = target - num;
            if (mpp.containsKey(moreNeeded)) {
                return new int[]{i, mpp.get(moreNeeded)};
            }

            mpp.put(num, i);
        }
        return nums;
    }
}