class Solution {
    public boolean isHappy(int n) {

        int sum = 0;
        int a;

        java.util.Set<Integer> seen = new java.util.HashSet<>();

        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            sum = 0; 

            while (n > 0) {
                a = n % 10;
                sum += a * a;
                n = n / 10;
            }

            n = sum;
        }

        return n == 1;
    }
}
