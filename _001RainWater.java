import java.util.ArrayList;
import java.util.List;

public class _001RainWater {
    int total=0;
    public int trap(final List<Integer> A) {
        ArrayList<Integer> leftMax = new ArrayList<>();
        ArrayList<Integer> rigthMax = new ArrayList<>();
        leftMax.add(A.get(0));
        for(int i=1;i<A.size();i++){
            leftMax.add(Math.max(leftMax.get(i-1), A.get(i)));
            rigthMax.add(Integer.MIN_VALUE);
        }
        rigthMax.add(A.get(A.size()-1));
        for(int i=A.size()-2;i>=0;i--){
            rigthMax.set(i,Math.max(rigthMax.get(i+1),A.get(i)));
        }
        System.out.println(leftMax);
        System.out.println(rigthMax);
        int diff;
        for(int i=0;i<A.size();i++){
            diff=Math.min(leftMax.get(i), rigthMax.get(i))-A.get(i);
            if(diff>=0){
                total+=diff;
            }
        }
        
        return total;
    }
    public static void main(String[] args) {
        List input=List.of(5, 4, 1, 4, 3, 2, 7);
        _001RainWater obj = new _001RainWater();
        System.out.println(input);
        System.out.println(obj.trap(input));
    }
}
