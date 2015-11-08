package ru.litehase.algoritms;


import ru.litehase.algoritms.sorting.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    private static List<Sort> sortAlgoritms = new ArrayList<Sort>();

    static {
        sortAlgoritms.add(new BubleSort());
        sortAlgoritms.add(new InsertionSort());
        sortAlgoritms.add(new SelectionSort());
        sortAlgoritms.add(new ShellSort());
        sortAlgoritms.add(new QuickSort());
    }


    public static void main(String[] args) {
        System.out.println("hello world");
        Random rn = new Random();
        List<Long> input = new ArrayList<Long>();
        List<Long> randomInput = new ArrayList<Long>();
        input.add(5L);
        input.add(2L);
        input.add(4L);
        input.add(6L);
        input.add(1L);
        input.add(3L);
        for(int i = 0; i < 1000; i++) {
            randomInput.add(rn.nextLong());
        }
        for (int i =0; i<input.size(); i++) {
            System.out.println(input.get(i));
        }
        System.out.println("-------------------=----------------------------------------");
        for(Sort sort: sortAlgoritms) {
            System.out.println("==================");
            System.out.println(sort.getClass().getSimpleName());
            Long time = System.currentTimeMillis();
            List<Long> result = sort.sort(new ArrayList<Long>(input));
            System.out.println("input: " + (System.currentTimeMillis() - time));
            System.out.println("----------------------------");
            for (Long l: result) {
                System.out.print(l + "  ");
            }
            System.out.println("");
            System.out.println("----------------------------");
            time = System.currentTimeMillis();
            sort.sort(new ArrayList<Long>(randomInput));
            System.out.println("random input: " + (System.currentTimeMillis() - time));
            System.out.println("==================");
        }
    }

    private static void generateFile(int count) {

    }


}
