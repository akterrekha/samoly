
import java.util.Arrays;

public class ArraySort {

    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 8, 6, 9};
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println(" Sorter array or Assending order");
        int[] a = {4, 2, 1, 8, 6, 9,};
        Arrays.sort(a);
        for (int j : a) {
            System.out.print(j + " ");
        }

        System.out.println("Array dessnding order");
        int[] b = {4, 2, 1, 8, 6, 9};
        Arrays.sort(b);
        for (int i = b.length - 1; i >= 0; i--) {
            System.out.print(b[i] + " ");
        }
        
    }

}
