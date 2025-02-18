
public class HinhChuNhat {

	//khai báo các biến
	float chieuDai;
	float chieuRong;
	
	//khai báo và định nghĩa các hàm
	HinhChuNhat(){
		//code
		chieuDai = 0;
		chieuRong = 0;
	}
	
	HinhChuNhat(float _chieuDai, float _chieuRong)
	{
		//code
		chieuDai = _chieuDai;
		chieuRong = _chieuRong;
	}
	
	float tinhDienTich()
	{
		float dienTich;
		dienTich = chieuDai * chieuRong;
		return dienTich;
		
	}
	
	float tinhChuVi() {
		float chuVi;
		chuVi = (chieuDai + chieuRong) * 2;
		return chuVi;
		
	}
	
	
}
