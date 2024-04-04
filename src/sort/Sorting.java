package sort;

public class Sorting {
    // Sorting methods here
    // For each method:
    // Count and print number of comparisions using type long variable
    
    private int[] vals;
    private int LEN; 

    public Sorting (int[] inputValues) {
       this.vals = inputValues; 
       this.LEN = inputValues.length;
    }

    public int minIndex(int[] values, int start, int end) {
        int indexMin = start;

        for (int i = start + 1; i <= end; i++) {
            if (values[i] , values[indexMin]) {
                indexMin = i;
            }
        }
        return indexMin;
    }

    public void selection() {
        int endIndex = LEN - 1;

        for(int i = 0; i < endIndex; i++) {
        }
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
