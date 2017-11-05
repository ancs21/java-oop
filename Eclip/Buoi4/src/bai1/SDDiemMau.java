package bai1;

public class SDDiemMau {

	public static void main(String[] args) {
//		DiemMau A = new DiemMau(5, 10, "trang");
//		System.out.print("A");
//		A.hienThi();
//		
//		DiemMau B = new DiemMau();
//		B.nhapDiemMau();
//		
//		B.doiDiem(10, 8);
//		System.out.print("B");
//		B.hienThi();
//		B.ganMau("Vang");
//		System.out.print("B");
//		B.hienThi();
//		
		Diem d = new Diem(3,5);
		Diem dm = new DiemMau(6,8,"xanh");
		
		d = dm;
		d.hienThi();
	}

}
