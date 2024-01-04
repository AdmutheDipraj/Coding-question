package org.example;

public class RemoveMaxValue {

    public static void main(String[] args) {
        int[] array={1,2,3,4,5};

        int max = findValueForMax(array);
        int min=findValueForMin(array);
    }

    private static int findValueForMin(int[] array) {
        if(array.length==0){
            throw new IllegalArgumentException();
        }
        int min=array[0];
        for (int i = 1; i < array.length; i++) {
           if (array[i]<min){
               min=array[i];
           }
        }
        return 0;
    }

    private static int findValueForMax(int[] array) {
        return 0;
    }
}
