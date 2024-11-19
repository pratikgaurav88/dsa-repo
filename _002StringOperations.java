/*
 * Problem Description
 * Akash likes playing with strings. One day he thought of applying following operations on the string in the given order:
 * Concatenate the string with itself.
 * Delete all the uppercase letters.
 * Replace each vowel with '#'.
 * You are given a string A of size N consisting of lowercase and uppercase alphabets. Return the resultant string after applying the above operations.
 * NOTE: 'a' , 'e' , 'i' , 'o' , 'u' are defined as vowels.
 * Input 1:
 * A="aeiOUz"
 * Output 1:
 *  "###z###z" 
 */
public class _002StringOperations {
    public String solve(String A) {
        StringBuilder sb = new StringBuilder();
        sb.append(A);
        sb.append(A);
        //System.out.println(sb);
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)>=65 && sb.charAt(i)<=90){
                sb.deleteCharAt(i);
                i--;
            }
        }
        //System.out.println(sb);   
        String hash="#";
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)=='a' || sb.charAt(i)=='e' || sb.charAt(i)=='i' || sb.charAt(i)=='o' || sb.charAt(i)=='u'){
                sb.replace(i, i+1, hash);
            }
        }  
        //System.out.println(sb);   
        return String.valueOf(sb);
    }
    public static void main(String[] args) {
        _002StringOperations obj = new _002StringOperations();
        System.out.println(obj.solve("aeiOUz"));
    }
}
