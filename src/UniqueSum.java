
public class UniqueSum {

	public static void main(String[] args) {
		
		UniqueSum nonstatic = new UniqueSum();
		System.out.println(nonstatic.uniquesum(5, 5, 5));

	}
	
	public int uniquesum(int num1, int num2, int num3) {
		if(num1 == num2 && num1 == num3) {
			return  0;
		}
		else if(num1 == num3) {
			int sum = num2;
			return sum;
		}
		else if(num2 == num3) {
			int sum = num1;
			return sum;
		}
		else if(num1 == num2) {
			int sum = num3;
			return sum;
		}
		else {
			int sum = num1 + num2 + num3;
			return sum;
		}
					
			
	}
}
