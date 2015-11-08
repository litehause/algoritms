package ru.litehase.algoritms.sorting;

import java.util.List;

/**
 * Created by maks on 04.11.15.
 */
public class ShellSort implements Sort {


    //    d=n;
//    d=d/2;
//    while (d>0)
//    {
//        for (i=0; i<n-d; i++)
//        {
//            j=i;
//            while (j>=0 && A[j]>A[j+d])
//            {
//                count=A[j];
//                A[j]=A[j+d];
//                A[j+d]=count;
//                j--;
//            }
//        }
//        d=d/2;
//    }
    @Override
    public List<Long> sort(List<Long> input) {
        int d = input.size() / 2;
        while (d > 0) {
            for (int i = 0; i < input.size() - d; i++) {
                int j = i;
                while (j >= 0 && input.get(j) > input.get(j + d)) {
                    Long count = input.get(j);
                    input.set(j, input.get(j + d));
                    input.set(j + d, count);
                    j--;
                }
            }
            d = d / 2;
        }
        return input;
    }
}
