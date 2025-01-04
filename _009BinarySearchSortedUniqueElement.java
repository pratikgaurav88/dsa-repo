/*
 * Problem Description
 * Given a sorted array of integers A where every element appears twice except for one element which appears once, find and return this single element that appears only once.
 * Elements which are appearing twice are adjacent to each other.
 * NOTE: Users are expected to solve this in O(log(N)) time.
 */

import java.util.*;

public class _009BinarySearchSortedUniqueElement {
    public int solve(List<Integer> A) {
        if(A.size()==1){
            return A.get(0);
        }
        else if(A.get(A.size()-1).intValue()!=A.get(A.size()-2).intValue()){
            return A.get(A.size()-1);
        }
        int start = 1;
        int end = A.size()-2;
        int mid;
        int firstOcc;
        while(start<=end){
            mid = start + (end - start)/2;
            if(A.get(mid-1).intValue() != A.get(mid).intValue() && A.get(mid).intValue() != A.get(mid+1).intValue()){
                return A.get(mid);
            }
            firstOcc=mid;
            if(A.get(mid-1).intValue() == A.get(mid).intValue()){
                firstOcc=mid-1;
            }
            if(firstOcc%2==0){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        _009BinarySearchSortedUniqueElement obj = new _009BinarySearchSortedUniqueElement();
        //System.out.println(obj.solve(List.of(1,1,2,2,3,4,4)));
        System.out.println(obj.solve(List.of(13,13,21,21,27,50,50,102,102,108,108,110,110,117,117,120,120,123,123,124,124,132,132,164,164,166,166,190,190,200,200,212,212,217,217,225,225,238,238,261,261,276,276,347,347,348,348,386,386,394,394,405,405,426,426,435,435,474,474,493,493)));
    }
}