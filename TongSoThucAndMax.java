
/***************************************************************
 *
 *  Bai 3
 * 
 *  Compilation: javac TongSoThucAndMax.java
 *  Execution:   java TongSoThucAndMax
 *
 *  $ java TongSoThucAndMax 1.5 2 2.5 a 5
 *  $ Tong so thuc: 11
 *    Max: 5
 *
 *
 ***************************************************************/

 class TongSoThucAndMax {
  public static void main(String[] args) {
    float max = -9999999f;
    float f = 0f;
    float tongSoThuc = 0f;
    for(int i = 0; i < args.length; i++) {
      try {
        f = Float.parseFloat(args[i]);
      } catch (Exception e) {
        f = 0f;
      }
      tongSoThuc += f;
      if (max < f) {
        max = f;
      }
    }
    System.out.println("Tong so thuc: " + tongSoThuc);
    System.out.println("Max: " + max);
  }
 }