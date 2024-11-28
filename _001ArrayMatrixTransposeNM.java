import java.util.ArrayList;

public class _001ArrayMatrixTransposeNM {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> answer = new ArrayList<>();
        for(int i=0;i<A.get(0).size();i++){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j=0;j<A.size();j++){
                temp.add(A.get(j).get(i));
            }
            answer.add(temp);
        }
        return answer;
    }
    public static void main(String[] args) {
        ArrayList al1 = new ArrayList<>();al1.add(1);al1.add(2);al1.add(3);al1.add(4);
        ArrayList al2 = new ArrayList<>();al2.add(5);al2.add(6);al2.add(7);al2.add(8);
        ArrayList al3 = new ArrayList<>();al3.add(9);al3.add(10);al3.add(11);al3.add(12);
        ArrayList<ArrayList<Integer>> data=new ArrayList<>();
        data.add(al1);data.add(al2);data.add(al3);
        _001ArrayMatrixTransposeNM obj = new _001ArrayMatrixTransposeNM();
        System.out.println(obj.solve(data));
    }
}
