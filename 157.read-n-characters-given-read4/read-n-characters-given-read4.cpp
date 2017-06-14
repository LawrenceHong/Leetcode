// Forward declaration of the read4 API.
int read4(char *buf);

class Solution {
public:
    /**
     * @param buf Destination buffer
     * @param n   Maximum number of characters to read
     * @return    The number of characters read
     */
    int read(char *buf, int n) {
        int res = 0;
        for(int i = 0; i <= n/4; i++) {
            res += read4(buf+res);
        }
        
        return min(res, n);
    }
};