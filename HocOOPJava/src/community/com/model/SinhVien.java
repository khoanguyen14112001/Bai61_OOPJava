package community.com.model;

public class SinhVien {
	private String hoTen;
	private double diem;
	public void setHoTen(String hoTen)
	{
		this.hoTen = hoTen;
	}
	public String getHoTen()
	{
		return this.hoTen;
	}
	public void setDiem(double diem)
	{
		this.diem = diem;
	}
	public double getDiem()
	{
		return this.diem;
	}
	public SinhVien(String hoTen, double diem)
	{
		this.hoTen = hoTen;
		this.diem = diem;
		System.out.println("Đây là constructor có đối số");
	}
	
	public SinhVien()
	{
		System.out.println("Đây là constructor mặc định");
		this.hoTen = "xyz";
		}

}
