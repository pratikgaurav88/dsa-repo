/*
 * Given a sorted array of integers A (0-indexed) of size N, find the left most and the right most index of a given integer B in the array A.
 * Return an array of size 2, such that 
 * First element = Left most index of B in A
 * Second element = Right most index of B in A.
 * If B is not found in A, return [-1, -1].
 * Note: The time complexity of your algorithm must be O(log n)..
 * Example Input
 * Input 1:
 * A = [5, 7, 7, 8, 8, 10]
 * B = 8
 * Input 2:
 * A = [5, 17, 100, 111]
 * B = 3
 * Example Output
 * Output 1:
 * [3, 4]
 * Output 2:
 * [-1, -1]
 */
import java.util.ArrayList;
import java.util.List;

public class _009BinaryFirstLastOc {
    public ArrayList<Integer> searchRange(final List<Integer> A, int B) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(-1);
        al.add(-1);
        int start=0;
        int end=A.size()-1;
        int mid;
        int startIndex=-1;
        int endIndex=-1;
        while(start<=end){
            mid = start + (end - start)/2;
            if(A.get(mid)==B){
                startIndex=mid;
                end=mid-1;
            }
            else if(A.get(mid)<B){
                start = mid+1;
            }
            else{
                end = mid - 1;
            }
        }
        al.set(0, startIndex);
        start=0;
        end=A.size()-1;
        while(start<=end){
            mid = start + (end - start)/2;
            if(A.get(mid)==B){
                endIndex=mid;
                start=mid+1;
            }
            else if(A.get(mid)<B){
                start = mid+1;
            }
            else{
                end = mid - 1;
            }
        }
        al.set(1, endIndex);
        return al;
    }
    
    
    public static void main(String[] args) {
        _009BinaryFirstLastOc obj = new _009BinaryFirstLastOc();
        System.out.println(obj.searchRange(List.of(5, 7, 7, 8, 8, 10),8));
        //System.out.println(obj.searchRange(List.of(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10), 10));
    }
}
