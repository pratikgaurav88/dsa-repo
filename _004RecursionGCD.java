/*
 * Problem Description
 * Given 2 non-negative integers A and B, find gcd(A, B)
 * GCD of 2 integers A and B is defined as the greatest integer 'g' such that 'g' is a divisor of both A and B. Both A and B fit in a 32 bit signed integer.
 * Note: DO NOT USE LIBRARY FUNCTIONS.
 * 
 * Example Input
 * Input 1:
 * A = 4
 * B = 6
 * Output 1:
 * 2
 */

public class _004RecursionGCD {
    public int gcd(int A, int B) {
        if(B>A){
            return gcd(B,A);
        }
        if(B==0){
            return A;
        }
        return gcd(A%B,B);
    }
    public static void main(String... args){
        _004RecursionGCD obj = new _004RecursionGCD();
        System.out.println(obj.gcd(10,25));
        System.out.println(obj.gcd(10,17));
    }
}
