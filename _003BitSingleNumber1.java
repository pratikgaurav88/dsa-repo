import java.util.ArrayList;
import java.util.List;

public class _003BitSingleNumber1 {
    public ArrayList<Integer> solve(List<Integer> A) {
        ArrayList<Integer> answer = new ArrayList<>();
        int xorvalue=0;
        int xorindex=0;
        int num1=0;
        int num2=0;
        for(int i=0;i<A.size();i++){
            xorvalue^=A.get(i);

        }
        System.out.println("xorvalue :: "+xorvalue);
        for(int i=0;i<32;i++){
            if((xorvalue & 1<<i) > 0){
                xorindex=i;
                break;
            }
        }
        System.out.println("XOR Index :: "+xorindex);
        for(int i=0;i<A.size();i++){
            if((A.get(i) & 1<<xorindex) > 0){
                num1^=A.get(i);
            }
            else{
                num2^=A.get(i);
            }
        }
        answer.add(num1);
        answer.add(num2);
        return answer;
    }
    
    public static void main(String[] args) {
        //List l1 = List.of(1, 2, 3, 1, 2, 4);
        //List l1 = List.of(186,256,102,377,186,377);
        List l1 = List.of(2308,1447,1918,1391,2308,216,1391,410,1021,537,1825,1021,1729,669,216,1825,537,1995,805,410,805,602,1918,1447,90,1995,90,1540,1161,1540,2160,1235,1161,602,880,2160,1235,669);
        _003BitSingleNumber1 obj = new _003BitSingleNumber1();
        ArrayList<Integer> temp=obj.solve(l1);
        System.out.println("temp :: "+temp);
    }
}
