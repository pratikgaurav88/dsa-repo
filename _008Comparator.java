
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

public class _008Comparator implements Comparator<Integer> {

    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        Collections.sort(A, new _008Comparator());
        return A;
    }

    @Override
    public int compare(Integer i1, Integer i2) {
        System.out.println("***************************************");
        System.out.println("i1 :: " + i1);
        System.out.println("i2 :: " + i2);
        if (!Objects.equals(i1, i2)) {
            int i1Fact = factors(i1);
            int i2Fact = factors(i2);
            if (i1Fact < i2Fact) {
                return -1;
            } else if (i1Fact > i2Fact) {
                return 1;
            } else {
                return i1 - i2;
            }
        }
        else{
            return 0;
        }
    }

    public int factors(int numToCheck) {
        int fact = 1;
        int count = 0;
        while ((numToCheck / fact) >= fact) {
            if (numToCheck % fact == 0) {
                if (numToCheck / fact == fact) {
                    count++;
                } else {
                    count += 2;
                }
            }
            fact++;
        }
        return count;
    }

    public static void main(String[] args) {
        _008Comparator obj = new _008Comparator();
        //36,13,13,26,37,28,27,43,7
        ArrayList<Integer> al = new ArrayList<>();
        al.add(36);al.add(13);al.add(13);al.add(26);al.add(37);al.add(28);al.add(27);al.add(43);al.add(7);
        System.out.println(al);
        System.out.println(obj.solve(al));

    }
}
