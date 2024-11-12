/**
 * Say you have an array, A, for which the ith element is the price of a given stock on day i.
 * If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), 
 * design an algorithm to find the maximum profit.
 * Return the maximum possible profit.
 * 
 * 
 * Solution Approach :: 
 * Here smax is the arraylist of max from right hand side,
 * thought process is: we need to get all max, which can’t be achived from
 * left hand side.
 * ex : [1, 4, 5, 2, 4] it will yeild [1, 4, 5, 5, 5]
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _001StocksBuySell {

    public int maxProfit(final List<Integer> A) {
        if (A.isEmpty()) {
            return 0;
        } else {
            int answer = 0;
            ArrayList<Integer> smax = new ArrayList<>();
            for (int i = 0; i < A.size(); i++) {
                smax.add(0);
            }
            int max = A.get(A.size() - 1);
            for (int i = A.size() - 1; i >= 0; i--) {
                max = Math.max(max, A.get(i));
                smax.set(i, max);
            }
            System.out.println(smax);
            for (int i = 0; i < A.size(); i++) {
                answer = Math.max(answer, smax.get(i) - A.get(i));
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1, 4, 5, 2, 4);
        _001StocksBuySell obj = new _001StocksBuySell();
        System.out.println(input);
        System.out.println(obj.maxProfit(input));;
    }
}
