import java.util.*;
public class Solution {
	public static int maxAreaContainer(ArrayList<Integer> arr) {
		// Write your code here.
        int i=0, n=arr.size()-1;
        int ans = 0;
        while(i<n){
            int x = Math.min(arr.get(i),arr.get(n));
//             System.out.println("x="+x);
            ans = Math.max(ans,(n-i)*x);
            
//             System.out.println("ans="+ans);
            if(arr.get(i)<arr.get(n)){i++;}
            else{n--;}
        }
        return ans;
	}
}
