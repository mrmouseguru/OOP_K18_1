import java.util.Scanner;

public class AppNhanHaiSo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//KHAI BAO BIEN
		Scanner keyboardInput = null;
		int number1 = 0;
		int number2 = 0;
		int tich = 0;
		
		//NHAP VAO 2 SO
		keyboardInput = new Scanner(System.in);
		System.out.print("[NHAP SO THU NHAT]:");
		number1 = keyboardInput.nextInt();
		System.out.print("[NHAP SO THU HAI]:");
		number2 = keyboardInput.nextInt();
		
		//TINH TOAN
		tich = tinhTich2So(number1, number2);
		
		//hiển thị kết quả
		System.out.println("Tich 2 so: " + tich);

	}

	static int tinhTich2So(int a, int b){
		//tinh toan
		int tich = 0;
		tich = a * b;
		return tich;
	}
}
