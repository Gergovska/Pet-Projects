/**
 * @author Oleksandra Gergovska
 */
class quickSortImp {
        private int array[];

    private void sort(int[] inputArr) {

            if (inputArr == null || inputArr.length == 0) {
                return;
            }
            this.array = inputArr;
        int arrayLen = inputArr.length;
            quickSort(0, arrayLen - 1);
        }

        private void quickSort(int lowIndex, int highIndex) {

            int i = lowIndex;
            int j = highIndex;
            // Calculating pivot number= middle index number of array
            int pivot = array[lowIndex+(highIndex-lowIndex)/2];
            // Split array in two parts
            while (i <= j) {
                while (array[i] < pivot) {
                    i++;
                }
                while (array[j] > pivot) {
                    j--;
                }
                if (i <= j) {
                    swapElements(i, j);
                    i++;
                    j--;
                }
            }
            // Using recursion by calling method
            if (lowIndex < j)
                quickSort(lowIndex, j);
            if (i < highIndex)
                quickSort(i, highIndex);
        }

        private void swapElements(int i, int j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

        public static void main(String a[]){

            quickSortImp sorter = new  quickSortImp();
            int[] testArray = {26,555,899,1,0,2,8,7,3,6,-9,99,100,856,25,3,40,568,1,46,821,356,2648,663,5522,777,58,4,17,16,78,54,88,223,96};
            System.out.println("Unsorted array of nubmers:");
            for(int i:testArray){
                System.out.print(i);
                System.out.print(" ");
            }
            sorter.sort(testArray);
            System.out.println("Performing quisk sort of elements...");
            System.out.println();
            System.out.println("Sorted array");
            for(int i:testArray){
                System.out.print(i);
                System.out.print(" ");
            }
        }
}
