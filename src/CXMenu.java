import java.io.PrintWriter;
import java.util.Scanner;

public class CXMenu {
	
	// ô 2
	PrintWriter out;
	Scanner in;
	String prompt;
	CXInput cxInput;
	// ô 3
	CXMenu(){
		out = new PrintWriter(System.out);
		in = new Scanner(System.in);
		prompt = "->";
		cxInput = new CXInput();
	}
	
	CXMenu(PrintWriter _out, Scanner _in, 
	String _prompt){
		out = _out;
		in = _in;
		prompt = _prompt;
	}
	
	CXMenu(PrintWriter _out, Scanner _in, 
			String _prompt, CXInput _cxInput){
				//out = _out;
				//in = _in;
				//prompt = _prompt;
		//gọi lại hàm khởi tạo 3 tham số của chính nó
				this(_out, _in, _prompt);
				cxInput = _cxInput;
			}
	
	void controlLoop() {
		String command = " ";
		out.println("gõ lệnh \"help\" để được hỗ trợ!");
		out.flush();
		while(true) {
			out.print(prompt);
			out.flush();
			command = in.nextLine();//"help"
			//cắt khoảng trắng
			command = command.trim();
			//kiểm tra
			if("help".equalsIgnoreCase(command)) {
				help();
				continue;//tiếp tục menu
			}
			
			if("about".equalsIgnoreCase(command)) {
				about();
				continue;
			}
			
			if("add".equalsIgnoreCase(command)) {
				add();
				continue;
			}
			
		}
	}
	
	void add() {
		//gửi thông điệp đến
		//dối tượng CXInput
		//thông qua hành vi input()
		cxInput.input();
	}
	
	void about() {
		//code
	}
	
	void help() {
		out.println("~~~~~~~~User Help Menu~~~~~~~~");
		out.flush();
		out.println("[HELP] huong dan su dung phan mem");
		out.flush();
		out.println("[ABOUT] thong tin ve PM quan lý chuyến xe");
		out.flush();
		out.println("[ADD] them mới một chuyến xe");
		out.flush();
		out.println("[PRINT] in tất cả chuyến xe");
		out.flush();
		out.println("[EXIT] thoát khỏi phần mềm");
		out.flush();
		out.println("~~~~~~~~User Help Menu~~~~~~~~");
		out.flush();
	}

}
