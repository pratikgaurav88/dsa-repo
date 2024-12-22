/*
 * Problem Description
 * SCALER organizes a series of contests aimed at helping learners enhance their coding skills. 
 * Each learner can participate in multiple contests, and their participation is represented by integers in an array. 
 * The goal is to identify how frequently each learner has participated in these contests. 
 * This information will help SCALER determine which learners are participating the least,
 * allowing them to provide targeted support and encouragement.
 * Given an array A that represents the participants of various contests, 
 * where each integer corresponds to a specific learner, 
 * and an array B containing the learners for whom you want to check participation frequency, 
 * your task is to find the frequency of each learner from array B in the array A and return a list containing all these frequencies
 * 
 * Input 1:
 * A = [1, 2, 1, 1]
 * B = [1, 2]
 * Input 2:
 * A = [2, 5, 9, 2, 8]
 * B = [3, 2]
 * Output 1:
 * [3, 1]
 * Output 2:
 * [0, 2]
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class _005HashMapFrequency {
    public ArrayList<Integer> solve(List<Integer> A, List<Integer> B) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        System.out.println(hm);
        int value;
        for(int i=0;i<A.size();i++){
            value=A.get(i);
            if(hm.containsKey(value)){
                int temp=hm.get(value);
                hm.put(value, temp+1);
            }
            else{
                hm.put(value, 1);
            }
        }
        System.out.println(hm);
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i=0;i<B.size();i++){
            if(hm.containsKey(B.get(i))){
                answer.add(hm.get(B.get(i)));
            }
            else{
                answer.add(0);
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        _005HashMapFrequency obj = new _005HashMapFrequency();
        System.out.println(obj.solve(List.of(6,7,10,3,10,10,3,10), List.of(1,1,6,6,7,7,6,4,9)));
    }
}
