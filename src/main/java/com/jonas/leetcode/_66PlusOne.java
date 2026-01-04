package com.jonas.leetcode;

import java.math.BigDecimal;
import java.math.BigInteger;

public class _66PlusOne {

    public int[] plusOne(int[] digits) {
        int length = digits.length;
        BigInteger origVal = BigInteger.ZERO;
        double lastIndex = length - 1;
        for (int i = 0; i < length; i++, lastIndex--) {
            origVal = origVal.add(BigInteger.valueOf(digits[i]).multiply(BigDecimal.valueOf(Math.pow(10.0, lastIndex)).toBigInteger()));
        }
        BigInteger finalVal = origVal.add(BigInteger.ONE);
        int count = 0;
        BigInteger tempNum = finalVal;

        while (BigInteger.valueOf(0).compareTo(tempNum) != 0) {
            tempNum = tempNum.divide(BigInteger.valueOf(10));
            count++;
        }
        BigInteger[] finalArrBigInteger = new BigInteger[count];
        BigInteger temp = finalVal;
        for (int i = count - 1; i >= 0; i--) {
            finalArrBigInteger[i] = temp.mod(BigInteger.valueOf(10));
            if (i > 0) {
                temp = temp.divide(BigInteger.valueOf(10));
                finalArrBigInteger[i - 1] = temp;
            }
        }
        int[] finalArr = new int[count];
        for (int i = 0; i < count; i++) {
            finalArr[i] = finalArrBigInteger[i].intValue();
        }
        return finalArr;
    }

    // from the internet
    public int[] plusOne2(int[] digits) {
        int length = digits.length;
        for (int i = length - 1; i >= 0; i--) {
            if (digits[i] + 1 != 10) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] newDigits = new int[length + 1];
        newDigits[0] = 1;
        return newDigits;
    }

}
