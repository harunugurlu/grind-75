import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {
    public int longestPalindrome(String s) {
        if(s.length() == 1) {
            return 1;
        }

        Map<Integer, Integer> charFreq = new HashMap<Integer, Integer>();

        for(int i = 0; i < s.length(); i++) {
            int curr = s.charAt(i);
            int currValue = charFreq.getOrDefault(curr, 0);
            charFreq.put(curr, ++currValue);
        }

        int result = 0;
        int doesOddFreqExist = 0;
        for(Map.Entry m : charFreq.entrySet()) {
            int currValue = (Integer)m.getValue();
            if(currValue % 2 == 0) {
                result += currValue;
            }
            else {
                doesOddFreqExist = 1;
                result += currValue-1;
            }
        }
        return result + doesOddFreqExist;
    }
}