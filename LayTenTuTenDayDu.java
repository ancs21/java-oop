
/***************************************************************
 *
 *  Bai 7
 * 
 *  Compilation: javac LayTenTuTenDayDu.java
 *  Execution:   java LayTenTuTenDayDu
 *
 *  $ java LayTenTuTenDayDu
 *  $ Nhap vao ho ten: Nguyen Van Hai
 *    Ten cua ban: Hai
 *
 *
 ***************************************************************/

 import java.io.*;
 import java.util.*;

class LayTenTuTenDayDu {

  // ham tach ten
  public static String tachTen(String s) {
    String ten = s.substring(s.lastIndexOf(" ") + 1);
    return ten;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // get ho ten
    System.out.print("Nhap vao ho ten: ");
    String hoTen = sc.nextLine();
    sc.close();

    System.out.println("Ten cua ban: " + tachTen(hoTen));
  }
 }