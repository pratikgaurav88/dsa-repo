import java.util.ArrayList;

public class _001RangeSumQuery {
    public ArrayList<Long> rangeSum(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {
        ArrayList<Long> result = new ArrayList<>();
        ArrayList<Long> temp = new ArrayList<>();
        temp.add(Long.valueOf(A.get(0)));
        for(int i=1;i<A.size();i++){
            temp.add(temp.get(i-1)+A.get(i));
        }
        int l=0;
        int r=0;
        for(int i=0;i<B.size();i++){
            l=B.get(i).get(0);
            r=B.get(i).get(1);
            if(l<1){
                result.add(temp.get(r));
            }
            else{
                result.add(temp.get(r)-temp.get(l-1));
            }
        }
        return result;
    }
    public static void main(String[] args) {
        
    }
}
