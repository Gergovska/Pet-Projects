import.util.Scanner;import java.util.Scanner;

/**
 * @author Oleksandra Gergovska
 */
public class quickSortAlgorithm{
static void quickSort(int[] array, int start, int end) {
        if (array== null || array.length <= 1 || (end - start) < 2) {
        return;
        }
        int p = array[end-1];
        int swapIdx = start;
        for (int i = start; i < end-1; i++) {
        if (array[i] < p) {
        //swap
        int tmp = array[swapIdx];
        array[swapIdx] = array[i];
        array[i] = tmp;
        swapIdx++;
        } else {
        //array[i] > p
        }
        }
        //System.out.println("pre:" + swapIdx + " end:"+(end-1));
        //printArray(array);
        int tmp = ar[swapIdx];
        array[swapIdx] = ar[end-1];
        array[end-1] = tmp;
        //System.out.println("final");
        printArray(array);
        //recurse on each half

        //System.out.println("start:"+start+" end:"+end+" p:"+swapIdx);
        quickSort(array, start, swapIdx);
        quickSort(array, swapIdx+1, end);
        }
static void printArray(int[] array) {
        for(int n: ar){
        System.out.print(n+" ");
        }
        System.out.println("");
        }

public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        for(int i=0;i<n;i++){
        ar[i]=in.nextInt();
        }
        quickSort(array, 0, n);
        }
        }
}