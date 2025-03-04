
public class CXNgoaiThanh extends ChuyenXe{
	
	//ô 2
	int soNgayDi;
	String noiDen;
	
	//ô3
	CXNgoaiThanh(){
		
	}
	
	CXNgoaiThanh(int _maCX, String _hoTen, String _soXe,
			double _donGia, float _soKm, 
			int _soNgayDi, String _noiDen){
		super(_maCX, _hoTen, _soXe, _donGia);
		soNgayDi = _soNgayDi;
		noiDen = _noiDen;
	}
	
	double tinhDoanhThu() {
		double doanhThu;
		doanhThu = donGia * soNgayDi;
		return doanhThu;
	}

}
