# Report. Kadane's Algorithm.
This repository contains my implementation of Kadane's Algorithm
that finds the maximum subarray sum in a given array, which also
tracks performance metrics such as comparisons and array accesses
(swaps or allocations are not needed for this algorithm).
This project follows the required GitHub workflow, repository 
structure, and includes benchmarking, testing, and performance analysis.
## GitHub workflow.
There are branches:  
**main** - contains stable releases.  
**feature/algorithm** - contains Kadane's Algorithm implementation + additional 
that is responsible for printing output of algorithm in required form.  
**feature/metrics** - PerformanceTracker and CSV Exporter for collecting and exporting 
performance metrics.  
**feature/testing** - unit tests and their results in CSV + plots based on CSV data.  
**feature/cli** - Benchmark Runner for executing benchmarks on different input sizes.

## Implementation.
This is implementation of Kadane's Algorithm - single-pass 
maximum subarray sum with position tracking.
**The optimization** - Tracks start and end indices of the maximum subarray, not just the sum. 
It also collects metrics such as comparisons and array accesses

## How it works.
Kadanes`s Algorithm maintains two variables while scanning the array:  
- **currentMax**, maximum subarray sum ending at the current position  
- **globalMax**, maximum subarray sum found so far.  
  
For each element arr[i] the algorithm decides whether to **start a new array**
at arr[i], or **extend the existing subarray** by adding arr[i].  

Essentially, Kadane's algorithms works like this:  
**currentMax = Math.max(arr[i], arr[i]+currentMax);  
globalMax = Math.max(currentMax, globalMax);**  

But my implementation also tracks startIndex and endIndex, so the main part of algorithm
slightly differs. 


##  Testing.
Unit tests cover:   
- empty arrays (throws IllegalArgumentException),   
- single element arrays, 
- arrays with all negative values,
- arrays with all positive values, 
- arrays with mixed (negative and positive) values.
## Validation. 
Cross-checked with brute-force maximum subarray implementation for correctness.   
Benchmarks executed for input sizes: 100, 1,000, 10,000, 100,000.   
Results exported to CSV and plotted.
## Complexity
Time Complexity Θ(n), Space complexity O(1) for all
best case, average case, worst case.  
Because Kadane`s algorithm always scans the array just once, updating 
running totals, so complexity is linear in all cases and space usage remains constant.
## Constant Factor and Practical Performance.
Although the algorithm's complexity is linear, real execution time depends on 
constant factors such as loop overhead and system performance, and garbage collection behaviour.  
Despite these practical factors, Kadane`s algorithm demonstrates excellent real-time performance,
confirming it is efficient in practice.

## Sample Benchmark Output
Example from **performanceResults.csv** 

ArraySize,ExecutionTime,Comparisons,ArrayAccess,Swaps,MemoryAllocations   
100,1066000,198,198,0,0   
1000,47100,1998,1998,0,0   
10000,778700,19998,19998,0,0   
100000,2838600,199998,199998,0,0  
  
As shown, comparisons and array accesses grow **linearly** with input size:  
- for n=100, ~2 ~2n comparisons/array accesses (198).  
- For n=1,000, ~2n (1,998).
- For n=10,000, ~2n (19,998).
- For n=100,000, ~2n (199,998).   
Swaps and allocations are always zero. 
## Summary
The CSV data confirms the theoretical Θ(n) time and O(1) space complexity.   
Benchmark results confirm linear scaling with input sizes.  
No additionally memory usage or unnecessary operations.  
Fully tested and validates through empirical data.   
Kadane’s algorithm is optimal for maximum subarray problem both in theory and practice.  

  
Link to Peer analysis Report (Boyer-Moore): https://github.com/IsFariza/kadanes-algorithm/blob/main/docs/Peer%20analysis%20Report%20(Boyer-Moore).pdf