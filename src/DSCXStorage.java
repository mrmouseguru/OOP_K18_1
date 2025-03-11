import java.util.ArrayList;

public class DSCXStorage {
	
	// ô 2
	
	
	// ô 3
	public DSCXStorage() {
		// TODO Auto-generated constructor stub
	}
	
	ArrayList<CXNoiThanh> getDSCXNoi(){
		ArrayList<CXNoiThanh> dsCXNoiThanh;
		dsCXNoiThanh = MemoryCXDB.getCXNoi();
		return dsCXNoiThanh;
	}
	
	ArrayList<CXNgoaiThanh> getDSCXNgoai(){
		return MemoryCXDB.getCXNgoai();
	}

}
