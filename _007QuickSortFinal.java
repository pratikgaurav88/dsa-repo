import java.util.ArrayList;

public class _007QuickSortFinal {
    public void solve(ArrayList<Integer> al,int start,int end){
        if(start<end){
            int pivotElement = pivot(al, start, end);
            solve(al,start,pivotElement-1);
            solve(al,pivotElement+1,end);
        }
    }
    public int pivot(ArrayList<Integer> al,int start,int end){
        System.out.println("start :: "+start+", end :: "+end);
        int pivotElement = al.get(end);
        int  i=start,j=start,temp;
        while(j<end){
            if(al.get(j)<=pivotElement){
                temp=al.get(j);
                al.set(j,al.get(i));
                al.set(i,temp);
                i++;
            }
            j++;
        }
        temp=pivotElement;
        al.set(end,al.get(i));
        al.set(i,temp);
        System.out.println(al);
        return i;
    }
    public static void main(String[] args) {
        _007QuickSortFinal obj = new _007QuickSortFinal();
        ArrayList<Integer> al = new ArrayList<>();
        al.add(3);al.add(10);al.add(2);al.add(9);al.add(1);al.add(5);al.add(7);
        //obj.pivot(al,0,al.size()-1);
        obj.solve(al, 0, al.size()-1);
    }
}
