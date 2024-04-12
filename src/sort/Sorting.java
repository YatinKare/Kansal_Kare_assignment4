package sort;

import java.util.Random;
public class Sorting {
    // Sorting methods here
    // For each method:
    // Count and print number of comparisions using type long variable
    
    private int[] vals;
    private int LEN; 
    private int count;

    public Sorting (int[] inputValues) {
       this.vals = inputValues; 
       this.LEN = inputValues.length;
       this.count = 0;
    }

    public int minIndex(int[] values, int start, int end) {
        int indexMin = start;

        for (int i = start + 1; i <= end; i++) {
            if (values[i] < values[indexMin]) {
                count++;
                indexMin = i;
            }
        }
        return indexMin;
    }

    public void selection() {
        int endIndex = LEN - 1;

        for(int i = 0; i < endIndex; i++) {
            int minindex = minIndex(vals, i, endIndex);
            int temp = vals[i];
            vals[i] = vals[minindex];
            vals[minindex] = temp;
        }

        for(int j = 0; j < vals.length; j++){
            System.out.print(vals[j]);
            System.out.print(" ");
        }

        System.out.println("SelectionSort comparisons: " + count);

    }

    public void merge() {
        mergeSort(vals);
        for (int idx = 0; idx < vals.length; idx++) {
            System.out.print("" + vals[idx] + " ");
        }
        System.out.println("\nThe number of comparisons is: " + count);
    }

    public void mergeSort(int[] a) {
        int len = a.length;

        if (len < 2) {
            return;
        }

        int mid = len/2;
        int[] left = new int[mid];
        int[] right = new int[len-mid];
        for (int i = 0; i < mid; i++) {
            left[i] = a[i];
        }
        for (int i = mid; i < len; i++) {
            right[i-mid] = a[i];
        }
        mergeSort(left);
        mergeSort(right);

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                a[k] = left[i];
                i++;
            }
            else {
                a[k] = right[j];
                j++;
            }
            count++;
            k++;
        }

        while (i < left.length) {
            a[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length) {
            a[k] = right[j];
            j++;
            k++;
        }
    }
    

    public void heap() {
        
    }

    //code citation from https://www.geeksforgeeks.org/implement-quicksort-with-first-element-as-pivot/
    public void quickFP() {
        quickSort(0, vals.length-1);
        for (int idx = 0; idx < vals.length; idx++) {
            System.out.print("" + vals[idx] + " ");
        }
        System.out.println("\nThe number of comparisons is: " + count);
    }

    public void quickSort(int low, int high) {
        if (low >= high) {
            return;
        }
        int pivot = vals[low];
        int k = high;
        for (int i = high; i > low; i--) {
            count++;
            if (vals[i] > pivot){
                int temp = vals[i];
                vals[i] = vals[k];
                vals[k] = temp;
                k-=1;
            }
        }
        int temp = vals[low];
        vals[low] = vals[k];
        vals[k] = temp;

        quickSort(low, k-1);
        quickSort(k+1, high);
    }

    public void quickRP() {
        quickRandomSort(0, vals.length-1);
        for (int idx = 0; idx < vals.length; idx++) {
            System.out.print("" + vals[idx] + " ");
        }
        System.out.println("\nThe number of comparisons is: " + count);
    }

    public void quickRandomSort(int low, int high) {
        if (low >= high) {
            return;
        }
        Random rand = new Random();
        int idx = low + rand.nextInt(high-low + 1);
        int pivot = vals[idx];

        int temp = vals[idx];
        vals[idx] = vals[high];
        vals[high] = temp;

        int i = low - 1;
        
        for (int j = low; j < high; j++) {
            count++;
            if (vals[j] < pivot){
                i++;
                temp = vals[i];
                vals[i] = vals[j];
                vals[j] = temp;
            }
        }
        temp = vals[high];
        vals[high] = vals[i+1];
        vals[i+1] = temp;

        quickRandomSort(low, i);
        quickRandomSort(i+2, high);
    }
}
