public class MissingNumber {
    public int numSetBits(int A) {
        int count = 0;
        while (A != 0) {
            count += (A & 1); // Check if the last bit is 1
            A >>>= 1;         // Unsigned right shift
        }
        return count;
    }

    public static void main(String[] args) {
        MissingNumber obj = new MissingNumber();
        int input = 11;
        int result = obj.numSetBits(input);
        System.out.println("Number of 1 bits in " + input + " is: " + result);
    }
}
