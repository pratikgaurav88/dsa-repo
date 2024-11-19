/**
 * Problem Description
 * You are given a character string A having length N, consisting of only lowercase and uppercase latin letters.
 * You have to toggle case of each character of string A. For e.g 'A' is changed to 'a', 'e' is changed to 'E', etc.
 * Input 1:
 * A = "Hello" 
 * Output 1:
 * hELLO 
 */
public class _002StringToogle {
    public String solve(String A) {
        char[] charr=A.toCharArray();
        for(int i=0;i<charr.length;i++){
            int temp = charr[i];
            if(temp>=65 && temp<=90){
                charr[i]=(char)(temp+32);
            }
            else if(temp>=97 && temp<=122){
                charr[i]=(char)(temp-32);
            }
        }
        return String.valueOf(charr);
    }
    public static void main(String[] args) {
        _002StringToogle obj = new _002StringToogle();
        System.out.println(obj.solve("HelloStirng"));
    }
}
