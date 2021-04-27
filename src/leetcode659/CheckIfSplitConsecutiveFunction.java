package leetcode659;

import java.util.HashMap;

public class CheckIfSplitConsecutiveFunction {
    public boolean isPossible(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // This will keep track if there is more than 3 consecutive numbers
        HashMap<Integer, Integer> mapChecker = new HashMap<>();
        
        // Count all the numbers first
        for(int i : nums){
            map.put(i, map.getOrDefault(i,0) + 1);
        }
        
        // i is the elements
        for(int i : nums){
        	// 0 means visited
            if(map.get(i) == 0){
                continue;
            } else if (mapChecker.getOrDefault(i, 0) > 0){ // This means we have a consecutive that is 4 or more
                mapChecker.put(i, mapChecker.get(i) - 1);
                mapChecker.put(i + 1, mapChecker.getOrDefault(i + 1,0) + 1);
            } else if (map.getOrDefault(i + 1,0) > 0 && map.getOrDefault(i + 2, 0) > 0){ // Checking for the next two numbers
                map.put(i + 1, map.get(i + 1) - 1);
                map.put(i + 2, map.get(i + 2) - 1);
                
                // Update the mapChecker in case there is more than 3
                mapChecker.put(i + 3, mapChecker.getOrDefault(i + 3, 0) + 1);
            } else {
            	// If none of the above cases pass, it is not consecutive
                return false;
            }
            
            map.put(i, map.get(i) - 1);
        }
        
        // If all cases pass, return true
        return true;
    }
}
