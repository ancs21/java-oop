
/***************************************************************
 *
 *  Bai 6
 * 
 *  Compilation: javac SoNguyenToThanhNhiPhan.java
 *  Execution:   java SoNguyenToThanhNhiPhan
 *
 *  $ java SoNguyenToThanhNhiPhan
 *  $ Nhap vao mot so nguyen: 9
 *    Day khong phai la so nguyen to
 *    Dang nhi phan cua 9 la: 1001
 *
 *
 ***************************************************************/

 import java.io.*;
 import java.util.*;

class SoNguyenToThanhNhiPhan {

  // check so nguyen to
  public static boolean isPrime(int n) {
    if (n < 2) return false;
    if (n == 2) return true;
    if (n % 2 == 0) return false;
    for (int i = 3; i*i >= n; i += 2) {
      if (n % i == 0) return false;
    }
    return true;
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
  
    // get So nguyen
    System.out.print("Nhap vao so nguyen: ");
    while(!sc.hasNextInt()) {
      System.out.println("Ban can nhap vao so nguyen");
      System.out.print("Nhap vao so nguyen: ");
      sc.next();
    }
    int n = sc.nextInt();
    sc.close();

    if(isPrime(n)) {
      System.out.println(n + " la so nguyen to");
    } else {
      System.out.println(n + " khong phai la so nguyen to");
    }
    System.out.println("Dang nhi phan cua " + n + " la: " + Integer.toBinaryString(n));

  }
}