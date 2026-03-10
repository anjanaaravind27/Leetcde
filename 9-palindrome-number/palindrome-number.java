class Solution {
    public boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }

        int result = 0;

        for (int i = x; i > 0; i = i / 10) {
            int num = i % 10;
            result = result * 10 + num;
        }

        return result == x;
    }
}