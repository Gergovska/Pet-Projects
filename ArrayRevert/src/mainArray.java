/**
 * @author Oleksandra Gergovska
 */
public class mainArray {
    public void reverse (int[] myArray ){
        int size = myArray.length -1;
        int halfSize = size/2;
        for (int i= 0,j = size; i < size; i++, j--) {
                int temp = myArray[i];
                myArray[i] = myArray[j];
                myArray[j] = temp;

        }
    }

    public static void main(String[] args ){
        int[] array = {1,2,3,4,5,6,7};

        mainArray checkArray = new mainArray();
        checkArray.reverse(array);
        for (int i = 0; i < array.length; i++ ){
            System.out.print(array[i]+ " ");
        }


    }
}




