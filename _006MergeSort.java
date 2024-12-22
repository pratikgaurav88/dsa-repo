import java.util.ArrayList;

public class _006MergeSort {
    public ArrayList merge_sort(ArrayList<Integer> al,int leftIndex,int rightIndex){
        if(leftIndex==rightIndex){
            System.out.println("Return Statement :: "+al.get(leftIndex));
            return al;}
        int midIndex=((leftIndex+rightIndex)/2);
        
        merge_sort(al, leftIndex, midIndex);
        merge_sort(al, midIndex+1, rightIndex);
        
        return merge(al, leftIndex, midIndex, rightIndex);
    }
    public ArrayList merge(ArrayList<Integer> al,int left,int mid,int right){
        ArrayList<Integer> leftList = new ArrayList<>();
        ArrayList<Integer> rightList = new ArrayList<>();
        for(int i=left;i<=mid;i++){
            leftList.add(al.get(i));
        }
        for(int i=mid+1;i<=right;i++){
            rightList.add(al.get(i));
        }
        System.out.println("Right List :: "+rightList);
        System.out.println("Left List :: "+leftList);
        int lc=0,rc=0,alc=left;
        while(lc<leftList.size() && rc<rightList.size()){
            if(leftList.get(lc) <= rightList.get(rc)){
                al.set(alc++,leftList.get(lc++));
            }
            else if(rightList.get(rc)< leftList.get(lc)){
                al.set(alc++,rightList.get(rc++));
            }
        }
        while(lc<leftList.size()){
            al.set(alc++,leftList.get(lc++));
        }
        while(rc<rightList.size()){
            al.set(alc++, rightList.get(rc++));
        }
        System.out.println(al);
        return al;
    }
    public static void main(String[] args) {
        _006MergeSort obj = new _006MergeSort();
        ArrayList al = new ArrayList<>();
        //al.add(2);al.add(5);al.add(4);al.add(8);al.add(11);al.add(13);al.add(10);al.add(15);al.add(21);
        //al.add(1);al.add(4);al.add(10);al.add(2);al.add(1);al.add(5);
        al.add(3);al.add(7);al.add(1);
        obj.merge_sort(al, 0, al.size()-1);
        //obj.merge(al, 0, al.size()/2, al.size()-1);
    }
}
