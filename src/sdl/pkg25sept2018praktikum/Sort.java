/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdl.pkg25sept2018praktikum;

import java.util.Arrays;

/**
 *
 * @author basisb15
 */
public class Sort {

    public static void main(String[] args) {
        int data[] = {22, 43, 56, 1, 34, 89, 65, 4, 77, 56, 54, 33, 45, 23,
            89, 76, 12, 67, 54, 8, 9, 44, 98, 100};
        System.out.println("Bilangan sebelumnya\t: " + Arrays.toString(data));
        System.out.println("DESCENDING");
        System.out.println("========================================================"
                + "=============================================");
        System.out.println("BUBBLE SORT");
        bubbleSort(data);
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("");
        System.out.println("========================================================"
                + "=============================================");
        System.out.println("");
        System.out.println("========================================================"
                + "=============================================");
        System.out.println("SELECTION SORT");
        selectionSort(data);
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("");
        System.out.println("========================================================"
                + "=============================================");
        System.out.println("");
        System.out.println("========================================================"
                + "=============================================");
        System.out.println("INSERTION SORT");
        insertionSort(data);
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("");
        System.out.println("========================================================"
                + "=============================================");
        System.out.println("");
        //ASCENDING
        System.out.println("ASCENDING");
        System.out.println("========================================================"
                + "=============================================");
        System.out.println("BUBBLE SORT");
        bubbleSortAS(data);
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("");
        System.out.println("========================================================"
                + "=============================================");
        System.out.println("");
        System.out.println("========================================================"
                + "=============================================");
        System.out.println("SELECTION SORT");
        selectionSortAS(data);
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("");
        System.out.println("========================================================"
                + "=============================================");
        System.out.println("");
        System.out.println("========================================================"
                + "=============================================");
        System.out.println("INSERTION SORT");
        insertionSortAS(data);
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("");
        System.out.println("========================================================"
                + "=============================================");
        System.out.println("");
    }

    public static int[] bubbleSort(int[] a) {

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] < a[j + 1]) {
                    int swap = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = swap;
                }
            }
        }
        System.out.print("Sesudah di urutkan\t:");
        return a;

    }

    public static int[] selectionSort(int[] b) {
        for (int i = 0; i < b.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < b.length; j++) {
                if (b[j] > b[min]) {
                    min = j;
                }
            }
            if (b[min] != i) {
                int indexMin = b[i];
                b[i] = b[min];
                b[min] = indexMin;
            }
        }
        System.out.print("Sesudah di urutkan\t:");
        return b;
    }

    public static int[] insertionSort(int[] c) {
        int holePosition;
        int valueToInsert;
        for (int i = 1; i < c.length; i++) {
            valueToInsert = c[i];
            holePosition = i;

            while (holePosition > 0 && c[holePosition - 1] < valueToInsert) {
                c[holePosition] = c[holePosition - 1];
                holePosition = holePosition - 1;
            }
            c[holePosition] = valueToInsert;

        }
        System.out.print("Sesudah di urutkan\t:");
        return c;
    }

    //ASCENDING
    public static int[] bubbleSortAS(int[] a) {

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int swap = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = swap;
                }
            }
        }
        System.out.print("Sesudah di urutkan\t:");
        return a;

    }

    public static int[] selectionSortAS(int[] b) {
        for (int i = 0; i < b.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < b.length; j++) {
                if (b[j] < b[min]) {
                    min = j;
                }
            }
            if (b[min] != i) {
                int indexMin = b[i];
                b[i] = b[min];
                b[min] = indexMin;
            }
        }
        System.out.print("Sesudah di urutkan\t:");
        return b;
    }

    public static int[] insertionSortAS(int[] c) {
        int holePosition;
        int valueToInsert;
        for (int i = 1; i < c.length; i++) {
            valueToInsert = c[i];
            holePosition = i;

            while (holePosition < 0 && c[holePosition - 1] < valueToInsert) {
                c[holePosition] = c[holePosition - 1];
                holePosition = holePosition - 1;
            }
            c[holePosition] = valueToInsert;

        }
        System.out.print("Sesudah di urutkan\t:");
        return c;
    }
}
