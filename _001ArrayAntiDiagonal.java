import java.util.ArrayList;

/**
 * Problem Description
 * Give a N * N square matrix A, return an array of its anti-diagonals. 
 * Look at the example for more details.
 * Input 1:
    1 2 3
    4 5 6
    7 8 9
    Output 1:
    1 0 0
    2 4 0
    3 5 7
    6 8 0
    9 0 0
 */
public class _001ArrayAntiDiagonal {
    public ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> answer=new ArrayList<>();
        for(int i=0;i<(A.size()+A.get(0).size()-1);i++){
            ArrayList<Integer> temp=new ArrayList<>();
            for(int j=0;j<A.get(0).size();j++){
                temp.add(0);
            }
            answer.add(temp);
        }
        int i=0;
        int j=A.get(0).size()-1;
        
        while(j>=0 && i<A.size()){
            System.out.print(A.get(i).get(j)+" ");
            i++;
            j--;
        }
        return answer;
    }
    public static void main(String[] args) {
        ArrayList l1=new ArrayList<>();l1.add(1);l1.add(2);l1.add(3);
        ArrayList l2=new ArrayList<>();l2.add(4);l2.add(5);l2.add(6);
        ArrayList l3=new ArrayList<>();l3.add(7);l3.add(8);l3.add(9);
        ArrayList<ArrayList<Integer>> fList=new ArrayList<>();
        fList.add(l1);fList.add(l2);fList.add(l3);
        _001ArrayAntiDiagonal obj = new _001ArrayAntiDiagonal();
        //System.out.println(obj.diagonal(fList));
        obj.diagonal(fList);
    }
}
