public class _002StringReverse1 {
    public String solve(String A) {
        String[] strings=A.split(" ");
        StringBuilder sb = new StringBuilder();
        
        for(int i=strings.length-1;i>=0;i--){
            sb.append(strings[i]);
            if(i!=0){
                sb.append(" ");
            }
        }
        return String.valueOf(sb).trim();
    }
    public static void main(String[] args) {
        _002StringReverse1 obj = new _002StringReverse1();
        System.out.println(obj.solve("the sky is blue"));
    }
}
