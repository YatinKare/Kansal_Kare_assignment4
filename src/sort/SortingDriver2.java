package sort;

import sort.Sorting;

import java.util.Scanner;
import java.util.Random;

public class SortingDriver2 {
    //driver for experiment 2
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userChoice = "";
        

        System.out.println("selection-sort (s) merge-sort (m) heap-sort (h) quick-sort (q) quick-sort-rp (r)");
        System.out.print("Enter the algorithm: ");

        userChoice = scan.nextLine();

        System.out.print("What input size n do you want to use: ");
        int n = scan.nextInt();
        int[] vals = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            vals[i] = rand.nextInt();
        }

        Sorting sort = new Sorting(vals);

        if(userChoice.equals("s")) {
            sort.selection();
            // insert-sort
        } else if (userChoice.equals("m")) {
            sort.merge();
        } else if (userChoice.equals("h")) {
            // heap-sort
        } else if (userChoice.equals("q")) {
            sort.quickFP();
        } else if (userChoice.equals("r")) {
            sort.quickRP();
        }
        scan.close();
    }
}
