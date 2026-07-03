package linearsearch;

public class NoOfDigitIsEven {
    public static void main(String[] args) {
        int[] nums = { 12, 345, 2, 6, 7896 };
        System.out.println(findnumbers(nums));

    }

    static int findnumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }

        }
        return count;
    }

    // function to check wether the a number contain even digits or not
    static boolean even(int num) {
        int numberOfDigits = digits(num);
        return numberOfDigits % 2 == 0;

    }

    // count number of digits in a number
    static int digits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;

        }
        return count;

    }

}
