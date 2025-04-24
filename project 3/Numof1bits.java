public class Numof1bits {
    public int numSetBits(long a) {
        int count = 0;
        while (a != 0) {
            count += (a & 1); // Increment count if the least significant bit is set
            a >>= 1;           // Right shift the bits of 'a' by 1 to process the next bit
        }
        return count;
    }

    public static void main(String[] args) {
        Numof1bits solution = new Numof1bits();
        long num = 29; // Binary: 11101, which has 4 set bits
        System.out.println("Number of set bits: " + solution.numSetBits(num)); // Output: 4
    }
}
