import java.util.ArrayList;
import java.util.List;

public class _004RecursionFindIndex {
    public ArrayList<Integer> allIndices(List<Integer> A, int B) {
        ArrayList<Integer> answer = new ArrayList<>();
        return solve(A,A.size()-1,answer,B);
    }
    public ArrayList<Integer> solve(List<Integer> al,int size, ArrayList<Integer> answer,int B){
        if(size<=-1){
            return answer;
        }
        if(al.get(size)==B){
            answer.add(size);
        }
        return solve(al,--size,answer,B);
    }
    public static void main(String[] args) {
        _004RecursionFindIndex obj = new _004RecursionFindIndex();
        System.out.println(obj.allIndices(List.of(1, 2, 3, 4, 5), 1));
    }
}
