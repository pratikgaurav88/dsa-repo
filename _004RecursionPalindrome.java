/*
 * Problem Description
 * Write a recursive function that checks whether string A is a palindrome or Not.
 * Return 1 if the string A is a palindrome, else return 0.
 * Note: A palindrome is a string that's the same when read forward and backward.
 */
public class _004RecursionPalindrome {
    public int solve(String A) {
        if(solve1(A,0,A.length()-1)){
            return 1;
        }
        else{
            return 0;
        }
        
    }
    public boolean solve1(String A,int start,int end){
        if(A.charAt(start)!=A.charAt(end)){
            return false;
        }
        if(start>=end){
            return true;
        }
        return solve1(A,++start,--end);
    }
    public static void main(String[] args) {
        _004RecursionPalindrome obj = new _004RecursionPalindrome();
        System.out.println(obj.solve("naman"));
    }
}
