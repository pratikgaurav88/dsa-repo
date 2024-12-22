import java.util.ArrayList;
import java.util.List;

public class _006MergeList { //TC: N & SC: N
    public void solve(List<Integer> al){
        ArrayList<Integer> evenList = new ArrayList<>();
        ArrayList<Integer> oddList = new ArrayList<>();
        ArrayList<Integer> finalList = new ArrayList<>();
        for(int i=0;i<al.size();i++){
            if((al.get(i)&1)==1){
                oddList.add(al.get(i));
            }
            else{
                evenList.add(al.get(i));
            }
        }
        System.out.println("even ::"+evenList);
        System.out.println("odd  :: "+oddList);
        int oddIndex=0,evenIndex=0;
        
        while(oddIndex<oddList.size() && evenIndex<evenList.size()){
            if(evenList.get(evenIndex) <  oddList.get(oddIndex)){
                finalList.add(evenList.get(evenIndex++));
            }
            else{
                finalList.add(oddList.get(oddIndex++));
            }
        }
        while(oddIndex<oddList.size()){
            finalList.add(oddList.get(oddIndex++));
        }
        while(evenIndex<evenList.size()){
            finalList.add(evenList.get(evenIndex++));
        }
        System.out.println(finalList);
    }
    //Practice 1.
    public void solve_1(List<Integer> al){
        System.out.println(al);
        ArrayList<Integer> evenList = new ArrayList<>();
        ArrayList<Integer> oddList = new ArrayList<>();
        ArrayList<Integer> finalList = new ArrayList<>();
        int currentElement;
        for(int i=0;i<al.size();i++){
            currentElement=al.get(i);
            if((currentElement&1)==1){
                evenList.add(currentElement);
            }
            else{
                oddList.add(currentElement);
            }
        }
        System.out.println(evenList);
        System.out.println(oddList);
        int eI=0,oI=0;
        while(eI<evenList.size() && oI<oddList.size()){
            if(evenList.get(eI) < oddList.get(oI)){
                finalList.add(evenList.get(eI++));
            }
            else{
                finalList.add(oddList.get(oI++));
            }
        }
        while(eI<evenList.size()){
            finalList.add(evenList.get(eI++));
        }
        while(oI<oddList.size()){
            finalList.add(oddList.get(oI++));
        }
        System.out.println(finalList);
    }
    public void solve3(List<Integer> al){
        System.out.println(al);
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> finalList = new ArrayList<>();
        for(int i=0;i<al.size();i++){
            if((al.get(i)&1)==1){
                odd.add(al.get(i));
            }
            else{
                even.add(al.get(i));
            }
        }
        System.out.println("Even List :: "+even);
        System.out.println("Odd List :: "+odd);
        int ep=0,op=0;
        while(ep< even.size() && op<odd.size()){
            if(even.get(ep) <= odd.get(op)){
                finalList.add(even.get(ep++));
            }
            else{
                finalList.add(odd.get(op++));
            }
        }
        while(ep<even.size()){
            finalList.add(even.get(ep++));
        }
        while(op<odd.size()){
            finalList.add(odd.get(op++));
        }
        System.out.println(finalList);
    }
    public static void main(String... args){
        _006MergeList obj = new _006MergeList();
        //cls
        //obj.solve3(List.of(2,5,4,8,11,13,10,15,21));
        obj.solve3(List.of(6,3,3,6,7,8,7,3,7));
        //obj.solve_1(List.of(11,2));
    }
}
