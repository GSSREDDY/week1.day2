package week1.day2;

public class Addiation {
// add indivuly  digits 123- 1+2+3 = 6
	public static void main(String[] args) {

		
	int input = 123;
			int sum = 0;
			
			while(input > 0) {
	//	    3  =  123 % 10
		int	rem = input % 10;
	//		0  =   0 + 3
			sum = sum + rem;
			
	//		123   =  123 / 10
			input = input/10;
			}
System.out.println(sum);
	}
}
	
