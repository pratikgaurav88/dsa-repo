
import java.util.ArrayList;

public class _001Reverse{
    public ArrayList<Integer> revIntegers(ArrayList<Integer> al,int start, int end){
        
        int temp=0;
        while(start<end){
            temp=al.get(end);
            al.set(end,al.get(start));
            al.set(start,temp);
            start++;
            end--;
        }
        return al;
    }
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);al.add(2);al.add(3);al.add(4);al.add(5);
        _001Reverse obj= new _001Reverse();
        System.out.println(obj.revIntegers(al,0,al.size()-2));

    }
}