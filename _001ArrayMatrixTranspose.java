import java.util.ArrayList;

public class _001ArrayMatrixTranspose {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {
        int temp;
        for(int i=0;i<A.size();i++){
            temp=0;
            for(int j=i+1;j<A.get(i).size();j++){
                temp=A.get(i).get(j);
                A.get(i).set(j,A.get(j).get(i));
                A.get(j).set(i,temp);
            }
        }
        return A;
    }
    public static void main(String[] args) {
        ArrayList al1 = new ArrayList<>();al1.add(1);al1.add(2);al1.add(3);
        ArrayList al2 = new ArrayList<>();al2.add(4);al2.add(5);al2.add(6);
        ArrayList al3 = new ArrayList<>();al3.add(7);al3.add(8);al3.add(9);
        ArrayList<ArrayList<Integer>> data=new ArrayList<>();
        data.add(al1);data.add(al2);data.add(al3);
        _001ArrayMatrixTranspose obj = new _001ArrayMatrixTranspose();
        System.out.println(obj.solve(data));
    }
}
