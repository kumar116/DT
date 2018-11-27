package com.kumarsoumya.collections;

import java.util.Random;
import org.junit.Before;

public class SortTest {

    protected Integer[] input = new Integer[Constant.arrLength];
    protected Integer[] expect  = new Integer[Constant.arrLength];

    @Before
    public void setUp() {
        for (int i = 0; i < Constant.arrLength; i++) {
            input[i] = expect[i] = i;
        }

        Random random = new Random();
        for (int i = input.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            int temp = input[i];
            input[i] = input[j];
            input[j] = temp;
        }
    }
}
