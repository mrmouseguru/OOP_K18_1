import java.io.PrintWriter;
import java.util.Scanner;

public class CXInput {
	
	//ô 2
	Scanner keyboard;
	PrintWriter out;
	
	// ô 3
	CXInput(){
		 //bước 3     //bước 2
		keyboard =   new Scanner(System.in);
		out =       new PrintWriter(System.out);
		
	}
	
	CXInput(Scanner _keyboard,	PrintWriter _out)
	{
		keyboard = _keyboard;
		out = _out;
	}
	
	void input() {
		int maCX;
		out.print("[NHAP MA CHUYEN XE]:");
		out.flush();
		maCX = keyboard.nextInt();
		
		//nhập họ tên tài xế
	}
	

}
