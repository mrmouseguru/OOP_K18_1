import java.util.ArrayList;

public class MemoryCXDB {
	
	//ô 2
	static ArrayList<CXNoiThanh> databaseNoiThanh 
	=  new ArrayList<CXNoiThanh>();
	
	static ArrayList<CXNgoaiThanh> databaseNgoaiThanh
	= new ArrayList<CXNgoaiThanh>();
	
	// ô 3
	static void addCXNoiThanh(CXNoiThanh cx)
	{
		databaseNoiThanh.add(cx);
	}
	
	static void addCXNgoaiThanh(CXNgoaiThanh cx) {
		databaseNgoaiThanh.add(cx);
	}
	
	static ArrayList<CXNoiThanh> getCXNoi()
	{
		return databaseNoiThanh;
	}
	
	static ArrayList<CXNgoaiThanh> getCXNgoai(){
		return databaseNgoaiThanh;
	}

}
