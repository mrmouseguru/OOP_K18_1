import java.util.Scanner;

public class AppHCN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//khai báo biến
		Scanner keyboardInput;
		float chieuDai, chieuRong;
		HinhChuNhat hcn;
		float dienTich;
		float chuVi;
		//input
		keyboardInput  = new Scanner(System.in);
		System.out.print("[NHAP CHIEU DAI]:");
		chieuDai = keyboardInput.nextFloat();
		System.out.print("[NHAP CHIEU RONG]:");
		chieuRong = keyboardInput.nextFloat();
		
		//TÍNH TOÁN
		//GỌI HÀM tinhDienTich(), tinhChuVi() của 
		//class HinhChuNhat
		//khởi tạo đối tượng HinhChuNhat
		hcn = new HinhChuNhat(chieuDai, chieuRong);
		dienTich = hcn.tinhDienTich();
		chuVi = hcn.tinhChuVi();
		
		//hiển thị ra màn hình
		System.out.println("Dien tich: " + dienTich);
		System.out.println("Chu vi: " + chuVi);
	}

}
