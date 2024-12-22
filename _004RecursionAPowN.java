public class _004RecursionAPowN {
    public Long power1(int A, int B) {
        if(B==0){
            return (long)1;
        }
        return A * power(A,--B);
    }
    public Long power(int A, int B) {
        if(B==0){
            return 1L;
        }
        long pow=power(A, B/2);
        if(B%2==0){
            return pow * pow;
        }
        else{
            return pow * pow * A;
        }

    }
    public static void main(String[] args) {
        _004RecursionAPowN obj = new _004RecursionAPowN();
        //System.out.println(obj.power(2, 5));
        System.out.println(obj.power(10, 2));
        System.out.println(obj.power(10, 3));
        System.out.println(obj.power(10, 4));
        System.out.println(obj.power(10, 5));
    }
}
