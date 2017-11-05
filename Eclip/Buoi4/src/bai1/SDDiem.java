package bai1;

public class SDDiem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Diem A = new Diem(3,4);
		System.out.print("A");
		A.hienThi();
		
		Diem B = new Diem();
		B.nhapDiem();
		System.out.print("B");
		B.hienThi();
		
		Diem C = new Diem(-B.giaTriX(), -B.giaTriY());
		System.out.print("C");
		C.hienThi();
		
		System.out.println("Khoang B->O: " + B.khoangCach());
		System.out.println("Khoang A->B: " + A.khoangCach(B));
	}

}
