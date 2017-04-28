

public class NumberCheck {
public static void main (String [] args){
consecutiveCheck check = new consecutiveCheck(78);
	
}
}
class UserMainCode
{
	static boolean consecutiveCheck(int input1){
		int num = input1;
		int digit_one, digit_two;
		digit_one = num % 10;
		digit_two = (num - digit_one)/10;
		digit_two++;
		
		//boolean result;
		if (digit_one == digit_two)
			{
			System.out.println("True is answer");
		}
		else {
			System.out.println("False is answer");
		}
		return true;
	}
}
