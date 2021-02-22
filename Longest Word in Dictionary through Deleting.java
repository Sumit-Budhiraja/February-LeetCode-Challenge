class Solution {
// staright forward linear time fucntion to chekc if p is a subsequence of s 
    private static boolean isSubsq(String s, String p){
        int i = 0 , j = 0 ;
        while(i < s.length() && j < p.length()){
            if(s.charAt(i) == p.charAt(j)){
                i++;
                j++;
            }
            else
                i++;
        }
        return j == p.length();
    }
    public String findLongestWord(String s, List<String> d) {
        String ans = "";
        int n = d.size();
        for(int i = 0 ; i < n ; i++){
            if(isSubsq(s,d.get(i))){
				// if curr word is striclt larger then this is better ans 
                if(ans.length() < d.get(i).length())
                    ans = d.get(i);
                else if(ans.length() == d.get(i).length())  // if smae length , check if lexicographically smaller or not 
                    ans = ans.compareTo(d.get(i)) > 0 ? d.get(i) : ans;
                
            }
        }
        return ans ;
    }
}