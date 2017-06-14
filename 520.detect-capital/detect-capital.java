public class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.length() == 0)
            return false;
            
        if(word.length() == 1 && ((word.charAt(0) >='a' && word.charAt(0) <= 'z') || (word.charAt(0) >='A' && word.charAt(0) <= 'Z')))
            return true;
            
        if(word.charAt(0) >='a' && word.charAt(0) <= 'z')
            return isAllsmall(word);
            
        if(word.charAt(0) >='A' && word.charAt(0) <= 'Z')
            return isAllcapital(word) || isFirstcapital(word);
            
        return false;    
    }
    
    public boolean isAllsmall(String word) {
        for(int i = 0; i < word.length(); ++i) {
            if(!(word.charAt(i) >='a' && word.charAt(i) <= 'z'))
                return false;
        }
        
        return true;
    }
    
    public boolean isAllcapital(String word) {
        for(int i = 0; i < word.length(); ++i) {
            if(!(word.charAt(i) >='A' && word.charAt(i) <= 'Z'))
                return false;
        }
        
        return true;
    }
    
    public boolean isFirstcapital(String word) {
        for(int i = 1; i < word.length(); ++i) {
            if(!(word.charAt(i) >='a' && word.charAt(i) <= 'z'))
                return false;
        }
        
        return true;
    }
}