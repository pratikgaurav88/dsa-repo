import java.util.ArrayList;
import java.util.List;

public class _001OddIndex {
    public ArrayList<Integer> solve(List<Integer> al){
        ArrayList<Integer> answer = new ArrayList<>(); 
        answer.add(0);
        for(int i=1;i<al.size();i++){
            if(i%2==0){
                answer.add(answer.get(i-1));
            }
            else{
                answer.add(al.get(i)+answer.get(i-1));
            }
        }
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        _001OddIndex obj = new _001OddIndex();
        obj.solve(List.of(2,3,1,6,4,5));
    }
}
