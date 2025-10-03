package org.example.algorithms;

public class KadanesAlgorithmOutput {


    private final int maxSum;
    private final int startIndex;
    private final int endIndex;

    public KadanesAlgorithmOutput(int maxSum, int startInd, int endInd){
        this.maxSum=maxSum;
        this.startIndex = startInd;
        this.endIndex = endInd;
    }

    public int getMaxSum(){
        return maxSum;
    }

    public int getStartIndex(){
        return startIndex;
    }

    public int getEndIndex(){
        return endIndex;
    }

    @Override
    public String toString(){
        return "Max sum: " + getMaxSum() + "\nStart Index: " + getStartIndex()+ "\nEnd Index: " + getEndIndex();
    }
}
