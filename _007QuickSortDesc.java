import java.util.ArrayList;
public class _007QuickSortDesc {
    public ArrayList<Integer> solve(ArrayList<Integer> al,int start,int end){
        if(start<end){
            int pivotElement = pivot(al, start, end);
            solve(al, start, pivotElement-1);
            solve(al, pivotElement+1, end);
            
        }
        return al;
    }
    public String solve_op(ArrayList<Integer> al,int start,int end){
        if(start<end){
            int pivotElement = pivot_op(al, start, end);
            solve_op(al, start, pivotElement-1);
            solve_op(al, pivotElement+1, end);
            
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<al.size();i++){
            sb.append(al.get(i));
        }
        return sb.toString();
    }
    public int pivot(ArrayList<Integer> al,int start,int end){
        //System.out.println(al);
        int i = start;
        int j = start;
        int pivotElement = al.get(end);
        int temp; 
        while(j<end){
            if(al.get(j)<pivotElement){
                temp=al.get(i);
                al.set(i,al.get(j));
                al.set(j,temp);
                i++;
            }
            j++;
        }
        //System.out.println("Before swap :: "+al);
        temp=al.get(i);
        al.set(i,pivotElement);
        al.set(end,temp);
        //System.out.println(al);
        return i;
    }
    public int pivot_op(ArrayList<Integer> al,int start,int end){
        //System.out.println(al);
        int i = start;
        int j = start;
        int pivotElement = al.get(end);
        int temp; 
        while(j<end){
            if(al.get(j)>pivotElement){
                temp=al.get(i);
                al.set(i,al.get(j));
                al.set(j,temp);
                i++;
            }
            j++;
        }
        //System.out.println("Before swap :: "+al);
        temp=al.get(i);
        al.set(i,pivotElement);
        al.set(end,temp);
        //System.out.println(al);
        return i;
    }
    public static void main(String... args){
        _007QuickSortDesc obj = new _007QuickSortDesc();
        ArrayList<Integer> al = new ArrayList<>();
        //al.add(10);al.add(90);al.add(20);al.add(70);al.add(30);
        //al.add(5);al.add(2);al.add(4);al.add(3);al.add(1);
        //al.add(3);al.add(10);al.add(2);al.add(9);al.add(1);al.add(5);al.add(8);
        al.add(3);al.add(30);al.add(34);al.add(5);al.add(9);//al.add(5);al.add(8);
        //obj.pivot(al,0,al.size()-1);
        System.out.println(al);
        //obj.solve(al, 0, al.size()-1);
        System.out.println(obj.solve_op(al, 0, al.size()-1));
        System.out.println(al);
    }
}
