import java.util.LinkedHashSet;
import java.util.List;

public class _005HashSetPairSum {
     public int solve(int A, List<Integer> B) {
        LinkedHashSet<Integer> hs = new LinkedHashSet<>();
        int temp;
        for(int i=0;i<B.size();i++){
            temp=A-B.get(i);
            if(!hs.contains(temp)){
                hs.add(B.get(i));
            }
            else{
                return 1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        _005HashSetPairSum obj = new _005HashSetPairSum();
        System.out.println(obj.solve(8,List.of(3, 5, 1, 2, 1, 2)));
    }
}
