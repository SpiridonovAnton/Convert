import java.util.*;
public class Addvalue {
	private String val1, val2, sum;

	public String getVal1() {
		return val1;
	}

	public void setVal1(String val1) {
		this.val1 = val1;
	}

	public String getVal2() {
		return val2;
	}

	public void setVal2(String val2) {
		this.val2 = val2;
	}

	public String getSum() {
		return sum;
	}

	public void setSum(String sum) {
		this.sum = sum;
	}

	public void  scan() {
		System.out.println("Enter the  your source currency ");
		Scanner scn = new Scanner(System.in);
		val1=scn.next();
		System.out.println("Enter  the ultimate currency ");
		val2=scn.next();
		System.out.println("Sum");
		sum=scn.next();
		scn.close();
	}
	
	
}
