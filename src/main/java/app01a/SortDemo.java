package app01a;

import java.util.LinkedList;

public class SortDemo {
    public static void main(String[] args) {
        String[] arr = {"2", "4", "1", "6", "9"};
        selectSort(arr);
        System.out.println(arr);
    }

    private static void selectSort(String[] arr) {
        for(int i = 0 ; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[j].compareToIgnoreCase(arr[i]) > -1){
                    String temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        LinkedList<String> strings = new LinkedList<>();
//        strings.
    }
}
