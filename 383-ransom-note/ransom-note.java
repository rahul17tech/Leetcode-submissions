class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> hm1=new HashMap<>();
        HashMap<Character,Integer> hm2=new HashMap<>();
        for(char c:ransomNote.toCharArray())
            hm1.put(c,hm1.getOrDefault(c,0)+1);
        for(char c:magazine.toCharArray())
            hm2.put(c,hm2.getOrDefault(c,0)+1);

        for(char c:ransomNote.toCharArray()){
            if(!hm2.containsKey(c) || hm1.get(c) > hm2.get(c))
                return false;
        }
        return true;
    }
}