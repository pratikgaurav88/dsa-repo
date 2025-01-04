import java.util.ArrayList;

public class _006CountSortRevision {
    public ArrayList<Integer> sortColors(ArrayList<Integer> A) {
        int minimun=Integer.MAX_VALUE;
        int maximum=Integer.MIN_VALUE;
        for(int i=0;i<A.size();i++){
            if(minimun>A.get(i)){
                minimun=A.get(i);
            }
            if(maximum<A.get(i)){
                maximum=A.get(i);
            }
        }
        ArrayList<Integer> frequency = new ArrayList<>();
        for(int i=0;i<maximum-minimun+1;i++){
            frequency.add(0);
        }
        int currentIndex;
        for(int i=0;i<A.size();i++){
            currentIndex=A.get(i)-minimun;
            frequency.set(currentIndex,frequency.get(currentIndex)+1);
        }
        currentIndex=0;
        int currentElement;
        for(int i=0;i<frequency.size();i++){
            currentElement=frequency.get(i);
            for(int j=1;j<=currentElement;j++){
                A.set(currentIndex++,i+minimun);
            }
        }
        //System.out.println(frequency);
        return A;
    }
    public static void main(String... args){
        _006CountSortRevision obj = new _006CountSortRevision();
        ArrayList<Integer> al = new ArrayList<>();
        al.add(0);al.add(1);al.add(2);al.add(0);al.add(1);al.add(2);
        //al.add(5);al.add(6);al.add(7);al.add(7);
        System.out.println(obj.sortColors(al));
    }
}
