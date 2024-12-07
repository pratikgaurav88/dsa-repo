public class _004Recursion1ToA {
    public static void solve(int A) {
        if(A==1){
            System.out.print(A+" ");
            return;    
        }
        solve(A-1);
        System.out.print(A+" ");
    }
    public static void main(String[] args) {
        _004Recursion1ToA.solve(17);
    }
}
