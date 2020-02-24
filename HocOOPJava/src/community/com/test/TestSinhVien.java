package community.com.test;

import community.com.model.SinhVien;

public class TestSinhVien {

	public static void main(String[] args) {
		SinhVien obama = new SinhVien();
		SinhVien putin = new SinhVien("Ông Putin", 10);
		System.out.println("Điểm Putin =" + putin.getDiem());
		obama.setHoTen("Obatashi");
		System.out.println("Tên Obama = " + obama.getHoTen());
	}

}
