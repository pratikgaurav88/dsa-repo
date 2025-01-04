import java.util.ArrayList;

public class _007QuickSort01_1 {
    public ArrayList<Integer> sort01(ArrayList<Integer> A) {
        int i=0;
        int j=0;
        for(int x=0;x<A.size();x++){
            if(A.get(x)==1){
                i=x;
                j=x;
                break;
            }
        }
        while(j<A.size()){
            if(A.get(j)==0 && A.get(i)==1){
                A.set(i,0);
                A.set(j,1);
                i++;
            }
            j++;
        }
        return A;
    }
    public static void main(String[] args) {
        _007QuickSort01_1 obj = new _007QuickSort01_1();
        ArrayList<Integer> al = new ArrayList<>();
        al.add(0);al.add(1);al.add(1);al.add(0);al.add(0);al.add(1);
        System.out.println(obj.sort01(al));
    }
}
