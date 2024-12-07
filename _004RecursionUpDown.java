public class _004RecursionUpDown {
    public void DecThenInc(int A) {
        decresing(A);
        increasing(A);
    }
    public void decresing(int A){
        if(A==1){
            System.out.print(A+" ");
            return;
        }
        System.out.print(A+" ");
        decresing(A-1);
    }
    public void increasing(int A){
        if(A==1){
            System.out.print(A+" ");
            return;
        }
        increasing(A-1);
        System.out.print(A+" ");
    }
    public static void main(String... args){
        _004RecursionUpDown obj = new _004RecursionUpDown();
        obj.DecThenInc(5);
    }
}
