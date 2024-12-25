class Solution {
   public long minEnd(int n, int x) {
       // Start with x as our first number
       long current = x;
       
       // For each position after the first
       for (int i = 1; i < n; i++) {
           // Find the next number greater than current that maintains AND = x
           current = getNextNumber(current, x);
       }
       
       return current;
   }
   
   private long getNextNumber(long current, int x) {
       // Start checking from the least significant bit
       long next = current + 1;
       
       // Keep incrementing until we find a number that:
       // 1) Is greater than current
       // 2) When ANDed with x gives x
       while ((next & x) != x) {
           next++;
       }
       
       return next;
   }
}