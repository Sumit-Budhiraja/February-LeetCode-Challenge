class Solution {
    public String minRemoveToMakeValid(String s) {
        int clsBracket = 0;
        int openBracket = 0;
        
        for (char c : s.toCharArray()){
            if (c == ')')
                ++clsBracket;
        }
        
        
        StringBuilder sb = new StringBuilder();
        
        for (char c : s.toCharArray()){
            if (c == ')'){
                --clsBracket;
                
                if (openBracket > 0){
                    sb.append(c);
                    --openBracket;
                }
            } else if (c == '('){
                if (openBracket < clsBracket){
                    ++openBracket;
                    sb.append(c);
                }
            } else
                sb.append(c);
            
        }
        
        return sb.toString();
    }
}