class Solution {
    // TC : O(nlogn)
     public boolean isAnagram(String s, String t) {
         char[] sChar = s.toCharArray();
         char[] tChar = t.toCharArray();

         Arrays.sort(sChar);
         Arrays.sort(tChar);
         return (new String(sChar)).equals(new String(tChar));
     }


    private int[] getFreqMap(String str){
        int[] freq = new int[26];
        for(char c: str.toCharArray()){
            freq[c-'a']++;
        }
        return freq;
    }
}