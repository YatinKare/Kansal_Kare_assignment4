package sort;

import sort.Sorting;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SortingDriver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userChoice = "";
        
        // file input
        String filename = args[0];
        Scanner sc = new Scanner(System.in);
        try {
            sc = new Scanner(new File("resources/" + filename));
        } catch (FileNotFoundException fne) {
            fne.printStackTrace();
        }
        String inputValues = sc.nextLine();
        String[] stringVals = inputValues.split(" ");
        sc.close();

        int[] vals = new int[stringVals.length]; 
        for(int i = 0; i < stringVals.length; i++) {
            vals[i] = Integer.parseInt(stringVals[i]);
        }

        System.out.println("selection-sort (s) merge-sort (m) heap-sort (h) quick-sort (q) quick-sort-rp (r)");
        System.out.print("Enter the algorithm: ");

        userChoice = scan.nextLine();

        Sorting sort = new Sorting(vals);

        if(userChoice.equals("s")) {
            sort.selection();
            // insert-sort
        } else if (userChoice.equals("m")) {
            sort.merge();
        } else if (userChoice.equals("h")) {
            // heap-sort
        } else if (userChoice.equals("q")) {
            // quicksort fp
        } else if (userChoice.equals("r")) {
            // quicksort rp
        }

    }
}
