class Solution {
    public int reverse(int x) {

        int reverse = 0;
        int n = x;

        while (n != 0) {

            int reminder = n % 10;
            n /= 10;

            if (reverse > Integer.MAX_VALUE / 10 ||
                (reverse == Integer.MAX_VALUE / 10 && reminder > 7)) {
                return 0;
            }

            if (reverse < Integer.MIN_VALUE / 10 ||
                (reverse == Integer.MIN_VALUE / 10 && reminder < -8)) {
                return 0;
            }

            reverse = reverse * 10 + reminder;
        }

        return reverse;
    }
}