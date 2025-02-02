/**
 * Given an array A of size N. You need to find the sum of Maximum and Minimum element in the given array.
*/
import java.util.List;

public class _001ArrayMaxMin {
    public int solve(List<Integer> A) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<A.size();i++){
            if(min>A.get(i)){
                min=A.get(i);
            }
            if(max<A.get(i)){
                max=A.get(i);
            }
        }
        System.out.println("min :: "+min);
        System.out.println("max :: "+max);
        return min+max;
    }
    public static void main(String[] args) {
        List<Integer> data = List.of(-2, 1, -4, 5, 3);
        _001ArrayMaxMin obj = new _001ArrayMaxMin();
        System.out.println(obj.solve(data));
    }
}
