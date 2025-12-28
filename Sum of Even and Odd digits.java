class SumEvenOddDigits {
    public static void main(String[] args) {
        int num = 123456;
        int evenSum = 0, oddSum = 0;

        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 == 0)
                evenSum += digit;
            else
                oddSum += digit;

            num /= 10;
        }

        System.out.println("Even digits sum: " + evenSum);
        System.out.println("Odd digits sum: " + oddSum);
    }
}
