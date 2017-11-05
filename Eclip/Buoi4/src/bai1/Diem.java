package bai1;
import java.util.*;

public class Diem {
	private int x,y;
    public Diem() {
        x = y = 0;
    }
    public Diem(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void nhapDiem() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap x = ");
        x = sc.nextInt();
        System.out.print("Nhap y = ");
        y = sc.nextInt();
    }

    public void hienThi() {
        System.out.println("(x,y) = (" + x + "," + y + ")" );
    }

    public void doiDiem(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public int giaTriX() {
        return x;
    }
    
    public int giaTriY() {
        return y;
    }

    public float khoangCach() {
        return (float) Math.sqrt(x*x + y*y);
    }

    public float khoangCach(Diem d) {
        return (float) Math.sqrt((x - d.x)*(x - d.x) + (y - d.y)*(y - d.y));
    }
}
