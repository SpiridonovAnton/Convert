import java.util.*;


public class Main {
	public static void main(String[] args){
		Ridefile readfile = new Ridefile();
		Map<String, Float> map = readfile.rideFile();
		Addvalue addvalue=new Addvalue();
		Calculation calculation = new Calculation(addvalue);
		addvalue.scan();
		Float result = calculation.convert(map);
		
		if(result != null){
			System.out.println("result" +" "+addvalue.getVal1()+"-"+addvalue.getVal2()+" "+ result +" " +addvalue.getVal2());
		}
		else{
			System.out.println("Invalid input parameters!!");
			
		}
	}
}
