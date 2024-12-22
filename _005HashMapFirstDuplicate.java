
import java.util.HashMap;
import java.util.List;

public class _005HashMapFirstDuplicate{
    public int solve(List<Integer> A){
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        int key;
        for(int i=0;i<A.size();i++){
            key=A.get(i);
            if(hashMap.containsKey(key)){
                hashMap.put(key,hashMap.get(key)+1);
            }
            else{
                hashMap.put(key,1);
            }
        }
        //System.out.println(hashMap);
        for(int i=0;i<A.size();i++){
            if(hashMap.get(A.get(i))>1){
                return A.get(i);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        _005HashMapFirstDuplicate obj = new _005HashMapFirstDuplicate();
        System.out.println(obj.solve(List.of(10, 5, 3, 4, 3, 5, 6)));
    }
}