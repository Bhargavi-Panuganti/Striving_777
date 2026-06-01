class Solution {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) return false;
        return check(n, 3L);
    }

    public boolean check(int n, long base) {
        if (n == 1) return true;
        if (base > n) return false;
        if (n == base) return true;

        return check(n, base * 3);
    }
}