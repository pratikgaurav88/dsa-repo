public class _005PowerFunction {
    public int pow(int A, int B, int C) {
        // Just write your code below to complete the function. Required input is available to you as the function arguments.
        // Do not print the result or any output. Just return the result via this function.
        if(A>-1){
            return (int)(power((A%C),B,C) % C);
        }
        else{
            return (int)(power((A+C)%C,B,C) % C);   
        }
        
    }
    public long power(int A,int B,int C){
        if(B==0){
            return 1;
        }
        long res=power(A,B/2,C);
        if(B%2==0){
            return (res * res)%C;
        }
        else{
            return (res * res * A)%C;
        }
    }
    public static void main(String[] args) {
        _005PowerFunction obj = new _005PowerFunction();
        System.out.println(obj.pow(2, 3, 3));
        
        //System.out.println(obj.pow(71045970,41535484,64735492));
    }
}
