package week1.day2;

public class ArmstrongNumber {

	public static void main(String[] args) {
int input = 153;//ams number means = (1*1*1)+ (5*5*5) + (3*3*3)= 153

int orginalNum =input;
int sum = 0;


while (input > 0) {
	
	int rem = input % 10;
	
	sum= sum + (rem*rem*rem);
	
	input = input / 10;
	}

if (orginalNum == sum) {
	System.out.println("it is a armstong number");
	}
else {
	System.out.println("it is not armstong number");
}





















	}

}
