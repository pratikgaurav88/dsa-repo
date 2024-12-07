/*
 * Write a program to find the factorial of the given number A using recursion.
 * Note: The factorial of a number N is defined as the product of the numbers from 1 to N.
 * Input 1:
 * A = 4
 * Output 1:
 * 24
 */
public class _004RecursionFactorial {
    public static int solve(int A) {
        if(A==0){
            return 1;
        }
        return A * solve(A-1);
    }
    public static void main(String[] args) {
        System.out.println(_004RecursionFactorial.solve(5));
    }
}
