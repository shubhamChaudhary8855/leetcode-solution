class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;
        int left = 0;
        int maxCount  =0;
        for(int right =0;right<s.length();right++){
            char ch = s.charAt(right);
            if(ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u'){
                count++;
            }
            if(right - left + 1 == k){
                maxCount = Math.max(maxCount, count);
                char charleft = s.charAt(left);
                if(charleft == 'a'||charleft == 'e'||charleft =='i'||charleft == 'o'||charleft == 'u'){
                    count--;
                }
                left++;
            }
            
        }
        return maxCount;
    }
}