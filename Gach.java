package buoi3;

import java.util.*;

class Gach {

	/* 
	 * thuoc tinh
	 */
	private String maSo, color;
	private int soLuong, chieuDai, chieuRong;
	private long giaBan;

	/* 
	 * phuong thuc
	 */
	// ham xay dung
	public Gach() {
		maSo = new String();
		color = new String();
		soLuong = chieuDai = chieuRong = 0;
		giaBan = 0;
	}

	// ham xay dung sao chep
	public Gach(Gach g) {
		maSo = g.maSo;
		color = g.color;
		soLuong = g.soLuong;
		chieuDai = g.chieuDai;
		chieuRong = g.chieuRong;
		giaBan = g.giaBan;
	}
	// ham nhap thong tin cho mot hop gach
	public void nhap() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhap ma so hop gach: ");
		maSo = sc.nextLine();
		System.out.print("Nhap color hop gach: ");
		color = sc.nextLine();
		System.out.print("Nhap so luong gach trong hop: ");
		soLuong = sc.nextInt();
		System.out.print("Nhap chieu dai cua 1 vien gach trong hop: ");
		chieuDai = sc.nextInt();
		System.out.print("Nhap chieu rong cua 1 vien gach trong hop: ");
		chieuRong = sc.nextInt();
		System.out.print("Nhap gia ban cua 1 hop gach: ");
		giaBan = sc.nextLong();

		sc.close();
	}

	// ham hien thi thong tin cua mot hop gach
	public void in() {
		System.out.println("----------------In thong tin hop Gach ----------------");
		System.out.println("Ma so hop gach: " + maSo);
		System.out.println("Color hop gach: " + color);
		System.out.println("So luong gach trong hop gach: " + soLuong);
		System.out.println("Chieu dai cua 1 vien gach trong hop gach: " + chieuDai);
		System.out.println("Chieu rong cua 1 vien gach trong hop gach: " + chieuRong);
		System.out.println("Gia ban cua hop gach: " + giaBan);
		System.out.println("------------------------------------------------------");
	}

	// ham tinh gia ban le
	public float giaBanle() {
		float gia1VienGachTrongHop = giaBan / soLuong;
		float giaBanLe1VienGach = gia1VienGachTrongHop+ (float)(gia1VienGachTrongHop*0.2);
		return giaBanLe1VienGach;
	}

	// dien tich nen toi da co the lot duoc cua mot hop gach
	public int dienTichLotNen() {
		int dienTich1VienGach = chieuDai * chieuRong;
		int dienTichLotCuaHopGach = dienTich1VienGach * soLuong;
		return dienTichLotCuaHopGach;
	}

	// ham so luong hop gach it nhat can co khi lot 1 nen co dien tich la D*N
	public int soLuongHop(int D, int N) {
		int dienTichNenCanLot = D * N;
		int soLuongHopCan;
		if (dienTichNenCanLot % dienTichLotNen() == 0) {
			soLuongHopCan = dienTichNenCanLot/dienTichLotNen();
		} else {
			soLuongHopCan = dienTichNenCanLot/dienTichLotNen() + 1;
		}
		return soLuongHopCan;
	}

}