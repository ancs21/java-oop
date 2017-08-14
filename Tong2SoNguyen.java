
/***************************************************************
 *
 *  Bai 4
 * 
 *  Compilation: javac Tong2SoNguyen.java
 *  Execution:   java Tong2SoNguyen
 *
 *  $ java Tong2SoNguyen
 *  $ Nhap a: 4
 *    Nhap b: 5
 *    Tong 2 so nguyen a va b: 9
 *
 *
 ***************************************************************/
import java.io.*;
import java.util.*;

class Tong2SoNguyen {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    // get a
    System.out.print("Nhap a: ");
    while(!sc.hasNextInt()) {
      System.out.println("Ban can nhap vao so nguyen. Vui long nhap lai. ");
      System.out.print("Nhap a: ");
      sc.next();
    }
    int a = sc.nextInt();

    // get b
    System.out.print("Nhap b: ");
    while(!sc.hasNextInt()) {
      System.out.println("Ban can nhap vao so nguyen. Vui long nhap lai. ");
      System.out.print("Nhap b: ");
      sc.next();
    }
    int b = sc.nextInt();

    // close Scanner
    sc.close();
    System.out.println("Tong 2 so nguyen a va b: " + (a+b));
  }
 }