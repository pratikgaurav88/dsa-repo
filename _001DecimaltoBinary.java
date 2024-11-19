/**
 * Problem Description
 * You are given an integer A in decimal (base 10).
 * Return a string denoting the binary (base 2) form of the integer A.
 * Input Format
 * The first line of input contains the integer T, denoting the number of test cases.
 * Next T lines contain a single integer A, denoting the integer for that test case.
 * Output Format
 * Print T lines. In each line, print the string denoting the binary representation of A.
 */
public class _001DecimaltoBinary {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scanner = new Scanner(System.in);
        int loopInput=scanner.nextInt();
        for(int i=0;i<loopInput;i++){
            int dataInput=scanner.nextInt();
            String answer="";
            while(dataInput>0){
                answer=(dataInput%2)+answer;
                dataInput/=2;
            }
            System.out.println(answer);
        }
    }
}
