
import java.util.ArrayList;

public class _007QuickSort01 {
    public void solve(ArrayList<Integer> al){
        System.out.println(al);
        int i=0,j=0;
        int temp;
        while(j<al.size()){
            if(al.get(j)==0 && al.get(i)==1){
                temp=al.get(j);
                al.set(j,al.get(i));
                al.set(i,temp);
                i++;
            }
            j++;
        }
        System.out.println(al);
    }
    public static void main(String[] args) {
        _007QuickSort01 obj = new _007QuickSort01();
        ArrayList<Integer> al = new ArrayList();
        al.add(1);al.add(0);al.add(1);al.add(0);al.add(1);al.add(0);
        obj.solve(al);
    }
}
