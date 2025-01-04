/*
 * Problem Description
 * Given an array of integers A, find and return the peak element in it.
 * An array element is considered a peak if it is not smaller than its neighbors. For corner elements,
 * we need to consider only one neighbor.
 * NOTE:
 * It is guaranteed that the array contains only a single peak element.
 * Users are expected to solve this in O(log(N)) time. The array may contain duplicate elements.
 */
import java.util.List;

public class _009BinaryLocalMaxima {
    public int solve(List<Integer> A){
        if(A.size()==1 || A.get(0)>A.get(1)){
            return A.get(0);
        }
        else if(A.get(A.size()-1)>A.get(A.size()-2)){
            return A.get(A.size()-1);
        }
        else{
            int start = 1;
            int end = A.size()-2;
            int mid;
            while(start<=end){
                mid = start + (end - start)/2;
                if(A.get(mid-1) < A.get(mid) && A.get(mid+1) < A.get(mid)){
                    return A.get(mid);
                }
                if(A.get(mid-1) > A.get(mid)){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            return -1;
        }
    }
    public static void main(String[] args) {
        _009BinaryLocalMaxima obj = new _009BinaryLocalMaxima();
        //System.out.println(obj.solve(List.of(21,20,19,17,15,9,7)));
        System.out.println(obj.solve(List.of(1,1000000000,1000000000)));
    }
}
