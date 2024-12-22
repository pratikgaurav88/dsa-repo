import java.util.ArrayList;

public class _007QuickSortPivotal {
    public void solve(ArrayList<Integer> al){
        System.out.println(al);
        int pivot=al.get(al.size()-1);
        int i=0,j=0,temp;
        while(j<al.size()-1){
            if(al.get(j)<pivot && al.get(i)>pivot){
                temp=al.get(j);
                al.set(j,al.get(i));
                al.set(i,temp);
                i++;
            }
            j++;
        }
        temp=al.get(al.size()-1);
        al.set(al.size()-1,al.get(i));
        al.set(i,temp);
        System.out.println(al);
    }

    public static void main(String[] args) {
        ArrayList al = new ArrayList<>();
        al.add(9);al.add(1);al.add(8);al.add(2);al.add(5);
        _007QuickSortPivotal obj = new _007QuickSortPivotal();
        obj.solve(al);
    }
}
