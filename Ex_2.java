//Реализуйте алгоритм сортировки пузырьком числового массива
//import java.io.IOException;
//import java.util.logging.*;
public class Ex_2 {

    public static void main(String[] args){
        int[] array = {5, 4, 9, 8, 3, 10, 1, 2, 7, 6, 12, 100, 15};
        bubbleSort(array);
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
    }
        }
    public static void bubbleSort(int[] sortArr){
        for (int i = 0; i < sortArr.length; i++) {
            for (int j = 1; j < sortArr.length - i; j++) {
                if (sortArr[j] < sortArr[j - 1]) {
                    int temp = sortArr[j];
                    sortArr[j] = sortArr[j - 1];
                    sortArr[j - 1] = temp;
                }
            }
        }
    }
}

