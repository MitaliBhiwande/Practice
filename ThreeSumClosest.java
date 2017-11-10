import java.util.Arrays;

public class ThreeSumClosest {
	public static void main(String args[]){
		int nums[]={-1 ,2, 1, -4};
		int target=1;
		int result = nums[0] + nums[1] + nums[nums.length - 1];
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int first = i + 1, second = nums.length - 1;
            while (first < second) {
                int sum = nums[i] + nums[first] + nums[second];
                if (sum > target) {
                    second--;
                } else {
                    first++;
                }
                if (Math.abs(sum - target) < Math.abs(result - target)) {
                    result = sum;
                }
            }
        }
        System.out.println(result);
	}
}
