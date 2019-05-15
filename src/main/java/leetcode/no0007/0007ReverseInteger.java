
package leetcode.no0007;

class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().reverse1(123));
        System.out.println(new Solution().reverse1(-789));
        System.out.println(new Solution().reverse1(0));
        System.out.println(new Solution().reverse1(1));
        System.out.println(new Solution().reverse1(-2147483648));
        System.out.println(new Solution().reverse1(-2));
        System.out.println(new Solution().reverse1(340));
        System.out.println(new Solution().reverse1(680000));
        System.out.println(new Solution().reverse1(-98765000));
        System.out.println(new Solution().reverse1(Integer.MAX_VALUE));
        System.out.println(new Solution().reverse1(Integer.MIN_VALUE));
    }

    public int reverse1(int x) {
        if (x == 0) {
            return 0;
        }
        int processedX = x;
        boolean isNegative = x < 0;
        if (isNegative) {
            processedX = processedX * -1;
        }
        while (processedX % 10 == 0) {
            processedX /= 10;
        }
        String str = String.valueOf(processedX);
        char[] chars = str.toCharArray();
        int charsLength = chars.length;
        char[] reversedChars = new char[charsLength];
        for (int i = 0; i < charsLength; i++) {
            reversedChars[i] = chars[charsLength - 1 - i];
        }
        try {
            return Integer.parseInt((isNegative ? "-" : "") + String.valueOf(reversedChars));
        } catch (Exception e) {
            return 0;
        }
    }

    public int reverse2(int x) {
        if (x == 0 || x == Integer.MIN_VALUE) {
            return 0;
        }
        while (x % 10 == 0) {
            x /= 10;
        }
        boolean isNegative = false;
        if (x < 0) {
            isNegative = true;
            x *= -1;
        }
        String[] reversed = new String[(int) Math.floor(Math.log10(x) + 1.0)];

        int index = 0;
        while (x != 0) {
            reversed[index] = String.valueOf(x % 10);
            x = (int) Math.floor(x /= 10);
            index++;
        }
        String reversedString = (isNegative ? "-" : "") + String.join("", reversed);
        try {
            return Integer.parseInt(reversedString);
        } catch (Exception e) {
            return 0;
        }
    }

    public int reverse3(int x) {
        long reversed = 0;
        while (x != 0) {
            reversed = reversed * 10 + x % 10;
            if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
                return 0;
            }
            x /= 10;
        }
        return (int) reversed;
    }
}
