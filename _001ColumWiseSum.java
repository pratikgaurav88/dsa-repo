import java.util.ArrayList;

public class _001ColumWiseSum {
    public ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A) {
        int tempSum;
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<A.get(0).size();i++){
            tempSum=0;
            for(int j=0;j<A.size();j++){
                tempSum+=A.get(j).get(i);
            }
            al.add(tempSum);
        }
        return al;
    }
    public static void main(String[] args) {
        ArrayList l1=new ArrayList<>();l1.add(1);l1.add(2);l1.add(3);l1.add(4);
        ArrayList l2=new ArrayList<>();l2.add(1);l2.add(2);l2.add(3);l2.add(4);
        ArrayList l3=new ArrayList<>();l3.add(1);l3.add(2);l3.add(3);l3.add(4);
        ArrayList<ArrayList<Integer>> fList=new ArrayList<>();
        fList.add(l1);fList.add(l2);fList.add(l3);
        _001ColumWiseSum obj = new _001ColumWiseSum();
        System.out.println(fList);
        System.out.println(obj.solve(fList));
    }
}
