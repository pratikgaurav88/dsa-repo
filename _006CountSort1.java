/*
 * Count Sort example
 */
import java.util.ArrayList;

public class _006CountSort1 {
    public void solve(ArrayList<Integer> al){
        System.out.println(al);
        ArrayList<Integer> frequnecy = new ArrayList<>();
        for(int i=0;i<10;i++){
            frequnecy.add(0);
        }
        int tempF;
        for(int i=0;i<al.size();i++){
            tempF=al.get(i);
            frequnecy.set(tempF, frequnecy.get(tempF)+1);
        }
        for(int i=0;i<10;i++){
            System.out.println(i+" :: "+frequnecy.get(i));
        }
        int currentIndex=0;
        int currentValue;
        for(int i=0;i<frequnecy.size();i++){
            currentValue=frequnecy.get(i);
            for(int j=1;j<=currentValue;j++){
                al.set(currentIndex++, i);
            }
        }
        System.out.println(al);
    }
    public static void main(String[] args) {
        _006CountSort1 obj = new _006CountSort1();
        ArrayList<Integer> al = new ArrayList<>();
        al.add(4);al.add(2);al.add(2);al.add(8);al.add(3);al.add(3);al.add(1);
        //obj.solve(List.of(4, 2, 2, 8, 3, 3, 1));
        obj.solve(al);
    }
}
