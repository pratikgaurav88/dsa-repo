import java.util.HashSet;

public class _005LongestSubString {
    public int lengthOfLongestSubstring(String A) {
        int i=0;
        int j=0;
        int length=Integer.MIN_VALUE;
        HashSet<Character> hs = new HashSet<>();
        while(j<A.length()){
            while(hs.contains(A.charAt(j))){
                hs.remove(A.charAt(i));
                i++;
            }
            hs.add(A.charAt(j));
            length=Math.max(length, (j-i)+1);
            j++;
        }
        return length;
    }
    
    public static void main(String[] args) {
        _005LongestSubString obj = new _005LongestSubString();
        System.out.println(obj.lengthOfLongestSubstring("abcabcbb"));
    }
}
