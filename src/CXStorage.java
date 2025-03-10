
public class CXStorage {
	
	// ô 2
	
	// ô 3
	CXStorage(){
		
	}
	
	void insertCXNoiThanh(CXNoiThanh cx)
	{
		//gọi hàm thông qua tên Lớp
		//không cần phải khởi tạo đối tượng
		MemoryCXDB.addCXNoiThanh(cx);
	}
	
	void insertCXNgoaiThanh(CXNgoaiThanh cx)
	{
		MemoryCXDB.addCXNgoaiThanh(cx);
	}

}
