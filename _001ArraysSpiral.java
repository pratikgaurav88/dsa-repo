
import java.util.ArrayList;
import java.util.List;

public class _001ArraysSpiral {
    //Step 1: Print Outer Boundary.
    public void solve(List<List<Integer>> matrix){
        int size=matrix.size();
        int left=0;
        int right=0;
        while(right<size-1){
            System.out.print(matrix.get(left).get(right)+"\t");
            right++;
        }
        
        System.out.println("\n****************************************");
        while(left<size-1){
            System.out.print(matrix.get(left).get(right)+"\t");
            left++;
        }
        System.out.println("\n****************************************");
        while(right>0){
            System.out.print(matrix.get(left).get(right)+"\t");
            right--;
        }
        System.out.println("\n****************************************");
        while(left>0){
            System.out.print(matrix.get(left).get(right)+"\t");
            left--;
        }
        System.out.println("Left :: "+left+" Right :: "+right);
    }
    //Step 2: generalising the boundaries
    public void solve1(List<List<Integer>> matrix,int size,int left,int right){
        
        while(right<size-1){
            System.out.print(matrix.get(left).get(right)+"\t");
            right++;
        }
        
        System.out.println("\n****************************************");
        while(left<size-1){
            System.out.print(matrix.get(left).get(right)+"\t");
            left++;
        }
        System.out.println("\n****************************************");
        while(right>0){
            System.out.print(matrix.get(left).get(right)+"\t");
            right--;
        }
        System.out.println("\n****************************************");
        while(left>0){
            System.out.print(matrix.get(left).get(right)+"\t");
            left--;
        }
    }
    public void traverseTotalArray(List<List<Integer>> matrix){
        int size=matrix.size();
        int left=0;
        int right=0;
        int rightsize=0;
        while(size>matrix.size()/2){

            while(right<size-1){
                System.out.print(matrix.get(left).get(right)+"\t");
                right++;
            }
            
            System.out.println();
            while(left<size-1){
                System.out.print(matrix.get(left).get(right)+"\t");
                left++;
            }
            System.out.println();
            while(right>rightsize){
                System.out.print(matrix.get(left).get(right)+"\t");
                right--;
            }
            System.out.println();
            while(left>rightsize){
                System.out.print(matrix.get(left).get(right)+"\t");
                left--;
            }
            System.out.println();
            
            size--;
            left++;
            right++;
            rightsize++;
            //System.out.println("\nCurrent Size :: "+size+"*************left :: "+left+"*******right :: ***"+right+"*****************");
            
        }
        if(matrix.size()%2==1){
            System.out.println(matrix.get(left-1).get(right-1));
        }
    }
    public ArrayList<ArrayList<Integer>> returnNewArray(List<List<Integer>> matrix){
        ArrayList<ArrayList<Integer>> answer = new ArrayList<>();
        for(int i=0;i<matrix.size();i++){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j=0;j<matrix.size();j++){
                temp.add(0);
            }
            answer.add(temp);
        }
        int size=matrix.size();
        int left=0;
        int right=0;
        int rightsize=0;
        while(size>matrix.size()/2){

            while(right<size-1){
                //System.out.print(matrix.get(left).get(right)+"\t");
                answer.get(left).set(right,matrix.get(left).get(right));
                right++;
            }
            
            //System.out.println();
            while(left<size-1){
                answer.get(left).set(right,matrix.get(left).get(right));
                //System.out.print(matrix.get(left).get(right)+"\t");
                left++;
            }
            //System.out.println();
            while(right>rightsize){
                answer.get(left).set(right,matrix.get(left).get(right));
                //System.out.print(matrix.get(left).get(right)+"\t");
                right--;
            }
            //System.out.println();
            while(left>rightsize){
                answer.get(left).set(right,matrix.get(left).get(right));
                //System.out.print(matrix.get(left).get(right)+"\t");
                left--;
            }
            //System.out.println();
            
            size--;
            left++;
            right++;
            rightsize++;
            //System.out.println("\nCurrent Size :: "+size+"*************left :: "+left+"*******right :: ***"+right+"*****************");
            
        }
        if(matrix.size()%2==1){
            answer.get(left).set(right,matrix.get(left).get(right));
            //System.out.println(matrix.get(left-1).get(right-1));
        }
        return answer;
    }
    public ArrayList<ArrayList<Integer>> spiralMatrix(int number){
        ArrayList<ArrayList<Integer>> answer = new ArrayList<>();
        int counter=1;
        for(int i=0;i<number;i++){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j=0;j<number;j++){
                temp.add(0);
            }
            answer.add(temp);
        }
        int size=number;
        int left=0;
        int right=0;
        int rightsize=0;
        while(size>number/2){

            while(right<size-1){
                answer.get(left).set(right,counter++);
                right++;
            }
            
            while(left<size-1){
                answer.get(left).set(right,counter++);
                left++;
            }
            while(right>rightsize){
                answer.get(left).set(right,counter++);
                right--;
            }
            while(left>rightsize){
                answer.get(left).set(right,counter++);
                left--;
            }
            
            size--;
            left++;
            right++;
            rightsize++;
            
        }
        if(number%2==1){
            //System.out.println("left :: "+left +" right :: "+right);
            answer.get(left-1).set(right-1,counter++);
        }
        return answer;
    }
    public static void main(String[] args) {
        List l1 = List.of( 1, 2, 3, 4,5);
        List l2 = List.of( 6, 7, 8, 9,10);
        List l3 = List.of(11,12,13,14,15);
        List l4 = List.of(16,17,18,19,25);
        List l5 = List.of(21,22,23,24,25);
        List l6 = List.of(l1,l2,l3,l4,l5);
        _001ArraysSpiral obj = new _001ArraysSpiral();
        //obj.solve(l6);
        //obj.solve1(l6,l6.size(),0,0);
        //obj.traverseTotalArray(l6);
        //System.out.println(obj.returnNewArray(l6));
        //System.out.println(obj.spiralMatrix(5));
        ArrayList<ArrayList<Integer>> temp = obj.spiralMatrix(5);
        for(int i=0;i<temp.size();i++){
            for(int j=0;j<temp.get(i).size();j++){
                System.out.print(temp.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}
