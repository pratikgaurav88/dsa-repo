import java.util.ArrayList;
import java.util.List;

public class _006CountSort2 {
    public void solve_positive(ArrayList<Integer> al){
        ArrayList<Integer> frequency = new ArrayList<>();
        for(int i=0;i<10;i++){
            frequency.add(0);
        }
        int index;
        for(int i=0;i<al.size();i++){
            index=al.get(i);
            frequency.set(index, frequency.get(index)+1);
        }
        System.out.println(frequency);
        int currentIndex=0;
        int currentValue;
        for(int i=0;i<frequency.size();i++){
            currentValue=frequency.get(i);
            for(int j=1;j<=currentValue;j++){
                al.set(currentIndex++,i);
            }
        }
        System.out.println(al);
    }
    public void solve_negative(ArrayList<Integer> al){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<al.size();i++){
            if(max<al.get(i)){
                max=al.get(i);
            }
            else if(min>al.get(i)){
                min=al.get(i);
            }
        }
        System.out.println("al.size() :: "+al.size());
        System.out.println("min :: "+min);
        System.out.println("max :: "+max);
        ArrayList<Integer> frequency=new ArrayList<>();
        for(int i=0;i<(max-min+1);i++){
            frequency.add(0);
        }
        System.out.println(frequency.size());
        int currentIndex;
        for(int i=0;i<al.size();i++){
            currentIndex=al.get(i)+5;
            frequency.set(currentIndex,frequency.get(currentIndex)+1);
        }
        System.out.println(frequency);
        currentIndex=0;
        int currentValue;
        for(int i=0;i<frequency.size();i++){
            currentValue=frequency.get(i);
            for(int j=1;j<=currentValue;j++){
                al.set(currentIndex++, i+min);
            }
        }
        System.out.println("al.size() :: "+al.size());
        System.out.println(al);
    }
    public void solve_aboveTen(List<Integer> al){
        System.out.println("-->>:: "+al);
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<al.size();i++){
            if(min>al.get(i)){
                min=al.get(i);
            }
            if(max<al.get(i)){
                max=al.get(i);
            }
        }
        System.out.println("MIN :: "+min);
        System.out.println("MAX :: "+max);
        ArrayList<Integer> frequencyList=new ArrayList<>();
        for(int i=0;i<max-min+1;i++){
            frequencyList.add(0);
        }
        int currentValue;
        for(int i=0;i<al.size();i++){
            currentValue=al.get(i)-min;
            //System.out.println(currentValue);
            frequencyList.set(currentValue,frequencyList.get(currentValue)+1);
        }
        
        System.out.println("frequency :: "+frequencyList);
        int currentIndex=0;
        for(int i=0;i<frequencyList.size();i++){
            currentValue=frequencyList.get(i);
            for(int j=1;j<=currentValue;j++){
                al.set(currentIndex++, i+min);
            }
        }
        System.out.println(al);
    }
    public static void main(String[] args) {
        _006CountSort2 obj = new _006CountSort2();
        //ArrayList<Integer> al = new ArrayList<>();
        //al.add(-4);al.add(-5);al.add(-5);al.add(4);al.add(4);al.add(2);al.add(2);al.add(8);al.add(3);al.add(3);al.add(1);al.add(3);al.add(3);
        //obj.solve(List.of(4, 2, 2, 8, 3, 3, 1));
        //System.out.println(al);
        //obj.solve_positive(al);
        //obj.solve_negative(al);
        ArrayList<Integer> list = new ArrayList<>();
        //list.add(10);list.add(9);list.add(8);list.add(10);list.add(12);
        list.add(2);list.add(1);list.add(7);list.add(5);list.add(8);
        obj.solve_aboveTen(list);
    }
}
