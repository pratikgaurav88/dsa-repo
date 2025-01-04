//Incomplete
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class _008ComparatorCustom implements Comparator<Integer> {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        Collections.sort(A,new _008ComparatorCustom());
        return A;
    }
    @Override
    public int compare(Integer i1,Integer i2){
        int c1=(i1%100);
        int c2=(i2%100);
        if(c1<10){
            c1=0;
        }
        if(c2<10){
            c2=0;
        }
        if(c1/10==c2/10){
            return c2-c1;
        }
        else{
            return c1-c2;
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(15);al.add(11);al.add(7);al.add(19);
        _008ComparatorCustom obj = new _008ComparatorCustom();
        System.out.println(obj.solve(al));
    }
}
