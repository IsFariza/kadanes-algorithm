package org.example.algorithms;

import org.example.metrics.PerformanceTracker;


public class KadanesAlgorithm {


    public static void main(String[] args){
        int[] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubarraySum(array));
        System.out.println(PerformanceTracker.report());
    }
    public static KadanesAlgorithmOutput maxSubarraySum(int[] arr){
        PerformanceTracker.reset();

        if(arr.length==0){
            throw new IllegalArgumentException("Array cannot be empty");
        }

        int globalMax = arr[0]; //final maximum sum of subarray
        int currentMax = arr[0]; // current maximum sum so far

        int maxStartIndex = 0; //final start index
        int maxEndIndex=0;//final end index
        int candidateStartIndex=0; //temporary start index of "candidate"


        for(int i=1;i<arr.length;i++){
            PerformanceTracker.arrayAccess+=2;
            PerformanceTracker.comparisons++;
            //whether to start new subarray at i, or extend previous subarray
            if(arr[i]>currentMax+arr[i]){
                currentMax=arr[i];
                candidateStartIndex=i; //update start index
            } else{
                currentMax+=arr[i]; //extend current subarray
            }

            //if current maximum sum is better than global, update it and the indexes of subarray
            PerformanceTracker.comparisons++;
            if(currentMax>globalMax){
                globalMax=currentMax;
                maxStartIndex=candidateStartIndex;
                maxEndIndex = i;
            }

        }

        return new KadanesAlgorithmOutput(globalMax, maxStartIndex, maxEndIndex);
    }
}
