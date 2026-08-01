class Solution {
    public int maxNumberOfBalloons(String text) {
        int res=Integer.MAX_VALUE;
        String balloon="balloon";
        HashMap<Character,Integer> bmap=new HashMap<>();
        for(char c:balloon.toCharArray())
            bmap.put(c,bmap.getOrDefault(c,0)+1);

        HashMap<Character,Integer> hm=new HashMap<>();
        for(char c:text.toCharArray())
            hm.put(c,hm.getOrDefault(c,0)+1);

        for(char c:bmap.keySet()){
            res=Math.min(res,(hm.getOrDefault(c,0)/bmap.get(c)));
        }
        return res;
    }
}