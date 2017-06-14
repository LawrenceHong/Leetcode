public class Solution {
    public int addDigits(int num) {
        /*
        if(num/10 == 0)
            return num;
        int newNum = 0;
        while(num > 0) {
            newNum += num%10;
            num = num/10;
        }
        
        return addDigits(newNum);*/
        return (num - 1) % 9 + 1;
    }
}