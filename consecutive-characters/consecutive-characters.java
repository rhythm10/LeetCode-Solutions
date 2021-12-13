class Solution {
    public int maxPower(String s) {
        
        int max = 0;
        int countmax = 0;
        char prev = ' ';
        
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == prev)
            {
                countmax++;
            }
            else
            {
                countmax = 1;
                prev = s.charAt(i);
            }
            max = Math.max(max,countmax);
        }
        return max;
    }
}