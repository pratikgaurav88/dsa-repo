/**
 * Problem Description
 * You are given a N X N integer matrix. You have to find the sum of all the main diagonal elements of A.
 * Main diagonal of a matrix A is a collection of elements A[i, j] such that i = j.
 */
import java.util.ArrayList;
import java.util.List;

public class _001MainDiagonalSum {
    public int solve(final List<ArrayList<Integer>> A) {
        int sum=0;
        for(int i=0;i<A.size();i++){
            sum+=A.get(i).get(i);
        }
        return sum;
    }
    public static void main(String[] args) {
        _001MainDiagonalSum obj = new _001MainDiagonalSum();
        ArrayList l1=new ArrayList<>();l1.add(1);l1.add(2);l1.add(3);
        ArrayList l2=new ArrayList<>();l2.add(1);l2.add(2);l2.add(3);
        ArrayList l3=new ArrayList<>();l3.add(1);l3.add(2);l3.add(3);
        ArrayList<ArrayList<Integer>> fList=new ArrayList<>();
        fList.add(l1);fList.add(l2);fList.add(l3);
        System.out.println(obj.solve(fList));;
    }
}
