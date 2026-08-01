class Solution {
    public int longestPalindrome(String s) {
        int res=0;
        HashMap<Character,Integer> hm=new HashMap<>();
        for(char c:s.toCharArray()){
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        boolean odd=false;
        for(char c:hm.keySet()){
            int value=hm.get(c);
            if(value%2==0)
                res+=value;
            else{
                res+=(value-1);
                odd=true;
            }
        }
        return odd==true?res+1:res;
    }
}