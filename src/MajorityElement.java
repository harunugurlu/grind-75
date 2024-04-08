import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i = 0; i < nums.length; i++) {
            int curr = map.getOrDefault(nums[i], 0);
            map.put(nums[i], ++curr);
        }
        int maxValue = 0;
        int maxNum = 0;
        for(Map.Entry m : map.entrySet()) {
            int curr = (int)m.getValue();
            if(maxValue < curr) {
                maxValue = curr;
                maxNum = (int)m.getKey();
            }
        }

        return maxNum;
    }
}