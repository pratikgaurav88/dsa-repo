/**
 * Problem Description.
 * Given a string A, you are asked to reverse the string and return the reversed string.
 * Input 1:
 * A = "scaler"
 * Output 1:
 * "relacs"
 */
public class _002StringReverse {
    public String solve(String A) {
        StringBuilder sb = new StringBuilder();
        for(int i=A.length()-1;i>=0;i--){
            sb.append(A.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        _002StringReverse obj = new _002StringReverse();
        System.out.println(obj.solve("Hello"));
    }
}
