
import java.util.ArrayList;
import java.util.List;

public class _001EvenIndex{
    public void solve(List<Integer> al){
        ArrayList<Integer> answer = new ArrayList<>(); 
        answer.add(al.get(0));
        for(int i=1;i<al.size();i++){
            if(i%2==0){
                answer.add(answer.get(i-1)+al.get(i));
            }
            else{
                answer.add(answer.get(i-1));
            }
        }
        System.out.println(answer);
    }
    public static void main(String[] args) {
        _001EvenIndex obj = new _001EvenIndex();
        obj.solve(List.of(2,3,1,6,4,5));
    }
}