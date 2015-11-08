package ru.litehase.algoritms.sorting;

import java.util.List;
import java.util.Collections;

/**
 * Оценка сложности O(n^2)
 */
public class BubleSort implements Sort {


    @Override
    public List<Long> sort(List<Long> input) {
        for(int i =0; i< input.size(); i++ ) {
            for(int j = 0; j < input.size() - 1; j ++) {
                if (input.get(j) > input.get(j + 1)) {
                    Collections.swap(input, j, j + 1);
                }
            }
        }

        return input;
    }
}
