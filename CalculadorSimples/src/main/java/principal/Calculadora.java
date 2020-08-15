package principal;

public class Calculadora {

	public int soma(int a, int b) {

		return a + b;
	}
	
	public int subtrai(int a, int b) {

		return a - b;
	}
	
	public int divide(int a, int b) throws Exception {

		if(b == 0) {
			throw new Exception("Impossível dividir por Zero");
		}else {
			return a / b;
		}
	}
	
	public int multiplica(int a, int b) {

		return a * b;
	}

}
