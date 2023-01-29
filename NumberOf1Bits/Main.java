package NumberOf1Bits;

/*
 * https://leetcode.com/problems/number-of-1-bits/
 */

public class Main {

    public static int hammingWeight() {
        int number = 00000000000000000000000000001011;
        
        // using inbuilf funtion
        // return Integer.bitCount(number);
        
        // using bit manipulation
        int count = 0;
        while (number != 0) {
            count += number & 1;
            number = number>>>1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Output is: " + hammingWeight());
    }
}
