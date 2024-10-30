import java.util.ArrayList;

public class _001RangeEvenOdd {
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {
        for(int i=0;i<A.size();i++){
            if(A.get(i)%2==0){
                A.set(i,1);
            }
            else{
                A.set(i,0);
            }
        }
        for(int i=1;i<A.size();i++){
            A.set(i,A.get(i)+A.get(i-1));
        }
        System.out.println(A);
        return null;
    }
    public static void main(String[] args) {
        _001RangeEvenOdd obj = new _001RangeEvenOdd();
        ArrayList al = new ArrayList<>();
        al.add(1);al.add(2);al.add(3);al.add(4);al.add(5);
        ArrayList<ArrayList<Integer>> queryList = new ArrayList<>();
        
        obj.solve(al, null);
    }
}
