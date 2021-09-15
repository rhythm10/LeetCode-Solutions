class Solution {
    public String reverseWords(String s) {
        
        int i = 0, j = s.length()-1;
        
        String[] res = s.split(" ");
        String result = "";

        for(String c : res)
        {
            int start = 0,end = c.length()-1;
             
            
            while(start <= end)
            {
                result += c.charAt(end);
                
                end--;
            }
            result += " ";
        }
        result = result.substring(0,result.length()-1);
        
        return result;
    }
}