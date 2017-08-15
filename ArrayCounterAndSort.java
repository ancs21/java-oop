/***************************************************************
 *
 *  Bai 7
 * 
 *  Compilation: javac ListSoNguyenCounterAndSort.java
 *  Execution:   java ListSoNguyenCounterAndSort
 *
 *  $ java ListSoNguyenCounterAndSort
 *  $ Nhap vao chieu dai cua danh sach n: 4
 *    Nhap phan tu thu 1: 3
 *    Nhap phan tu thu 2: 5
 *    Nhap phan tu thu 3: 5
 *    Nhap phan tu thu 4: 2
 * 
 *    Nhap vao so x: 5
 *    Tim thay 2 so 5 trong danh sach
 *    Danh sach chua duoc sap xep: 3 5 5 2
 *    Danh sach da sap xep: 2 3 5 5
 *
 *
 ***************************************************************/


 import java.io.*;
 import java.util.*;

 class ArrayCounterAndSort {
     public static int[] doInsertionSort(int[] input){
		
	    int temp;
	    for (int i = 1; i < input.length; i++) {
		    for(int j = i ; j > 0 ; j--){
			    if(input[j] < input[j-1]){
				    temp = input[j];
				    input[j] = input[j-1];
				    input[j-1] = temp;
			    }
		    }
	    }
	    return input;
	 }
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Nhap do dai cua danh sach: n = ");
         int n = sc.nextInt();
         // create list
         int numbers[] = new int[n];
         for(int i=0; i < numbers.length; i++) {
            System.out.print("Nhap phan tu thu " + (i+1) + ": ");
            numbers[i] = sc.nextInt();
         }
         sc.close();
         // print list
         System.out.print("Danh sach ban nhap:");
         for(int i=0; i < numbers.length; i++) {
            System.out.print(" " + numbers[i]);
         }
         
         // sap xep
        //  Arrays.sort(numbers);
        int numberSort[] = doInsertionSort(numbers);

         // print list sort
         System.out.println();
         System.out.print("Danh sach da sap xep:");
         for(int i=0; i < numbers.length; i++) {
            System.out.print(" " + numberSort[i]);
         }
     }
 }