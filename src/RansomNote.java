public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] charFreqSrc = new int[26];
        int[] charFreqTarget = new int[26];

        for(int i = 0; i < magazine.length(); i++) {
            charFreqSrc[magazine.charAt(i) - 97]++;
        }
        for(int i = 0; i < ransomNote.length(); i++) {
            charFreqTarget[ransomNote.charAt(i) - 97]++;
        }

        for(int i = 0; i < charFreqSrc.length; i++) {
            if(charFreqTarget[i] > charFreqSrc[i]) {
                return false;
            }
        }
        return true;
    }
}