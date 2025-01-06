/*
 * Given an integer A. Compute and return the square root of A.
 * If A is not a perfect square, return floor(sqrt(A)).
 * NOTE: 
 * The value of A*A can cross the range of Integer.
 * Do not use the sqrt function from the standard library. 
 * Users are expected to solve this in O(log(A)) time.
 */
public class _009BinarySquareRoot {
    public int sqrt(int A) {
        if(A==0){
            return 0;
        }
        else{
            long start=0;
            long end=A;
            long mid;
            long answer=0;
            while(start<=end){
                mid = start + (end-start)/2;
                if(mid * mid <= A){
                    answer = mid;
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }

            }
            System.out.println("check :: "+answer);
            return (int)answer;
        }
    }
    public static void main(String[] args) {
        _009BinarySquareRoot obj = new _009BinarySquareRoot();
        System.out.println(obj.sqrt(25));
        System.out.println(obj.sqrt(2147483647));
    }
}
