package com.bridgelabz;

public class InsertElementInArray {

    public static void insertElement(int[] array, int index, int element) {
        int temp1 = 0;
        int temp2 = 0 ;
        for (int i = 0; i< array.length;i++) {
            if (i == index) {
                temp1 = array[i];
                array[i] = element;
            } else if (i > index) {
                temp2 = array[i];
                array[i] = temp1;
                temp1 = temp2;
            }
            System.out.print(array[i] + " ");
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome To Workshop 2 Program");
        int positionOfElement = 4;
        int element = 10;
        System.out.print("Existing Array: ");
        int[] array = new int[7];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        array[5] = 6;
        for (int i = 0;i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Array after inserting element: ");
        insertElement(array, 3, 10);

    }
}
