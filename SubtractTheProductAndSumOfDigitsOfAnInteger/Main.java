package SubtractTheProductAndSumOfDigitsOfAnInteger;

import java.util.Scanner;

/*
 * https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
 */

public class Main {
    public static int subtractProductAndSum(int number) {
        int sum = 0;
        int product = 1;
        int singleDigit = 0;
        while (number > 0) {
            singleDigit = number % 10;
            number /= 10;
            sum += singleDigit;
            product *= singleDigit;
        }
        return product - sum;
    }

    public static void main(String[] args) {
        System.out.println("Enter input numner");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        System.out.println("Output is: " + subtractProductAndSum(number));
    }
}