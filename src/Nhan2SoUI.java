import java.util.Scanner;

public class Nhan2SoUI {
	
	//khai báo biến
	Scanner keyboardInput;
	Nhan2SoEntity nhan2SoEntity;
	
	//khai báo và định nghĩa các hàm
	//hàm đặc biệt
	//dùng để khởi tạo đối tượng
	//có tên trùng tên class
	//không có kiểu dữ liệu trả về
	Nhan2SoUI(){
		keyboardInput = new Scanner(System.in);
	}
	
	void input() {
		int number1, number2, tich;
		System.out.print("[NHAP SO THU NHAT]:");
		number1 = keyboardInput.nextInt();
		System.out.print("[NHAP SO THU HAI]:");
		number2 = keyboardInput.nextInt();
		nhan2SoEntity = new Nhan2SoEntity(number1, number2);
		
		//message
		tich = nhan2SoEntity.nhan2So();
		
		//in ra màn hình
		System.out.println("Tich 2 so: " + tich);
	}

}
