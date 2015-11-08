package ru.litehase.algoritms.sorting;

import java.util.List;

public class InsertionSort implements Sort {

    @Override
    public List<Long> sort(List<Long> input) {
        for(int j = 1; j < input.size(); j ++) {
            Long key = input.get(j);
            int i = j;
            while (i > 0 && input.get(i-1) > key) {
                input.set(i, input.get(i-1));
                i--;
            }
            input.set(i, key);
        }

        return input;
    }

    public List<Long> descsort(List<Long> input) {
        for(int j = input.size() - 2; j >=0; j--) {
            Long key = input.get(j);
            int i = j;
            while (i < input.size() - 1 && input.get(i+1) > key) {
                input.set(i, input.get(i+1));
                i++;
            }
            input.set(i, key);
        }

        return input;
    }
}
