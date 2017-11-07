import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		int[] input ={2,4,1,5,3,6,7,9,8,4};
		int target= 8;
		int countunique=0;
		HashMap<Integer, Integer> countmap = new HashMap<>();
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<input.length;i++){
			if(map.containsValue(target-input[i])){
				
					System.out.println(target-input[i]+ "," + input[i] );
			}
			else{
				map.put(i, input[i]);
			}
		}

	}

}
