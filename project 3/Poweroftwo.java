class Poweroftwo {
    public boolean isPowerOfTwo(int n) {
        if (n == 1) {
            return true;
        } else if (n <= 0 || n % 2 != 0) {
            return false;
        }
        return isPowerOfTwo(n / 2); // Recursively divide by 2
    }

    public static void main(String[] args) {
        Poweroftwo solution = new Poweroftwo();
        int num = 16; // Example of a power of two
        System.out.println("Is " + num + " a power of two? " + solution.isPowerOfTwo(num)); // Output: true

        num = 18; // Example of a non-power of two
        System.out.println("Is " + num + " a power of two? " + solution.isPowerOfTwo(num)); // Output: false
    }
}
