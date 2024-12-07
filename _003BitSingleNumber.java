import java.util.ArrayList;

public class _003BitSingleNumber {
    public int singleNumber(final ArrayList<Integer> A) {
        int answer=0;
        int counter;
        int temp;
        int currentval;
        for(int i=0;i<32;i++){
            counter=0;
            for(int j=0;j<A.size();j++){
                temp=A.get(j);
                if((temp & 1<<i)>0){
                    counter++;
                }
            }    
            if(counter%3>0){
                currentval=1<<i;
                answer+=currentval;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        //List l1 = List.of(1, 2, 5, 3, 3, 2, 2, 3, 1, 1);
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(1);l1.add(2);l1.add(5);l1.add(3);l1.add(3);l1.add(2);l1.add(2);l1.add(3);l1.add(1);l1.add(1);
        _003BitSingleNumber obj = new _003BitSingleNumber();
        System.out.println("Test Value :: " + obj.singleNumber(l1));
    }
}
