package EvenOddChecker;
public class MaxOfThree {

    // Method to find the maximum number
    public static int max(int a, int b, int c) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        return max;
    }

    public static void main(String[] args) {
        int largest = max(12, 45, 37);
        System.out.println("Largest number: " + largest);
    }
}
