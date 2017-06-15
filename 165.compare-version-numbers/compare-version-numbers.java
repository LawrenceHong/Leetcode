public class Solution {
    public int compareVersion(String version1, String version2) {
        String[] v1 = (version1+".0").split("\\.");
        String[] v2 = (version2+".0").split("\\.");
        int i = 0;
        for(; i < Math.min(v1.length, v2.length); i++) {
            if(Integer.valueOf(v1[i]) > Integer.valueOf(v2[i])) return 1;
            if(Integer.valueOf(v1[i]) < Integer.valueOf(v2[i])) return -1;
            else continue;
        }
        
        if(v1.length == v2.length) return 0;
        
        int count = 0;
        String rest[] = v1.length > v2.length ? v1 : v2;
        for(; i < rest.length; i++)
            count += Integer.valueOf(rest[i]);

        if(count == 0) return 0;
        
        return v1.length > v2.length ? 1 : -1;
    }
}