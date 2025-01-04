import java.util.ArrayList;
import java.util.Comparator;

public class _008ComparatorLargest implements Comparator<Integer>{
    public String largestNumber(ArrayList<Integer> A) {
        //Collections.sort(A,new _008ComparatorLargest());
        int zerocount=0;
        for(int i=0;i<A.size();i++){
            if(A.get(i)==0){
                zerocount++;
            }
        }
        if(zerocount==A.size()){
            return "0";
        }
        else{
            A.sort(this);
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<A.size();i++){
                sb.append(A.get(i));
            }
        
            return sb.toString();
        }
    }
    @Override
    public int compare(Integer i1,Integer i2){
        String str1=i1+""+i2;
        String str2=i2+""+i1;
        if(Long.valueOf(str1)<=Long.valueOf(str2)){
            return 1;
        }
        else if(Long.valueOf(str1)>Long.valueOf(str2)){
            return -1;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        _008ComparatorLargest obj = new _008ComparatorLargest();
        ArrayList<Integer> al = new ArrayList<>();
        //al.add(0);al.add(0);al.add(0);al.add(0);
        //al.add(8);al.add(89);
        //al.add(3);al.add(30);al.add(34);al.add(5);al.add(9);
        al.add(9);al.add(99);al.add(999);al.add(9999);al.add(9998);
        System.out.println(obj.largestNumber(al));
    }
}
