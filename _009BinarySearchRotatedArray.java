import java.util.List;

public class _009BinarySearchRotatedArray {
    public int search(final List<Integer> A, int B) {
        int start=0;
        int end = A.size()-1;
        int mid;
        boolean part=A.get(0)>B;
        while(start<=end){
            mid = start + (end - start)/2;
            if(A.get(mid)==B){
                return mid;
            }
            if(!part){
                if(A.get(mid)>A.get(0)){
                    if(A.get(mid)<B){
                        start=mid+1;
                    }
                    else{
                        end=mid-1;
                    }
                }
                else{
                    end=mid-1;
                }
            }
            else{
                if(A.get(mid)<A.get(0)){
                    if(A.get(mid)<B){
                        start=mid+1;
                    }
                    else{
                        end=mid-1;
                    }
                }
                else{
                    start=mid+1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        _009BinarySearchRotatedArray obj = new _009BinarySearchRotatedArray();
        System.out.println(obj.search(List.of(9, 10, 3, 5, 6, 8), 5));
    }
}
