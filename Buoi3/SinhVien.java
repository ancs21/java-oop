import java.util.*;


public class SinhVien {
	final int M = 50;
	/*
	thuoc tinh
	*/
	String MSSV, hoTen;
	String ngaySinh;
	int soLuong, max;
	String []tenHP, diemHP;

	/*
	method
	*/
	// ham xay dung
	public SinhVien() {
		MSSV = new String();
		hoTen = new String();
		ngaySinh = new String();
		soLuong = 0;
		max = M;
		tenHP = new String[max];
		diemHP = new String[max];
	}

	// ham xay dung sao chep
	public SinhVien(SinhVien sv) {
		MSSV = sv.MSSV;
		hoTen = sv.hoTen;
		ngaySinh = sv.ngaySinh;
		soLuong = sv.soLuong;
		max = sv.max;
		tenHP = new String[sv.max];
		diemHP = new String[sv.max];
		// sao chep mon hoc va diem
		for (int i=0;i<soLuong;i++) {
			tenHP[i] = new String(sv.tenHP[i]);
			diemHP[i] = new String(sv.diemHP[i]);
		}
	}

	// nhap thong tin co ban cho 1 sinh vien'
	public void nhap() {
		Scanner sc = new Scanner(System.in);

		System.out.println("--------------");
		System.out.print("Nhap MSSV: ");
		MSSV = sc.nextLine();
		System.out.print("Nhap ho ten: ");
		hoTen = sc.nextLine();
		System.out.print("Nhap ngay sinh: ");
		ngaySinh = sc.nextLine();
		System.out.println("--------------");

	}
	// nhap diem
	public void nhapDiem() {
		Scanner sc = new Scanner(System.in);

		System.out.println("--------------");
		System.out.print("Nhap so luong hoc phan: ");
		soLuong = sc.nextInt();
		sc.nextLine();
		for(int i=0; i < soLuong; i++) {
			tenHP[i] = new String();
			System.out.print("Nhap ten hoc phan thu " + (i+1) + ": ");
			tenHP[i] = sc.nextLine();

			diemHP[i] = new String(); // cap bo nho
			System.out.print("Nhap diem cho hoc phan thu " + (i+1) + ": ");
			diemHP[i] = sc.nextLine();
		}
		System.out.println("--------------");
	}

	// in ra thong tin sinh vien use ghe de toString()
	public void in() {
		System.out.println("--------------");
		System.out.println("MSSV: " + MSSV + " -- HoTen: " + hoTen + " -- Ngay sinh: " + ngaySinh);
		System.out.println("So luong hoc phan: " + soLuong);
		for (int i=0; i<soLuong; i++) {
			System.out.println("Ten hoc phan: " + tenHP[i] + " -- Diem hoc phan: " + diemHP[i]);
		}
		System.out.println("--------------");
	}

	// ham tinh diem trung binh theo thang 4

	public float diemTB() {
		float sum = 0f, tb;
		for (int i=0; i<soLuong; i++) {
			// System.out.println(diemHP[i]);
			if (diemHP[i].compareTo("D") == 0) sum += 1f;
			else if (diemHP[i].compareTo("D+") == 0) sum += 1.5;
			else if (diemHP[i].compareTo("C") == 0) sum += 2;
			else if (diemHP[i].compareTo("C+") == 0) sum += 2.5;
			else if (diemHP[i].compareTo("B") == 0) sum += 3;
			else if (diemHP[i].compareTo("B+") == 0) sum += 3.5;
			else if (diemHP[i].compareTo("A") == 0) sum += 4;
			else sum += 0;
		}
		tb = sum/soLuong;
		return tb;
	}
	public static void main(String []args) {
		SinhVien sv1 = new SinhVien();
		sv1.nhap();
		sv1.nhapDiem();
		sv1.in();
		System.out.println("Diem tb: " + sv1.diemTB());
	}
}