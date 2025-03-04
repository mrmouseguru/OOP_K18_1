
public class CXNoiThanh extends ChuyenXe {
	
	//ô 2
	float soKm;
	int soTuyen;
	
	//ô 3
	CXNoiThanh(){
		
	}
	
	CXNoiThanh(int _maCX, String _hoTen, String _soXe,
			double _donGia, float _soKm, int _soTuyen)
	{
		//gọi đến hàm khởi tạo đối tượng 4 tham số
		//của cha
		super(_maCX, _hoTen, _soXe, _donGia);
		//của chính nó
		soKm = _soKm;
		soTuyen = _soTuyen;
		
	}
	
	double tinhDoanhThu() {
		double doanhThu;
		doanhThu = donGia * soKm;
		return doanhThu;
	}

}
