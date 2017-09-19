import java.util.*;

class Date {

    /* 
     * thuoc tinh
     */
    private int ngay;
    private int thang;
    private int nam;

    /* 
     * phuong thuc
     */

    // ham xay dung Date() va Date(int, int, int)
    public Date() {
        ngay = 1;
        thang = 1;
        nam = 1970;
    }
    public Date(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }
    // ham hien thi thong tin theo dinh dang ngay/thang/nam
    public void hienThiDate() {
        System.out.println(ngay + "/" + thang + "/" + nam);
    }
    // ham nhap tu ban phim, neu khong hop le thi nhap lai
    public void nhapNgay() {
        Scanner sc = new Scanner(System.in);

        // lay ngay
        do {
            if (ngay < 1 || ngay > 31) {
                System.out.println("Can nhap dung ngay, vui long nhap lai ");
            }
            System.out.print("Nhap ngay (1-31): ");
            while(!sc.hasNextInt()) {
                System.out.println("Can nhap dung ngay, vui long nhap lai ");
                System.out.print("Nhap ngay (1-31): ");
                sc.next();
            }
            ngay = sc.nextInt();
        } while (ngay < 1 || ngay > 31);
        
        // lay thang
        do {
            if (thang < 1 || thang > 12) {
                System.out.println("Can nhap dung thang, vui long nhap lai ");
            }
            System.out.print("Nhap thang (1-12): ");
            while(!sc.hasNextInt()) {
                System.out.println("Can nhap dung thang, vui long nhap lai ");
                System.out.print("Nhap thang (1-12): ");
                sc.next();
            }
            thang = sc.nextInt();
        } while (thang < 1 || thang > 12);
        
        // lay nam
        do {
            if (nam < 1000 || nam >= 9999) {
                System.out.println("Can nhap dung nam, vui long nhap lai ");
            }
            System.out.print("Nhap nam (4 chu so): ");
            while(!sc.hasNextInt()) {
                System.out.println("Can nhap dung nam, vui long nhap lai ");
                System.out.print("Nhap nam (4 chu so): ");
                sc.next();
            }
            nam = sc.nextInt();
        } while (nam < 1000 || nam >= 9999);

    }
    // ham kiem tra ngay co hop le k boolean hopLe()
    public boolean hopLe() {
        int max_ngay[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        boolean h = false;
        if(nam % 4 == 0 && nam % 100 != 0 || nam % 400 == 0) max_ngay[1] = 29;
        if(
            (thang == 1 && ngay <= max_ngay[0]) ||
            (thang == 2 && ngay <= max_ngay[1]) ||
            (thang == 3 && ngay <= max_ngay[2]) ||
            (thang == 4 && ngay <= max_ngay[3]) ||
            (thang == 5 && ngay <= max_ngay[4]) ||
            (thang == 6 && ngay <= max_ngay[5]) ||
            (thang == 7 && ngay <= max_ngay[6]) ||
            (thang == 8 && ngay <= max_ngay[7]) ||
            (thang == 9 && ngay <= max_ngay[8]) ||
            (thang == 10 && ngay <= max_ngay[9]) ||
            (thang == 11 && ngay <= max_ngay[10]) ||
            (thang == 12 && ngay <= max_ngay[11])
        ) {
            h = true;
        }
        return h;
    }
    // ham tinh ra ngay hom sau Date ngayHomSau();

    // ham cong 1 ngay vs so ngay nao do Date congNgay(int n)

    // ham main
    public static void main(String[] args) {
        // System.out.println("Helloo world");
        Date d = new Date();
        d.nhapNgay();
        if(d.hopLe()) {
            d.hienThiDate();
        }
        
    }

}