package ru.litehase.algoritms.sorting;

import java.util.List;

@Deprecated
public class MegeSort implements Sort{
    @Override
    public List<Long> sort(List<Long> input) {
        int length = input.size();
        if (length < 2) {
            return  input;
        }
        int midle = length/2;
        return null;
    }


//    private List<Long> merge() {
//
//    }
}
