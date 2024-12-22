import java.util.List;

public class _004RecursionPrintArray {
    public void PrintArray(List<Integer> A) {
        print(A,A.size());
        System.out.println();
    }
    public void print(List<Integer> A, int size){
        if(size==0){
            //System.out.print(A.get(0));
            return;
        }
        print(A,--size);
        System.out.print(A.get(size)+" ");
    }
    public static void main(String[] args) {
        List l1 = List.of(6, -2, 5, 3);
        _004RecursionPrintArray obj = new _004RecursionPrintArray();
        obj.PrintArray(l1);
    }
}
