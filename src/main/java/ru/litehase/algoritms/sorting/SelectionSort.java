package ru.litehase.algoritms.sorting;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * СЛожность O(n * n)
 */
public class SelectionSort implements Sort {
    @Override
    public List<Long> sort(List<Long> input) {
        for(int i = 0; i < input.size() - 1; i++) {
            for(int j = i + 1; j < input.size(); j ++) {
                if (input.get(j) < input.get(i)) {
                    Collections.swap(input, i, j);
                }
            }
        }
        return input;
    }
}
