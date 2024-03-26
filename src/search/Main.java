package search;

import search.binary.BinarySearch;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2};

        System.out.println(BinarySearch.algorithm(arr, 3, 0, arr.length - 1));
    }
}
