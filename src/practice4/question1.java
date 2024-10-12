package practice4;

public class question1 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		int result = 0;
		
		char operator = '+';
		
		if(operator == '+') {
			result = num1 + num2;
		}
		else if(operator == '-') {
			result = num1 - num2;
		}
		else if(operator == '*') {
			result = num1 * num2;
		}
		else if(operator == '/') {
			result = num1 / num2;
		}
		else {
			System.out.println("오류입니다!");
		}
		
		System.out.println(result);
	}

}
