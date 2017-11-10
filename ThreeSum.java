/*
 * Program to find triplets that sum up to the given target
 */
import java.util.Arrays;

public class ThreeSum {
	public static void main(String args[]){
		int[] input={-1, 0, 1, 2, -1, -4};
		int target=0;
		//ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        Arrays.sort(input);
        for(int i = 0; i<input.length - 2; i++){
            if (i > 0 && input[i] == input[i - 1]) {              
                continue;
            }
            int first = i + 1, second = input.length-1, sum = target-input[i];
            while(first < second){
                if(input[first] + input[second] == sum){
                	System.out.println(input[i]+" , "+ input[first]+" , "+input[second]);
                    //result.add((ArrayList<Integer>) Arrays.asList(input[i], input[first], input[second]));
                    while (first < second && input[first] == input[first+1]) 
                        first++;
                    while (first < second && input[second] == input[second-1]) 
                        second--;
                first++; 
                second--;
                } else if(input[first] + input[second] < sum) 
                            first++;
                       else
                            second--;                         
            }
        }
	}
}
