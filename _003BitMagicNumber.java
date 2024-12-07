public class _003BitMagicNumber{
    public int solve(int A) {
        int counter=0;
        int answer=0;
        while(A>0){
            counter++;
            if((A&1)==1){
                answer+=Math.pow(5,counter);
            }
            A=A>>1;
        }
        return answer;
    }
    public static void main(String[] args) {
        _003BitMagicNumber obj = new _003BitMagicNumber();
        obj.solve(10);
    }
}