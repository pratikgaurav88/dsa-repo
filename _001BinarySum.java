/*
 * Problem Description
 * Given two binary strings A and B. Return their sum (also a binary string).
 * Problem Constraints
 * 1 <= length of A <= 105
 * 1 <= length of B <= 105
 * A and B are binary strings
 * 
 * Input 1: A = "100" B = "11"
 * Input 2: A = "110" B = "10"
 * 
 * Example Output
 * Output 1: "111"
 * Output 2: "1000"
 */
public class _001BinarySum {

    public String addBinary(String A, String B) {
        String answer = "";
        int diff = Math.abs(A.length() - B.length());
        if (A.length() > B.length()) {
            B = equalize(B, diff);
        } else if (A.length() < B.length()) {
            A = equalize(A, diff);
        }
        System.out.println("A :: " + A);
        System.out.println("B :: " + B);
        int carry = 0;
        int a, b;

        for (int i = A.length() - 1; i >= 0; i--) {
            a = A.charAt(i);
            b = B.charAt(i);
            if (i != 0) {
                if ((a & b) == 49) {
                    if (carry == 0) {
                        answer = "0" + answer;
                        carry = 1;
                    } else if (carry == 1) {
                        answer = "1" + answer;
                        carry = 1;
                    }
                }
                //System.out.println("a :: " + a +" b ::"+ b +" a^b :: "+ (a ^ b));
                if ((a ^ b) == 1) {
                    if (carry == 0) {
                        answer = "1" + answer;
                        carry = 0;
                    } else if (carry == 1) {
                        answer = "0" + answer;
                        carry = 1;
                    }
                }
                if ((a | b) == 48) {
                    if (carry == 0) {
                        answer = "0" + answer;
                        carry = 0;
                    }
                    if (carry == 1) {
                        answer = "1" + answer;
                        carry = 0;
                    }
                }
            } else {
                if ((a & b) == 49) {
                    if (carry == 0) {
                        answer = "10" + answer;
                    } else if (carry == 1) {
                        answer = "11" + answer;

                    }
                }
                //System.out.println("a :: " + a +" b ::"+ b +" a^b :: "+ (a ^ b));
                if ((a ^ b) == 1) {
                    if (carry == 0) {
                        answer = "1" + answer;

                    } else if (carry == 1) {
                        answer = "10" + answer;

                    }
                }
                if ((a | b) == 48) {
                    if (carry == 0) {
                        answer = "0" + answer;
                        
                    }
                    if (carry == 1) {
                        answer = "1" + answer;
                        
                    }
                }
            }
        }
        return answer;
    }

    public String equalize(String input, int len) {
        for (int i = 0; i < len; i++) {
            input = "0" + input;
        }
        return input;
    }

    public static void main(String[] args) {
        _001BinarySum obj = new _001BinarySum();
        System.out.println(obj.addBinary("101", "1111"));
    }
}
