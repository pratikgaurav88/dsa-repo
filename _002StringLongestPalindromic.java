/**
 * Problem Description
 * Given a string A of size N, find and return the longest palindromic substring in A.
 * Substring of string A is A[i...j] where 0 <= i <= j < len(A)
 * Palindrome string:
 * A string which reads the same backwards. More formally, A is palindrome if reverse(A) = A.
 * Incase of conflict, return the substring which occurs first ( with the least starting index).
 */
public class _002StringLongestPalindromic {

    public String longestPalindrome(String A) {
        int leftRange, rightRange;
        String answerOdd = "";
        String answerEven = "";
        for (int i = 0; i < A.length(); i++) {
            leftRange = i;
            rightRange = i;
            while (leftRange >= 0 && rightRange < A.length()) {
                if (A.charAt(leftRange) == A.charAt(rightRange)) {
                    leftRange--;
                    rightRange++;
                }
                else{
                    break;
                }
            }
            /*
             * We have substring with range l-r+1, but the code manipluates one extra increment & decrement
             */
            int seq=rightRange - leftRange - 1;
            int lb=leftRange+1;
            int rb=rightRange;
            if (answerOdd.length() < (seq)) {
                answerOdd = A.substring(lb, rb);
            }
        }
        for(int i=0;i<A.length();i++){
            leftRange=i;
            rightRange=i+1;
            while(leftRange>=0 && rightRange<A.length()){
                if(A.charAt(leftRange)==A.charAt(rightRange)){
                    leftRange--;
                    rightRange++;
                }
                else{
                    break;
                }
            }
            int seq=rightRange - leftRange - 1;
            int lb=leftRange+1;
            int rb=rightRange;
            if (answerEven.length() < (seq)) {
                answerEven = A.substring(lb, rb);
            }
        }
        return answerOdd.length()>answerEven.length()?answerOdd:answerEven;
    }

    public static void main(String[] args) {
        _002StringLongestPalindromic obj = new _002StringLongestPalindromic();
        System.out.println(obj.longestPalindrome("aaabaaa"));
    }
}
