package bai1;

import java.util.Scanner;

public class DiemMau extends Diem {
    private String mau;

    public DiemMau() {
        super();
        mau = new String();
    }
    public DiemMau(int x, int y, String mau) {
        super(x, y);
        this.mau = mau;
    }

    public void ganMau(String mau) {
        this.mau = mau;
    }

    public void nhapDiemMau() {
        super.nhapDiem();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap mau: ");
        mau = sc.nextLine();
    }

    public void hienThi() {
        super.hienThi();
        System.out.println("Mau: " + mau);
    }
}