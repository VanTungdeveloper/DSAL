package search.binary;

public class BinarySearch {
    public static  int algorithm(int[] arr,  int target, int l, int r){
        int mid = (l + r) / 2;
        if(l > r) return -1;
        if(arr[mid] == target) return  mid;
        return  arr[mid] > target ? algorithm(arr, target, l, mid - 1) : algorithm(arr, target, mid + 1, r);
    }
}
