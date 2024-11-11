
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * _001ArrayLeaders
 * Given an integer array A containing N distinct integers, 
 * you have to find all the leaders in array A. An element is a leader if it is strictly greater than all the elements to its right side.
 * NOTE: The rightmost element is always a leader.
 */
public class _001ArrayLeaders {

    public ArrayList<Integer> solve(List<Integer> data){
        ArrayList<Integer> answer=new ArrayList<>();
        int counter;
        for(int i=0;i<data.size();i++){
            counter=0;
            for(int j=i;j<data.size();j++){
                if(data.get(i)<data.get(j)){
                    counter++;
                }
            }
            if(counter==0){
                answer.add(data.get(i));
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        List<Integer> input= Arrays.asList(16, 17, 4, 3, 5, 2);
        _001ArrayLeaders obj = new _001ArrayLeaders();
        
        System.out.println(obj.solve(input));
    }
}