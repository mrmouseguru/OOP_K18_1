import java.io.PrintWriter;
import java.util.ArrayList;

public class DSCXOutput {

	// ô 2
	PrintWriter out;
	
	// ô 3
	DSCXOutput(){
		out = new PrintWriter(System.out);
	}
	
	// 1 tham số
	
	
	void output(ArrayList<CXNoiThanh> dsNoi, 
			ArrayList<CXNgoaiThanh> dsNgoai) {
		//code  để in
		for(CXNoiThanh cxNoi: dsNoi) {
			out.println("MA CX: " + cxNoi.maCX);
			out.flush();
		}
		
		for(CXNgoaiThanh cxNgoai : dsNgoai) {
			out.println("MA CX: " + cxNgoai.maCX);
			out.flush();
		}
	}
}
