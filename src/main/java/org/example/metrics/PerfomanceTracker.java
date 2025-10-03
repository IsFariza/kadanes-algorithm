package org.example.metrics;

public class PerfomanceTracker {
    public static int comparisons=0;
    public static int arrayAccess=0;

    public static void reset(){
        comparisons=0;
        arrayAccess=0;
    }

    public static String report(){
        return "\n Comparisons: " + comparisons +
                "\nArray access: " + arrayAccess +
                "\nSwaps: 0" +
                "\nMemory allocations: 0";
    }
}
