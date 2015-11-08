package ru.litehase.algoritms.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuickSort implements Sort {
    @Override
    public List<Long> sort(List<Long> input) {
        if (input.size() == 0) {
            return Collections.EMPTY_LIST;
        }
        Long head = input.get(0);
        input.remove(0);
        ArrayList<Long> right = new ArrayList<Long>(input.size()/2);
        ArrayList<Long> left = new ArrayList<Long>(input.size()/2);

        for(Long element: input) {
            if (element > head) {
                right.add(element);
            } else {
                left.add(element);
            }
        }

        ArrayList<Long> result = new ArrayList<Long>(input.size());
        result.addAll(sort(left));
        result.add(head);
        result.addAll(sort(right));
        return result;
    }
}
