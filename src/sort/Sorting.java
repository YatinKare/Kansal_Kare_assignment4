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

    public void heap() {
        
    }

    public void quickFP() {
        
    }

    public void quickRP() {
        
    }
}
