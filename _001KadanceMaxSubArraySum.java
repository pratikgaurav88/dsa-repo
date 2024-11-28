import java.util.List;
/*
 * Find the maximum sum of contiguous non-empty subarray within an array A of length N.
 * Input 1:
 * A = [1, 2, 3, 4, -10] 
 * Input 2:
 * A = [-2, 1, -3, 4, -1, 2, 1, -5, 4] 
 * Output 1:
 *  10 
 * Output 2:
 * 6 
 */
public class _001KadanceMaxSubArraySum {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxSubArray(final List<Integer> A) {
        int maxSum=Integer.MIN_VALUE;
        int currentSum=0;
        int negativeFrequency=0;
        for(int i=0;i<A.size();i++){
            if(A.get(i)<0){
                negativeFrequency++;
            }
        }
        if(negativeFrequency==A.size()){
            int maxValue=Integer.MIN_VALUE;
            for(int i=0;i<A.size();i++){
                if(maxValue<A.get(i)){
                    maxValue=A.get(i);
                }
            }
            return maxValue;
        }
        else if(negativeFrequency==0){
            for(int i=0;i<A.size();i++){
                maxSum+=A.get(i);
            }
            return maxSum;
        }
        else{
            currentSum=A.get(0);
            maxSum=A.get(0);
            for(int i=1;i<A.size();i++){
                currentSum+=A.get(i);
                if(currentSum<=0){
                    currentSum=0;
                }
                maxSum=Math.max(maxSum, currentSum);
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        List<Integer> input = List.of(-2, 1, -3, 4, -1, 2, 1, -5, 4);
        _001KadanceMaxSubArraySum obj = new _001KadanceMaxSubArraySum();
        obj.maxSubArray(input);    
    }
}
