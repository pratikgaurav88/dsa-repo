import java.util.ArrayList;

public class _005PairSumDivisibleByM {
    public int solve(ArrayList<Integer> A, int B) {
        int answer = 0;
        for(int i=0;i<A.size();i++){
            A.set(i, A.get(i)%B);
        }
        System.out.println(A);
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i=0;i<B;i++){
            temp.add(0);
        }
        System.out.println(temp);
        int index;
        for(int i=0;i<A.size();i++){
            index=A.get(i);
            if(index==0){
                answer+=temp.get(index);
                System.out.println("answer WIP :: "+answer);
            }
            else{
                int x=B-index;
                answer+=temp.get(x);
                System.out.println("answer WIP :: "+answer);
            }
            temp.set(index,temp.get(index)+1);
        }
        System.out.println(temp);
        int check = power(10,9)+7;
        return answer%check;

    }
    public int power(int i,int j){
        if(j==0){
            return 1;
        }
        int pow=power(i,j/2);
        if(j%2==0){
            return pow*pow;
        }
        else{
            return pow*pow*i;
        }
    }
    public static void main(String[] args) {
        _005PairSumDivisibleByM obj = new _005PairSumDivisibleByM();
        ArrayList<Integer> al = new ArrayList<>();
        al.add(2);al.add(3);al.add(4);al.add(8);al.add(6);
        al.add(15);al.add(5);al.add(12);al.add(17);al.add(7);al.add(18);
        System.out.println(obj.solve(al, 6));
    }
}
