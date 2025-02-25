
public class SinhVien {
	
	//khai báo biến
	int maSV;
	String hoTen;
	float diemLT;
	float diemTH;
	
	//khai báo và định nghĩa hàm
	SinhVien()
	{
		maSV = 0;
		hoTen = null;//giá trị rỗng
		diemLT = 0;
		diemTH = 0;
	}
	
	SinhVien(int _maSV, String _hoTen, float _diemLT,
			float _diemTH)
	{
		maSV = _maSV;
		hoTen = _hoTen;
		diemLT = _diemLT;
		diemTH = _diemTH;
		
	}
	
	float tinhDiemTrungBinh() {
		float diemTB;
		diemTB = (diemLT + diemTH)/2;
		return diemTB;
	}
	
	//toString()

}
