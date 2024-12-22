/*
 * Problem Description
 * You are given an array A of N integers. Return the count of elements with frequncy 1 in the given array.
 * Input 1:
 * A = [3, 4, 3, 6, 6]
 * Input 2:
 * A = [3, 3, 3, 9, 0, 1, 0]
 * Output 1:
 * 1
 * Output 2:
 * 2
 */

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _005CountUniqueElements {
    public int solve(List<Integer> A) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int answer=0;
        int key;
        for(int i=0;i<A.size();i++){
            key=A.get(i);
            if(hm.containsKey(key)){
                hm.put(key,hm.get(key)+1);
            }
            else{
                hm.put(A.get(i),1);
            }
        }
        for(Map.Entry<Integer,Integer> entry:hm.entrySet()){
            if(entry.getValue()==1){
                answer+=1;
            }
        }
        System.out.println(hm);
        return answer;
    }
    public static void main(String[] args) {
        _005CountUniqueElements obj = new _005CountUniqueElements();
        System.out.println(obj.solve(List.of(3, 3, 3, 9, 0, 1, 0)));
    }
}
