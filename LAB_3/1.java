import java.util.*;

class L3q1 {
    public static int[] findMinMax(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i =0 ; i < nums.length ; i++) {
            if (nums[i] < min) min = nums[i];
            if (nums[i] > max) max = nums[i];
        }
        return new int[]{max, min};
    }

    public static void main(String[] args) {
        int[] is = {1, 5,12,10,8,0};
        System.out.println(Arrays.toString(findMinMax(is)));
    }
}
