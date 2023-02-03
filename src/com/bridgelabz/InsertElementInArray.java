package com.bridgelabz;

public class InsertElementInArray {
    public static void insertElement(int size, int[] array, int index, int element){
        int[] newArray = new int[size];
        for (int i = 0; i < newArray.length; i++) {
            if (i < index){
                newArray[i] = array[i];
            } else if (i == index) {
                newArray[i] = element;
            }else if (i > index) {
                int j = i - 1;
                newArray[i] = array[j];
            }
            System.out.print(newArray[i] + " ");
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome To Workshop 2 Program");
        int positionOfElement = 4;
        int element = 10;
        System.out.print("Existing Array: ");
        int[] array = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int sizeOfNewArray = (array.length) + 1;
        System.out.print("Element Inserted At given position " );
        insertElement(sizeOfNewArray, array, positionOfElement - 1, element);
    }
}
