/*
 * Problem Description
 * There are A beggars sitting in a row outside a temple. Each beggar initially has an empty pot. 
 * When the devotees come to the temple, they donate some amount of coins to these beggars. 
 * Each devotee gives a fixed amount of coin(according to their faith and ability) to some K beggars sitting next to each other.
 * Given the amount P donated by each devotee to the beggars ranging from L to R index, where 1 <= L <= R <= A, 
 * find out the final amount of money in each beggar's pot at the end of the day, 
 * provided they don't fill their pots by any other means.
 * For ith devotee B[i][0] = L, B[i][1] = R, B[i][2] = P, given by the 2D array B
 * 
 * Input 1:-
 * A = 5
 * B = [[1, 2, 10], [2, 3, 20], [2, 5, 25]]
 * Output 1:-
 * 10 55 45 25 25
 */
import java.util.ArrayList;
import java.util.List;

public class _001ArrayBeggarProblem {

    public ArrayList<Integer> solve(int A, List<List<Integer>> B) {
        ArrayList<Integer> answer=new ArrayList<>();
        for(int i=0;i<A;i++){
            answer.add(0);
        }
        System.out.println(answer);
        int left=0;
        int right=0;
        int value=0;
        for(int i=0;i<B.size();i++){
            left=B.get(i).get(0)-1;
            right=B.get(i).get(1);
            value=B.get(i).get(2);

            answer.set(left, answer.get(left)+value);

            /*if(right>=answer.size()){
                answer.set(answer.size()-1, answer.get(answer.size()-1));
            }*/
            if(right<answer.size()){
                answer.set(right,answer.get(right)-value);
            }
            System.out.println("Middle :: "+answer);
        }
        System.out.println(answer);
        for(int i=1;i<answer.size();i++){
            answer.set(i, answer.get(i)+answer.get(i-1));
        }
        System.out.println(answer);
        return answer;
    }
    public static void main(String[] args) {
        List l1 = List.of(1,2,10);
        List l2 = List.of(2,3,20);
        List l3 = List.of(2,5,25);
        List mainList = List.of(l1,l2,l3);
        _001ArrayBeggarProblem obj = new _001ArrayBeggarProblem();
        obj.solve(5, mainList);
    }
}
