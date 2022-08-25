import java.util.*;
public class Solution
{
public static int minSubarraySum(ArrayList<Integer> arr, int n, int k)
    {
        // Write your code here.
        int i=0;
    int min = 0;
    for(i=0;i<k;i++){
        min += arr.get(i);
    }
    int sum = min;
    for(;i<n;i++){
        sum+=arr.get(i)-arr.get(i-k);
        min = Math.min(min,sum);
    }
    return min;
    }
}
