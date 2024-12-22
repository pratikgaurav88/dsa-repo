import java.util.LinkedHashSet;
import java.util.List;

public class _005HashSetPairDifference {
    public int solve(List<Integer> A, int B) {
        LinkedHashSet<Integer> hs = new LinkedHashSet<>();
        int temp;
        for(int i=0;i<A.size();i++){
            temp=B-A.get(i);
            if(!hs.contains(temp)){
                hs.add(A.get(i));
            }
            else{
                return 1;
            }
        }
        System.out.println(hs);
        return 0;
    }
    public static void main(String[] args) {
        _005HashSetPairDifference obj = new _005HashSetPairDifference();
        System.out.println(obj.solve(List.of(3, 5, 1, 2), 4));
    }
}
