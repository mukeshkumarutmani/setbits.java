public class setbits {
    public static int countSetBits(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            int num = i;
            while (num > 0) {
                count += num & 1;
                num >>= 1;
            }
        }
        return count;
    }
        public static void main(String[] args) {
            int n = 10;
            int totalSetBits = countSetBits(n);
            System.out.println("Total set bits from 1 to " + n + ": " + totalSetBits);
        }
    }











