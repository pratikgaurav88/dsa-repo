//Incomplete

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class _005HashSetSubArrayZeroSum {
    public int solve(List<Integer> A) {
        // Just write your code below to complete the function. Required input is
        // available to you as the function arguments.
        // Do not print the result or any output. Just return the result via this
        // function.
        ArrayList<Long> al = new ArrayList<>();
        al.add((long)A.get(0));
        for (int i = 1; i < A.size(); i++) {
            al.add(al.get(i - 1) + A.get(i));
        }
        HashSet<Long> hs = new HashSet<>();
        for (int i = 0; i < al.size(); i++) {
            hs.add(al.get(i));
        }
        if (hs.size() < al.size() || hs.contains(0)) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        _005HashSetSubArrayZeroSum obj = new _005HashSetSubArrayZeroSum();
        System.out.println(obj.solve(List.of(-1,1)));
    }
}
