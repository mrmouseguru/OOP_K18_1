
public class Nhan2SoEntity {
	
	//khai báo biến
	int number1;
	int number2;
	
	//khai báo hàm
	//constructor
	Nhan2SoEntity(int _number1, int _number2){
		number1 = _number1;
		number2 = _number2;
	}
	
	int nhan2So() {
		return number1 * number2;
	}

}
