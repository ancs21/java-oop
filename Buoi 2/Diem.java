import java.util.*;

public class Diem {
    // thuoc tinh
    private int x;
    private int y;

    public void Diem() {
        this.x = 0;
        this.y = 0;
    }
    public void Diem(int x, int y) {
        this.x = x;
        this.y = y;
    }
    // nhap toa do cho diem tu ban phim
    public void nhapDiem() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap diem x: ");
        x = sc.nextInt();
        System.out.print("Nhap diem y: ");
        y = sc.nextInt();
        
    }
    // hien thi diem theo dang A(x,y)
    public void hienThi() {
        System.out.println("(" + x + "," + y + ")");
    }

    // doi diem di 1 toa do
    public void doiDiem(int dx, int dy) {
        // todo
        x += dx;
        y += dy;
    }
    // lay x
    public int giatriX() {
        return x;
    }
    // lay y
    public int giatriY() {
        return y;
    }

    // khoang cach den goc toa do
    public float khoangCach() {
        return (float)Math.sqrt(x*x + y*y);
    }

    // khoang cach den diem khac
    public float khoangCach(Diem d) {
        return (float)Math.sqrt((d.x - x) * (d.x - x) + (d.y - y) * (d.y - y));
    }

    public static void main(String[] args) {

        // tao diem A(3,4) va hien thi A
        Diem A  = new Diem();
        A.Diem(3, 4);
        System.out.print("Toa do diem A");
        A.hienThi();

        // diem B nhap tu ban phim va hien thi B
        Diem B = new Diem();
        B.nhapDiem();
        System.out.print("Toa do diem B");
        B.hienThi();

        // diem C doi xung vs B qua O va hien thi C
        Diem C = new Diem();
        C.Diem(-B.giatriX(), -B.giatriY());
        System.out.print("Toa do diem C");
        C.hienThi();

        // hien thi khoang cach tu B den O
        System.out.println("Khoang cach tu B den O: " + B.khoangCach());
        // hien thi khoang cach tu A den B
        System.out.println("Khoang cach tu A den B: " + A.khoangCach(B));
    }
}