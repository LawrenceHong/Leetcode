public class Solution {
    private String match = "[0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5]";
    
    public List<String> restoreIpAddresses(String s) {
        
        List<String> res = new ArrayList<>();
        helper(res, s, 0, "", 0);
        return res;
    }
    
    private void helper(List<String> res, String ip, int count, String storeIP, int idx) {
        if(count > 4) return;
        if(count == 4 && ip.length() == idx) res.add(storeIP);
        
        for(int i = 0; i < 4; i++) {
            if(idx+i > ip.length()) break;
            String sb = ip.substring(idx, idx+i);
            if(!sb.matches(match)) continue;
            helper(res, ip, count+1, storeIP+sb+(count == 3 ? "" : "."), idx+i);
        }
    }
}