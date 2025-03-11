import java.util.ArrayList;

public class DSCXControl {
	
	// ô 2
	DSCXStorage dscxStorage;
	DSCXOutput dscxOutput;
	
	// ô 3
	DSCXControl(){
		dscxStorage = new DSCXStorage();
		dscxOutput = new DSCXOutput();
	}
	
	//có 2 tham số

	void printDSCX() {
		//gửi thông điệp đối tượng DSCXStorage
		ArrayList<CXNoiThanh> dsCXNoi;
		ArrayList<CXNgoaiThanh> dsCXNgoai;
		dsCXNoi =  dscxStorage.getDSCXNoi();
		dsCXNgoai = dscxStorage.getDSCXNgoai();
		
		//gửi thông điệp đến 
		//dối tượng DSCXOutput
		dscxOutput.output(dsCXNoi, dsCXNgoai);
	}
}
