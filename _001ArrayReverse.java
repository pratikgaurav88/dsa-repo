/**
 * Problem Description
 * Given an integer array A of size N and an integer B, 
 * you have to return the same array after rotating it B times towards the right.
 * Example Input
 * Input 1:
 * A = [1, 2, 3, 4]
 * B = 2
 * Input 2:
 * A = [2, 5, 6]
 * B = 1
 * Example Output
 * Output 1:
 * [3, 4, 1, 2]
 * Output 2:
 * [6, 2, 5]
*/

import java.util.ArrayList;

public class _001ArrayReverse {
    public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        if(B>A.size()){
            B = B % A.size();
        }
        reverse(A, 0, A.size()-1);
        reverse(A,0,B-1);
        reverse(A, B, A.size()-1);
        return A;
    }
    private ArrayList<Integer> reverse(ArrayList<Integer> A,int start,int end){
        int temp;
        while(start<end){
            temp=A.get(start);
            A.set(start,A.get(end));
            A.set(end,temp);
            start++;
            end--;
        }
        //System.out.println("Temp :: "+A);
        return A;
    }
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);al.add(3);al.add(5);al.add(7);al.add(9);al.add(11);al.add(13);
        System.out.println(al);
        _001ArrayReverse obj = new _001ArrayReverse();
        System.out.println(obj.solve(al, 8));
    }
}
