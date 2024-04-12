package sort;

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
        
    }
    
    private void printHeap(int i, int depth) {
        if (i < vals.length) {
            printHeap(2 * i + 2, depth + 1);
            System.out.format("%" + (depth * 5) + "s%d%n%", "", vals[i]);
            printHeap(2 * i + 1, depth + 1);
        }
    }

    public void heap() {
        int nonleafnodesindex = (vals.length / 2) - 1;
        for (int i = nonleafnodesindex; i >= 0; i--) {
            reheap(i);
        }

        printHeap(0, 0);



        for (int z = nonleafnodesindex; z >= 0; z--) {
            int temp = vals[0];
            vals[0] = vals[z];
            vals[z] = temp;

            reheap(z);
        }



        for(int j = 0; j < vals.length; j++){
            System.out.print(vals[j]);
            System.out.print(" ");
        }

        System.out.println("Heap Sort comparisons: " + count);

    }

    public void reheap(int i) {
        int large = i;
        int left = 2*i + 1;
        int right = 2*i + 2;

        if (left < vals.length && vals[left] > vals[large]) {
            count++;
            large = left;
        }
        if (right < vals.length && vals[right] > vals[large]) {
            count++;
            large = right;
        }
        
        if (large != i) {
            int temp = vals[i];
            vals[i] = vals[large];
            vals[large] = temp;
            reheap(large);
        }
        
    }

    public void quickFP() {
        
    }

    public void quickRP() {
        
    }
}
