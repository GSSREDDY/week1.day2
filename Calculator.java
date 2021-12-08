package week1.day2;

public class Calculator {
	public int add(int num1, int num2){
	
		return num1+num2;
		
		}

	
	public int sub(int num1, int num2) {
		return num1-num2;
		
		
	}
	
	public int mul(int num1, int num2) {
		return num1*num2;
		
		
	}
	
	public int div(int num1, int num2) {
		return num1/num2;
		
		
	}
	
	public static void main(String[] args) {

		Calculator cal = new Calculator();
		System.out.println(cal.add(20, 30));
		System.out.println(cal.sub(20, 30));
		System.out.println(cal.mul(2, 3));
		System.out.println(cal.div(4, 2));
		
	}

}
