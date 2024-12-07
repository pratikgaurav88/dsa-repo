public class _003BitCount {
    public int numSetBits(int A) {
        int counter=0;
        
        while(A>0){
            if((A & 1) ==1){
                counter++;
            }
            A=A>>1;
        }
        return counter;
    }
    public static void main(String[] args) {
        _003BitCount obj = new _003BitCount();
        System.out.println(obj.numSetBits(929217377));
    }
}
